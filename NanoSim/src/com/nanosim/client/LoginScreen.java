package com.nanosim.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.nanosim.client.event.ILoginHandler;
import com.nanosim.client.internal.EventHandlerCollection;
import com.nanosim.client.rpc.LoginService;
import com.nanosim.client.rpc.LoginServiceAsync;
import com.nanosim.model.Person;

public class LoginScreen extends Composite {

	private EventHandlerCollection<ILoginHandler> loginHandlerColl = new EventHandlerCollection<ILoginHandler>();

	private final LoginServiceAsync loginService = LoginService.Util
			.getInstance();

	public LoginScreen() {
		DockPanel dock = new DockPanel();
		dock.setSpacing(4);
		dock.setHorizontalAlignment(DockPanel.ALIGN_CENTER);

		// Create a Flex Table
		final FlexTable flexTable = new FlexTable();
		FlexCellFormatter cellFormatter = flexTable.getFlexCellFormatter();
		flexTable.addStyleName("cw-FlexTable");
		flexTable.setWidth("32em");
		flexTable.setCellSpacing(5);
		flexTable.setCellPadding(3);

		// Add some text
		cellFormatter.setHorizontalAlignment(0, 1,
				HasHorizontalAlignment.ALIGN_LEFT);
		// Label lblMsg = new Label();
		// flexTable.setHTML(0, 0, lblMsg);
		cellFormatter.setColSpan(0, 0, 2);

		final Label lblUsername = new Label();
		lblUsername.setText("Username: ");
		flexTable.setWidget(1, 0, lblUsername);

		final TextBox txtUsername = new TextBox();
		flexTable.setWidget(1, 1, txtUsername);

		final Label lblPassword = new Label();
		lblPassword.setText("Password: ");
		flexTable.setWidget(2, 0, lblPassword);

		final PasswordTextBox txtPassowrd = new PasswordTextBox();
		flexTable.setWidget(2, 1, txtPassowrd);

		Button btnSignin = new Button("Sign in");
		flexTable.setWidget(3, 0, btnSignin);
		cellFormatter.setColSpan(3, 0, 2);
		btnSignin.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				String userName = txtUsername.getText();
				String password = txtPassowrd.getText();

				if (userName == null || userName.equals("")) {
					flexTable.setHTML(0, 0, "Username not found.");
				} else if (password == null || password.equals("")) {
					flexTable.setHTML(0, 0, "Password not found.");
				} else {
					loginService.signin(userName, password,
							new AsyncCallback<Person>() {

								@Override
								public void onFailure(Throwable caught) {
									flexTable.setHTML(0, 0,
											"Authentication failed !!!");
								}

								@Override
								public void onSuccess(Person result) {
									if (result == null) {
										flexTable.setHTML(0, 0,
												"Authentication failed !!!");
									} else {
										flexTable.setHTML(0, 0, "");
										for (ILoginHandler handler : loginHandlerColl
												.getList()) {
											handler.OnSuccess(result);
										}
									}
								}
							});
				}
			}
		});

		dock.add(flexTable, DockPanel.CENTER);
		initWidget(dock);
	}

	public void addLoginHandler(ILoginHandler handler) {
		loginHandlerColl.addListener(handler);
	}

	public void removeLoginHandler(ILoginHandler handler) {
		loginHandlerColl.removeListener(handler);
	}
}
