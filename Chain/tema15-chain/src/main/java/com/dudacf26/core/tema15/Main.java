package com.dudacf26.core.tema15;

public class Main {
	public static void main(String[] args) {

		NotificationHanlder sms = new SmsNotificationHandler(null);
		NotificationHanlder email = new EmailNotificationHandler(sms);
		NotificationHanlder facebook = new FacebookNotificationHandler(email);

		Request request = new Request();
		request.setMessage("Hello!");
		request.setType(RequestType.SMS);

		email.handleRequest(request);

		System.out.println(sms.isHandled());
		System.out.println(facebook.isHandled());
		System.out.println(email.isHandled());

	}
}
