package data.model;

public class Item {

    private  String name;
    private String description;
    private int weightInGrams;

    public Item(String testItem) {

    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    private int itemId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }




    public Item(String name, String description, int weightInGrams){
        this.name = name;
        this.description = description;
        this.weightInGrams = weightInGrams;
    }


}
