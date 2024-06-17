
package com.solidprinciple.di;

//High-level module
public class NotificationService {

	private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void sendNotification(String message, String type) {
        if (type.equals("email")) {
            emailService.sendEmail(message);
        } else if (type.equals("sms")) {
            smsService.sendSMS(message);
        }
    }
}

