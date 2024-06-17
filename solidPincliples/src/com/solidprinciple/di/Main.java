
package com.solidprinciple.di;

public class Main {

	public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, World!", "email");
        notificationService.sendNotification("Hello, world!", "sms");
        notificationService.sendNotification("Hello, Git!", "sms");
    }
}


