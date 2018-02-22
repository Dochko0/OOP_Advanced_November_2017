package src.p02_services;

public class SmsNotificationService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("SMS send");

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
