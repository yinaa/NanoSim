package com.nanosim.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.nanosim.client.rpc.GroupService;
import com.nanosim.client.rpc.GroupServiceAsync;
import com.nanosim.model.Group;
import com.nanosim.model.GroupType;
import com.nanosim.model.Person;

public class HomeScreen extends Composite {

	private final GroupServiceAsync groupService = GroupService.Util
			.getInstance();

	private Person person;
	private Group group;
	private GroupType groupType;

	private static final Images images = GWT.create(Images.class);

	/**
	 * An aggregate image bundle that pulls together all the images for this
	 * application into a single bundle.
	 */
	public interface Images extends LeftPanel.Images, TopPanel.Images {
	}

	public RightPanel rightPanel;
	public TopPanel topPanel;
	public LeftPanel leftPanel;
	String width = new String("80%");

	public HomeScreen(Person person, EntryPoint nanosim) {
		this.person = person;
		// final String initToken = History.getToken();

		// Create a dock panel that will contain the menu bar at the top,
		// the shortcuts to the left, and the mail list & details taking the
		// rest.
		final DockPanel outer = new DockPanel();
		outer.setWidth("100%");
		outer.setSpacing(4);

		groupService.getGroup(person.getGroupId(), new AsyncCallback<Group>() {

			@Override
			public void onFailure(Throwable caught) {
			}

			@Override
			public void onSuccess(Group result) {
				group = result;
				groupService.getGroupType(group.getGroupTypeId(),
						new AsyncCallback<GroupType>() {

							@Override
							public void onFailure(Throwable caught) {
							}

							@Override
							public void onSuccess(GroupType result) {
								groupType = result;
								initChildWidgets(outer);
							}
						});
			}
		});

		initWidget(outer);
	}

	private void initChildWidgets(DockPanel outer) {
		rightPanel = new RightPanel();
		topPanel = new TopPanel(person, group, images);
		leftPanel = new LeftPanel(groupType, images);

		topPanel.setWidth("70%");

		outer.add(topPanel, DockPanel.NORTH);
		outer.add(leftPanel, DockPanel.WEST);
		outer.add(rightPanel, DockPanel.CENTER);
		outer.setCellWidth(rightPanel, "100%");
	}
}
