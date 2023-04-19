package VendingMachines;

import Products.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    
    // private int volume;
    private List<Product> products;// = new ArrayList<Product>();
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume){
        // this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public void addSales(String line)
    {
        workLog.add(line);
    }
     /**
     * Поиск продукта
     */
    public Product getProdByName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ведите название продукта для покупки -> ");
        String name = scan.nextLine();
        for(Product prod: products)
        {
            if(prod.getName().toUpperCase().contains(name.toUpperCase()))
            {
                return prod;
            }
        }
        return null;
    }

    public List<Product> getProdAll()
    {
        return products;
    }
    /**
     * Выдача продукта
     */
    
    public void vidachaProd(){
        Product listProd = getProdByName();
        System.out.printf("Ваш заказ -> " + listProd + 
        "\nК оплате " + 
        listProd.getPrice() + " р.\n\n СПАСИБО ЗА ПОКУПКУ");

    }



    

}
