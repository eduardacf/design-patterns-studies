package com.dudacf26.core.tema15;

public class SmsNotificationHandler extends NotificationHanlder {

	public SmsNotificationHandler(NotificationHanlder next) {
		super(next);
	}

	@Override
	public void handleRequest(Request request) {
		if (RequestType.SMS.equals(request.getType())) {
			System.out.println("Está sendo notificado via SMS:" + request.getMessage());
			setHandled(true);
		}
		dispatch(request);
	}
}
