package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements StockObserver{

    List<NotificationObserver> observerList = new ArrayList<>();
    int stockCount = 0;


    @Override
    public void registerUser(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeUser(NotificationObserver observer) {
        observerList.remove(observer);
        System.out.println("Observer removed successfully");

    }

    @Override
    public void notifyUser() {
        if(stockCount == 0) {
            System.out.println("Product is out of stock");
        } else {
            for(NotificationObserver observer: observerList) {
                observer.update();
            }
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public void getStockCount() {
        System.out.println(stockCount);
    }


}
