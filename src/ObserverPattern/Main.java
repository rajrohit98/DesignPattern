package ObserverPattern;

import ObserverPattern.Observable.IphoneStock;
import ObserverPattern.Observable.StockObserver;
import ObserverPattern.Observer.EmailNotification;
import ObserverPattern.Observer.MobileNotification;
import ObserverPattern.Observer.NotificationObserver;

public class Main {

    public static void main(String[] args) {

        //creating the observable..
        StockObserver iphoneObservable = new IphoneStock();

        //creating the email notification alert observer...
        NotificationObserver observer1 = new EmailNotification("rohitraj.091298@gmail.com", iphoneObservable);
        NotificationObserver observer2 = new EmailNotification("rohitraj@gmail.com", iphoneObservable);

        //creating the mobile notification alert observer...
        NotificationObserver observer3 = new MobileNotification("7631293391", iphoneObservable);

        //calling the function to register the observer
        iphoneObservable.registerUser(observer1);
        iphoneObservable.registerUser(observer2);
        iphoneObservable.getStockCount();
        iphoneObservable.notifyUser();
        iphoneObservable.setStockCount(10);
        iphoneObservable.removeUser(observer1);
        iphoneObservable.registerUser(observer3);
        iphoneObservable.notifyUser();
    }
}
