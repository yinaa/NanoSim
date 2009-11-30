/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.nanosim.client.content.other;

import com.google.gwt.animation.client.Animation;
import com.google.gwt.i18n.client.Constants;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.nanosim.client.ContentWidget;
import com.nanosim.client.Nanosim;
import com.nanosim.client.NanosimAnnotations.NanosimData;
import com.nanosim.client.NanosimAnnotations.NanosimSource;

/**
 * Example file.
 */
public class CwAnimation extends ContentWidget {
  /**
   * A custom animation that moves a small image around a circle in an
   * {@link AbsolutePanel}.
   */
  @NanosimSource
  public class CustomAnimation extends Animation {
    /**
     * The x-coordinate of the center of the circle.
     */
    private int centerX = 120;

    /**
     * The y-coordinate of the center of the circle.
     */
    private int centerY = 120;

    /**
     * The radius of the circle.
     */
    private int radius = 100;

    @Override
    protected void onComplete() {
      super.onComplete();
      startButton.setEnabled(true);
      cancelButton.setEnabled(false);
    }

    @Override
    protected void onStart() {
      super.onStart();
      startButton.setEnabled(false);
      cancelButton.setEnabled(true);
    }

    @Override
    protected void onUpdate(double progress) {
      double radian = 2 * Math.PI * progress;
      updatePosition(animateeLeft, radian, 0);
      updatePosition(animateeBottom, radian, 0.5 * Math.PI);
      updatePosition(animateeRight, radian, Math.PI);
      updatePosition(animateeTop, radian, 1.5 * Math.PI);
    }

    /**
     * Update the position of the widget, adding a rotational offset.
     * 
     * @param w the widget to move
     * @param radian the progress in radian
     * @param offset the offset in radian
     */
    private void updatePosition(Widget w, double radian, double offset) {
      radian += offset;
      double x = radius * Math.cos(radian) + centerX;
      double y = radius * Math.sin(radian) + centerY;
      absolutePanel.setWidgetPosition(w, (int) x, (int) y);
    }
  }

  /**
   * The constants used in this Content Widget.
   */
  @NanosimSource
  public static interface CwConstants extends Constants,
      ContentWidget.CwConstants {
    @DefaultStringValue("Cancel")
    String cwAnimationCancel();

    String cwAnimationDescription();

    String cwAnimationName();

    @DefaultStringValue("Animation Options")
    String cwAnimationOptions();

    @DefaultStringValue("Start")
    String cwAnimationStart();
  }

  /**
   * The absolute panel used in the example.
   */
  @NanosimData
  private AbsolutePanel absolutePanel = null;

  /**
   * The widget that is being animated.
   */
  @NanosimData
  private Widget animateeBottom = null;

  /**
   * The widget that is being animated.
   */
  @NanosimData
  private Widget animateeLeft = null;

  /**
   * The widget that is being animated.
   */
  @NanosimData
  private Widget animateeRight = null;

  /**
   * The widget that is being animated.
   */
  @NanosimData
  private Widget animateeTop = null;

  /**
   * The instance of an animation.
   */
  @NanosimData
  private CustomAnimation animation = null;

  /**
   * The {@link Button} used to cancel the {@link Animation}.
   */
  @NanosimData
  private Button cancelButton = null;

  /**
   * An instance of the constants.
   */
  @NanosimData
  private CwConstants constants;

  /**
   * The {@link Button} used to start the {@link Animation}.
   */
  @NanosimData
  private Button startButton = null;

  /**
   * Constructor.
   * 
   * @param constants the constants
   */
  public CwAnimation(CwConstants constants) {
    super(constants);
    this.constants = constants;
  }

  @Override
  public String getDescription() {
    return constants.cwAnimationDescription();
  }

  @Override
  public String getName() {
    return constants.cwAnimationName();
  }

  @Override
  public boolean hasStyle() {
    return false;
  }

  /**
   * Initialize this example.
   */
  @NanosimSource
  @Override
  public Widget onInitialize() {
    // Create a new panel
    absolutePanel = new AbsolutePanel();
    absolutePanel.setSize("250px", "250px");
    absolutePanel.ensureDebugId("cwAbsolutePanel");

    // Add a widget that we will animate
    animateeTop = Nanosim.images.logo().createImage();
    animateeBottom = Nanosim.images.logo().createImage();
    animateeLeft = Nanosim.images.logo().createImage();
    animateeRight = Nanosim.images.logo().createImage();
    absolutePanel.add(animateeTop);
    absolutePanel.add(animateeBottom);
    absolutePanel.add(animateeLeft);
    absolutePanel.add(animateeRight);

    // Wrap the absolute panel in a DecoratorPanel
    DecoratorPanel absolutePanelWrapper = new DecoratorPanel();
    absolutePanelWrapper.setWidget(absolutePanel);

    // Create the options bar
    DecoratorPanel optionsWrapper = new DecoratorPanel();
    optionsWrapper.setWidget(createOptionsBar());

    // Add the components to a panel and return it
    HorizontalPanel mainLayout = new HorizontalPanel();
    mainLayout.setSpacing(10);
    mainLayout.add(optionsWrapper);
    mainLayout.add(absolutePanelWrapper);

    // Create the custom animation
    animation = new CustomAnimation();

    // Set the start position of the widgets
    animation.onComplete();

    // Return the layout
    return mainLayout;
  }

  /**
   * Create an options panel that allows users to select a widget and reposition
   * it.
   * 
   * @return the new options panel
   */
  @NanosimSource
  private Widget createOptionsBar() {
    // Create a panel to move components around
    VerticalPanel optionsBar = new VerticalPanel();
    optionsBar.setSpacing(5);
    optionsBar.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

    // Add a title
    optionsBar.add(new HTML("<b>" + constants.cwAnimationOptions() + "</b>"));

    // Add start button
    startButton = new Button(constants.cwAnimationStart());
    startButton.addStyleName("sc-FixedWidthButton");
    startButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        animation.run(2000);
      }
    });
    optionsBar.add(startButton);

    // Add cancel button
    cancelButton = new Button(constants.cwAnimationCancel());
    cancelButton.addStyleName("sc-FixedWidthButton");
    cancelButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        animation.cancel();
      }
    });
    optionsBar.add(cancelButton);

    // Return the options bar
    return optionsBar;
  }

}
