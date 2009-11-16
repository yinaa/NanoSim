package com.nanosim.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.nanosim.client.event.ILoginHandler;
import com.nanosim.model.Person;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class NanoSim implements EntryPoint, ResizeHandler {

	private CookieHelper cookieHelper = CookieHelper.Util.getInstance();

	private static NanoSim instance;

	public static NanoSim getInstance() {
		if (instance == null) {
			instance = GWT.create(NanoSim.class);
		}
		return instance;
	}

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		instance = this;

		SigninScreen loginScreen = new SigninScreen();
		loginScreen.addLoginHandler(new ILoginHandler() {

			@Override
			public void OnSuccess(Person p) {
				cookieHelper.setIsLoggedIn(true);
				initHomeScreen(p);
			}
		});
		RootPanel.get().add(loginScreen);
	}

	private HomeScreen homeScreen;

	private void initHomeScreen(Person p) {

		homeScreen = new HomeScreen(p, this);

		// Hook the window resize event, so that we can adjust the UI.
		Window.addResizeHandler(this);

		// Get rid of scrollbars, and clear out the window's built-in margin,
		// because we want to take advantage of the entire client area.
		Window.enableScrolling(true);
		Window.setMargin("0px");

		// Finally, add the outer panel to the RootPanel, so that it will be
		// displayed.
		RootPanel.get().clear();
		RootPanel.get().add(homeScreen);

		// Call the window resized handler to get the initial sizes setup.
		// Doing this in a deferred command causes it to occur after all
		// widgets' sizes have been computed by the browser.
		DeferredCommand.addCommand(new Command() {
			public void execute() {
				onWindowResized(homeScreen, Window.getClientWidth(), Window
						.getClientHeight());
			}
		});

		onWindowResized(homeScreen, Window.getClientWidth(), Window
				.getClientHeight());
	}

	@Override
	public void onResize(ResizeEvent event) {
		onWindowResized(homeScreen, event.getWidth(), event.getHeight());
	}

	public void onWindowResized(HomeScreen homeScreen, int width, int height) {
		if (homeScreen != null) {
			// Adjust the shortcut panel and detail area to take up the
			// available room in the window.
			int shortcutHeight = height - homeScreen.leftPanel.getAbsoluteTop()
					- 8;
			if (shortcutHeight < 1) {
				shortcutHeight = 1;
			}
			homeScreen.leftPanel.setHeight(shortcutHeight + "px");

			// Give the right panel widget a chance to resize itself as well.
			homeScreen.rightPanel.setPixelSize(width, height);
		}
	}
}