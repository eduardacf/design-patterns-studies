package com.dudacf26.core.tema15;

import java.util.Objects;

public abstract class NotificationHanlder {

	private NotificationHanlder next;
	private Boolean handled = false;

	public NotificationHanlder(NotificationHanlder next) {
		this.next = next;
	}

	public abstract void handleRequest(Request req);

	protected void dispatch(Request req) {
		if (Objects.nonNull(this.next)) {
			this.next.handleRequest(req);
		}
	}

	protected void setHandled(Boolean handled) {
		this.handled = handled;
	}

	public Boolean isHandled() {
		return this.handled;
	}
}
