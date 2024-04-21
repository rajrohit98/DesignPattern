package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObserver;

import java.util.stream.Stream;

public class MobileNotification implements NotificationObserver {
    private final String number;

    public MobileNotification(String number, StockObserver observer) {
        this.number = number;
    }

    @Override
    public void update() {
        sendEmail(number);
    }
    private void sendEmail(String number) {
        System.out.println(number + "  product is in stock");
    }
}
