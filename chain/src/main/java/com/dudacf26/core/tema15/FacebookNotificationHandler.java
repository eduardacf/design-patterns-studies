package com.dudacf26.core.tema15;

public class FacebookNotificationHandler extends NotificationHanlder {

    public FacebookNotificationHandler(NotificationHanlder next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (RequestType.FACEBOOK.equals(request.getType())) {
            System.out.println("Esta sendo notificado via Facebook:" + request.getMessage());
            setHandled();
        }
        dispatch(request);
    }
}
