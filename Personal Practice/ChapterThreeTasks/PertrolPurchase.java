package ChapterThreeTasks;

public class PertrolPurchase{

    String location;
    String petrolType;
    int quantity;
    double priceOfPetrol;
    double discount;


    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPriceOfPetrol(double priceOfPetrol) {
        this.priceOfPetrol = priceOfPetrol;
    }

    public double getPriceOfPetrol() {
        return priceOfPetrol;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPurchaseNet(){
        double total = (quantity * priceOfPetrol)- discount;
        return total;
    }
}