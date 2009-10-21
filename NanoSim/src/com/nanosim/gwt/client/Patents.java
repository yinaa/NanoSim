package com.nanosim.gwt.client;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Composite that represents a collection of <code>Task</code> items.
 */
public class Patents extends Composite {

  public Patents() {
    SimplePanel panel = new SimplePanel();
    VerticalPanel list = new VerticalPanel();
    panel.setWidget(list);
    list.add(new CheckBox("TODO toolbox"));
    initWidget(panel);
    setStyleName("nanosim-Research");
  }

}
