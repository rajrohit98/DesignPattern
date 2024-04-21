package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationObserver;

public interface StockObserver {

    public void registerUser(NotificationObserver observer);

    public void removeUser(NotificationObserver observer);

    public void notifyUser();
    public void setStockCount(int newStockCount);

    public void getStockCount();
}
