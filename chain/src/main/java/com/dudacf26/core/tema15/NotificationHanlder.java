package com.dudacf26.core.tema15;

import java.util.Objects;

public abstract class NotificationHanlder {

	private final NotificationHanlder next;
	private Boolean handled = false;

	protected NotificationHanlder(NotificationHanlder next) {
		this.next = next;
	}

	public abstract void handleRequest(Request req);

	protected void dispatch(Request req) {
		if (Objects.nonNull(this.next)) {
			this.next.handleRequest(req);
		}
	}

	protected void setHandled() {
		this.handled = true;
	}

	public Boolean isHandled() {
		return this.handled;
	}
}
