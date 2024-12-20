package ChapterThreeTasks;

import java.util.Scanner;


public class Petrol{
    public static void main(String [] args){
        PertrolPurchase fuel = new PertrolPurchase();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Location:");
        String location = sc.nextLine();
        fuel.setLocation(location);
        ///System.out.println(fuel.getLocation());

        System.out.println("Enter Petrol Type:");
        String typeOfFuel = sc.nextLine();
        fuel.setPetrolType(typeOfFuel);
        ///System.out.println(fuel.getPetrolType());

        System.out.println("Enter Quantity:");
        int quantityOfFuel = sc.nextInt();
        fuel.setQuantity(quantityOfFuel);

        System.out.println("Enter Price:");
        int priceOfFuel = sc.nextInt();
        fuel.setPriceOfPetrol(priceOfFuel);

        System.out.println("Enter Discount:");
        int discount = sc.nextInt();

        int newDiscount = discount/100 * priceOfFuel;

        fuel.setDiscount(discount);

        System.out.println(fuel.getPurchaseNet());
    }
}