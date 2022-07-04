package Observer;

public class ShowCurrentConditions implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ShowCurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \n" + temperature + " degrees \n" + humidity + " % humidity \n" + pressure + " hPa \n");
    }

    @Override
    public void update(float temp, float hum, float press) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = press;
        display();
    }
}
