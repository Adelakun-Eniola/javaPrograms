package OOP.Snack;

public class ProductCategory extends Product{
    final String ELECTRONICS;
    final String GROCERIES;
    final String UTENSILS;
    final String CLOTHING;


    public ProductCategory(String electronics, String groceries, String utensils, String clothings) {
        super();

        ELECTRONICS = electronics;
        GROCERIES = groceries;
        UTENSILS = utensils;
        CLOTHING = clothings;
    }

}
