package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++)
        {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }

    }

    public void readingChange()
    {
        notifyObserver();
    }

    public void setReadings(float temp, float hum, float press)
    {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        readingChange();
    }
}
