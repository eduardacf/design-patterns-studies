package com.dudacf26.core.tema15;

public class EmailNotificationHandler extends NotificationHanlder {

	public EmailNotificationHandler(NotificationHanlder next) {
		super(next);
	}

	@Override
	public void handleRequest(Request request) {
		if (RequestType.EMAIL.equals(request.getType())) {
			System.out.println("Est� sendo notificado via EMAIL:" + request.getMessage());
			setHandled(true);
		}
		dispatch(request);
	}
}
