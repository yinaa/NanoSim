package com.nanosim.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ImageBundle;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * A component that displays a list of contacts.
 */
public class Contacts extends Composite {

	/**
	 * An image bundle for this widget and an example of the use of @Resource.
	 */
	public interface Images extends ImageBundle {
		AbstractImagePrototype defaultPhoto();
	}

	/**
	 * Simple data structure representing a contact.
	 */
	private class Contact {
		public String email;
		public String name;

		public Contact(String name, String email) {
			this.name = name;
			this.email = email;
		}
	}

	/**
	 * A simple popup that displays a contact's information.
	 */
	private class ContactPopup extends PopupPanel {

		public ContactPopup(Contact contact) {
			// The popup's constructor's argument is a boolean specifying that
			// it
			// auto-close itself when the user clicks outside of it.
			super(true);

			VerticalPanel inner = new VerticalPanel();
			Label nameLabel = new Label(contact.name);
			Label emailLabel = new Label(contact.email);
			inner.add(nameLabel);
			inner.add(emailLabel);

			HorizontalPanel hp = new HorizontalPanel();
			hp.setSpacing(4);
			hp.add(images.defaultPhoto().createImage());
			hp.add(inner);

			add(hp);
			setStyleName("nanosim-ContactPopup");
			nameLabel.setStyleName("nanosim-ContactPopupName");
			emailLabel.setStyleName("nansim-ContactPopupEmail");
		}
	}

	private Contact[] contacts = new Contact[] {
			new Contact("Congress", "congress@nanosim.com"),
			new Contact("NSF", "nsf@nanosim.com"),
			new Contact("Darpa", "darpa@nanosim.com"),
			new Contact("IBM", "ibm@nanosim.com"),
			new Contact("MIT", "mit@nanosim.com"),
			new Contact("NASA", "nasa@nanosim.com"),
			new Contact("RICE", "rice@nanosim.com"),
			new Contact("ASU", "asu@nanosim.com"),
			new Contact("WWIC", "wwic@nanosim.com"),
			new Contact("Nanopost", "nanopost@nanosim.com") };

	private VerticalPanel panel = new VerticalPanel();
	private final Images images;
	private Tree tree = new Tree();

	public Contacts(Images images) {
		SimplePanel outer = new SimplePanel();
		outer.setWidget(panel);

		this.images = images;

		// Add all the contacts to the list.
		for (int i = 0; i < contacts.length; ++i) {
			addContact(contacts[i]);
		}

		panel.add(tree);

		initWidget(outer);
		setStyleName("nanosim-Contacts");
	}

	private void addContact(final Contact contact) {
		TreeItem root = null;
		final HTML link = new HTML("<a href='javascript:;'>" + contact.name
				+ "</a>");
		root = new TreeItem(link);
		root.setState(true);
		tree.addItem(root);
		// panel.add(link);

		// Add a click handler that displays a ContactPopup when it is clicked.
		link.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				ContactPopup popup = new ContactPopup(contact);
				int left = link.getAbsoluteLeft() + 14;
				int top = link.getAbsoluteTop() + 14;
				popup.setPopupPosition(left, top);
				popup.show();
			}
		});
	}
}
