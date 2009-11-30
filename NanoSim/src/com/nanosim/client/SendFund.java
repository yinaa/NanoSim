package com.nanosim.client;

import java.util.Date;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.nanosim.client.event.ILoginHandler;
import com.nanosim.client.internal.EventHandlerCollection;
import com.nanosim.client.rpc.SigninService;
import com.nanosim.client.rpc.SigninServiceAsync;
import com.nanosim.client.rpc.TransferService;
import com.nanosim.client.rpc.TransferServiceAsync;
import com.nanosim.model.Budget;

/**
 * Composite that represents a collection of <code>Task</code> items.
 */
public class SendFund extends Composite {

	private final TransferServiceAsync transferService = TransferService.Util
			.getInstance();

/*	public SendFund() {
		SimplePanel panel = new SimplePanel();
		VerticalPanel list = new VerticalPanel();
		panel.setWidget(list);
		list.add(new CheckBox("See the status"));
		list.add(new CheckBox("Send Fund"));
		initWidget(panel);
		setStyleName("NanoSim-Research");

	}*/
	

	public void insertDatabase(Double credit) {
		Date now = new Date();
		System.out.println(now.getTime());
		Budget b[] = new Budget[1];
		b[0] = new Budget(now, credit);

		transferService.insertBudget(b[0], new AsyncCallback<Budget>() {
			@Override
			public void onFailure(Throwable ex) {
				System.out.println("Fail");
			}

			@Override
			public void onSuccess(Budget result) {
				System.out.println("Success!");
				// do stuff on success with GUI, like load the next GUI element
			}
		});
	}
	
	//----------------------------
	private EventHandlerCollection<ILoginHandler> loginHandlerColl = new EventHandlerCollection<ILoginHandler>();

	private final SigninServiceAsync loginService = SigninService.Util
			.getInstance();

	public SendFund() {
		SimplePanel panel = new SimplePanel();
		VerticalPanel list = new VerticalPanel();
		panel.setWidget(list);
		list.add(new CheckBox("See the status"));
		list.add(new CheckBox("Send Fund"));
		initWidget(panel);
		setStyleName("NanoSim-Research");
		////////////////////////////////////////
		/*DockPanel dock = new DockPanel();
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
	}*/
}}