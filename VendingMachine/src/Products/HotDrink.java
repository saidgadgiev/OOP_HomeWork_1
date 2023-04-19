package Products;

public class HotDrink extends Product {
    private int temperature;
    private int volume;

    public HotDrink(String name, double price, int volume, int temperature)
    {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int volume) {
        this.temperature = volume;
    }

        /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        
        return  
        "{" +
        "Продукт = '" + super.getName() + '\'' +
        ", Цена = " + super.getPrice() +
        ", Объем = " + volume + 
        ", Температура = " + temperature +
        '}';
    }
    
}
