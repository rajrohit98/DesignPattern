package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObserver;

public class EmailNotification implements NotificationObserver {

    private final String email;

    public EmailNotification(String email, StockObserver observer) {
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(email);
    }
    private void sendEmail(String email) {
        System.out.println(email + "  product is in stock");
    }
}
