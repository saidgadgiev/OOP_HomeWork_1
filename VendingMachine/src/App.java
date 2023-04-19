import Products.Product;
import Products.BottleOfWater;
import VendingMachines.VendingMachine;
import Products.HotDrink;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Pepsi",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        // Добавленире горячих напитков
        itemMachin.addProduct(new HotDrink("Koffee", 200.0, 200, 50));
        itemMachin.addProduct(new HotDrink("Cappuccino", 250.0, 300, 60));
        itemMachin.addProduct(new HotDrink("Black Tea", 150.0, 500, 80));
        itemMachin.addProduct(new HotDrink("Green Tea", 190.0, 450, 40));
        itemMachin.addProduct(new HotDrink("Raff", 390.0, 150, 55));

        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }
        
        System.out.println("\n--------------");
        itemMachin.vidachaProd();

             
    }
}
