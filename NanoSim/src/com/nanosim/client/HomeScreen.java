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
package com.nanosim.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratedStackPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.nanosim.client.content.mail.CwInbox;
import com.nanosim.client.content.mail.CwMail;
import com.nanosim.client.content.other.CwAnimation;
import com.nanosim.client.content.other.CwCookies;
import com.nanosim.client.content.tables.CwFlexTable;
import com.nanosim.client.content.tables.CwGrid;
import com.nanosim.model.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HomeScreen extends Composite implements ClickHandler {
	/**
	 * The type passed into the
	 * {@link com.Nanosim.Nanosim.NanosimGenerator}.
	 */
	private static final class GeneratorInfo {
	}

	/**
	 * The static images used throughout Nanosim.
	 */
	public static final NanosimImages images = (NanosimImages) GWT.create(NanosimImages.class);

	/**
	 * The static constants used throughout Nanosim.
	 */
	NanosimConstants constants = (NanosimConstants) GWT.create(NanosimConstants.class);

	/**
	 * The current style theme.
	 */
	public static String CUR_THEME = NanosimConstants.STYLE_THEME;

	/**
	 * The {@link Application}.
	 */
	private Application app = new Application();

	/**
	 * A mapping of history tokens to their associated menu items.
	 */
	private Map<String, TreeItem> itemTokens = new HashMap<String, TreeItem>();

	/**
	 * A mapping of menu items to the widget display when the item is selected.
	 */
	private Map<TreeItem, ContentWidget> itemWidgets = new HashMap<TreeItem, ContentWidget>();

	public HomeScreen(Person person, Nanosim Nanosim) {
		// Generate the source code and css for the examples
		GWT.create(GeneratorInfo.class);

		// Swap out the style sheets for the RTL versions if needed.
		updateStyleSheets();

		// Create the application
		setupTitlePanel(constants);
		setupLinks(constants);
		setupOptionsPanel();
		setupMainMenu(constants);

		// Setup a history handler to reselect the associate menu item
		final ValueChangeHandler<String> historyHandler = new ValueChangeHandler<String>() {
			public void onValueChange(ValueChangeEvent<String> event) {
				TreeItem item = itemTokens.get(event.getValue());
				if (item == null) {
					item = app.getMainMenu().getItem(0).getChild(0);
				}

				// Select the associated TreeItem
				app.getMainMenu().setSelectedItem(item, false);
				app.getMainMenu().ensureSelectedItemVisible();

				// Show the associated ContentWidget
				displayContentWidget(itemWidgets.get(item));
			}
		};
		History.addValueChangeHandler(historyHandler);

		// Add a handler that sets the content widget when a menu item is selected
		app.addSelectionHandler(new SelectionHandler<TreeItem>() {
			public void onSelection(SelectionEvent<TreeItem> event) {
				TreeItem item = event.getSelectedItem();
				ContentWidget content = itemWidgets.get(item);
				if (content != null && !content.equals(app.getContent())) {
					History.newItem(getContentWidgetToken(content));
				}
			}
		});

		// Show the initial example
		if (History.getToken().length() > 0) {
			History.fireCurrentHistoryState();
		} else {
			// Use the first token available
			TreeItem firstItem = app.getMainMenu().getItem(0).getChild(0);
			app.getMainMenu().setSelectedItem(firstItem, false);
			app.getMainMenu().ensureSelectedItemVisible();
			displayContentWidget(itemWidgets.get(firstItem));
		}
	}

	/**
	 * Set the content to the {@link ContentWidget}.
	 * 
	 * @param content the {@link ContentWidget} to display
	 */
	private void displayContentWidget(ContentWidget content) {
		if (content != null) {
			app.setContent(content);
			app.setContentTitle(content.getTabBar());
		}
	}

	/**
	 * Get the token for a given content widget.
	 * 
	 * @return the content widget token.
	 */
	private String getContentWidgetToken(ContentWidget content) {
		String className = content.getClass().getName();
		className = className.substring(className.lastIndexOf('.') + 1);
		return className;
	}

	/**
	 * Create the links at the top of the application.
	 * 
	 */
	HTML signOutLink = new HTML("<a href='javascript:;'>Sign Out</a>");
	HTML aboutLink = new HTML("<a href='javascript:;'>About</a>");
	private void setupLinks(NanosimConstants constants) {
		// Link to About
		app.addLink(aboutLink);
		aboutLink.addClickHandler(this);

		// Link to SignOut
		app.addLink(signOutLink);
		signOutLink.addClickHandler(this);
	}

	public void onClick(ClickEvent event) {
		Object sender = event.getSource();
		if (sender == signOutLink) {
			//Nanosim.getInstance().Logout();
		} else if (sender == aboutLink) {
			DialogBox dlg = AboutBox();
			dlg.show();
			dlg.center();
		}
	} 


	/**
	 * Setup all of the options in the main menu.
	 * 
	 * @param constants the constant values to use
	 */
	private void setupMainMenu(NanosimConstants constants) {
		DecoratedStackPanel mainMenu = new DecoratedStackPanel();
		Tree treeMenu = app.getMainMenu();

		// Create the groups within the stack panel.
		// Mail		
		mainMenu.add(new CwMail(), createHeaderHTML(images.catMail(), "Mail"), true);
		TreeItem catMail = treeMenu.addItem(images.catMail().getHTML() + constants.categoryMail());
		setupMainMenuOption(catMail, new CwInbox(constants), images.catMail());
	
		// Tables
		TreeItem catTables = treeMenu.addItem(constants.categoryTables());
		setupMainMenuOption(catTables, new CwGrid(constants), images.catTables());
		setupMainMenuOption(catTables, new CwFlexTable(constants),
				images.catTables());

		// Other
		TreeItem catOther = treeMenu.addItem(constants.categoryOther());
		setupMainMenuOption(catOther, new CwAnimation(constants), images.catOther());
		setupMainMenuOption(catOther, new CwCookies(constants), images.catOther());
	}

	/**
	 * Add an option to the main menu.
	 * 
	 * @param parent the {@link TreeItem} that is the option
	 * @param content the {@link ContentWidget} to display when selected
	 * @param image the icon to display next to the {@link TreeItem}
	 */
	private void setupMainMenuOption(TreeItem parent, ContentWidget content,
			AbstractImagePrototype image) {
		// Create the TreeItem
		TreeItem option = parent.addItem(image.getHTML() + " " + content.getName());

		// Map the item to its history token and content widget
		itemWidgets.put(option, content);
		itemTokens.put(getContentWidgetToken(content), option);
	}

	/**
	 * Create the options that appear next to the title.
	 */
	private void setupOptionsPanel() {
		// Get the title from the internationalized constants
		//TODO add user name
		String pageTitle = constants.welcome() + "user";
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		vPanel.getElement().setAttribute("align", "right");
		app.setOptionsWidget(vPanel);
		vPanel.add(new HTML(pageTitle));
	}

	/**
	 * Create the title bar at the top of the application.
	 * 
	 * @param constants the constant values to use
	 */
	private void setupTitlePanel(NanosimConstants constants) {
		// Get the title from the internationalized constants
		String pageTitle = "<h1>" + constants.mainTitle() + "</h1><h2>"
		+ constants.mainSubTitle() + "</h2>";

		// Add the title and some images to the title bar
		VerticalPanel titlePanel = new VerticalPanel();
		titlePanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		titlePanel.add(images.logo().createImage());
		titlePanel.add(new HTML(pageTitle));
		app.setTitleWidget(titlePanel);
	}

	/**
	 * Creates an HTML fragment that places an image & caption together, for use
	 * in a group header.
	 * 
	 * @param imageProto
	 *            an image prototype for an image
	 * @param caption
	 *            the group caption
	 * @return the header HTML fragment
	 */
	private String createHeaderHTML(AbstractImagePrototype imageProto,
			String caption) {
		String captionHTML = "<table class='caption' cellpadding='0' cellspacing='0'>"
			+ "<tr><td class='lcaption'>"
			+ imageProto.getHTML()
			+ "</td><td class='rcaption'><b style='white-space:nowrap'>"
			+ caption + "</b></td></tr></table>";
		return captionHTML;
	}
	
	/**
	 * Update the style sheets to reflect the current theme and direction.
	 */
	private void updateStyleSheets() {
		// Generate the name of the style sheet to include
		String gwtStyleSheet = "gwt/" + CUR_THEME + "/" + CUR_THEME + ".css";
		String NanosimStyleSheet = CUR_THEME + "/Nanosim.css";

		// Load the GWT theme style sheet
		String modulePath = GWT.getModuleBaseURL();
		Command callback = new Command() {
			private int numStyleSheetsLoaded = 0;

			public void execute() {
				// Wait until all style sheets have loaded before re-attaching the app
				numStyleSheetsLoaded++;
				if (numStyleSheetsLoaded < 2) {
					return;
				}
				RootPanel.getBodyElement().getStyle().setProperty("display", "none");
				RootPanel.getBodyElement().getStyle().setProperty("display", "");
				RootPanel.get().add(app);
			}
		};

		StyleSheetLoader.loadStyleSheet(modulePath + gwtStyleSheet,
				"gwt" + "-Reference-" + CUR_THEME, callback);
		// Load the Nanosim specific style sheet after the GWT theme style sheet so
		// that custom styles supercede the theme styles.
		StyleSheetLoader.loadStyleSheet(modulePath + NanosimStyleSheet,
				"Application" + "-Reference-" + CUR_THEME, callback);
	}

	private DialogBox AboutBox() {
		// Create a dialog box and set the caption text
		final DialogBox aboutBox = new DialogBox();
		aboutBox.setText(constants.cwAboutBoxTitle());

		// Create a VerticalPanel to contain the 'about' label and the 'OK' button.
		VerticalPanel outer = new VerticalPanel();
		outer.add(new HTML(constants.cwAboutBoxMessage()));
		outer.add(new Button("Close", new ClickHandler() {
			public void onClick(ClickEvent event) {
				aboutBox.hide();
			}
		}));
		aboutBox.setWidget(outer);
		// Return the about box
		return aboutBox;
	}

}
