package com.nanosim.client.internal;

import java.util.ArrayList;
import java.util.List;

public class EventHandlerCollection<TKey> {
	private ArrayList<TKey> handlers = new ArrayList<TKey>();

	public void addListener(TKey handler) {
		handlers.add(handler);
	}

	public void removeListener(TKey handler) {
		handlers.remove(handler);
	}

	public List<TKey> getList() {
		return handlers;
	}
}
