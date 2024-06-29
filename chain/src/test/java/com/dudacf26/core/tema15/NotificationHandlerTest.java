package com.dudacf26.core.tema15;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class NotificationHandlerTest {

    private NotificationHanlder sms;
    private NotificationHanlder email;
    private NotificationHanlder facebook;
    private Request request;

    @Before
    public void init() {
        sms = new SmsNotificationHandler(null);
        email = new EmailNotificationHandler(sms);
        facebook = new FacebookNotificationHandler(email);
        request = new Request();
        request.setMessage("Hello!");
    }

    @Test
    public void testaNotificacaoSMS() {
        request.setType(RequestType.SMS);
        facebook.handleRequest(request);
        assertTrue(sms.isHandled());
        assertFalse(email.isHandled());
        assertFalse(facebook.isHandled());
    }

    @Test
    public void testaNotificacaoEmail() {
        request.setType(RequestType.EMAIL);
        facebook.handleRequest(request);
        assertFalse(sms.isHandled());
        assertTrue(email.isHandled());
        assertFalse(facebook.isHandled());
    }

    @Test
    public void testaNotificacaoFacebook() {
        request.setType(RequestType.FACEBOOK);
        facebook.handleRequest(request);
        assertFalse(sms.isHandled());
        assertFalse(email.isHandled());
        assertTrue(facebook.isHandled());
    }

    @Test
    public void testaNotificacaoInvalida() {
        request.setType(RequestType.OTHER);
        facebook.handleRequest(request);
        assertFalse(sms.isHandled());
        assertFalse(email.isHandled());
        assertFalse(facebook.isHandled());
    }
}