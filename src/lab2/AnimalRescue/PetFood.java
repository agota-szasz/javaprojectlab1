package lab2.AnimalRescue;

public class PetFood {

     private String name ;
     private int price ;
     private int amount ;
     private String stockavailability ;

    public String getStockavailability() {
        return stockavailability;
    }

    public void setStockavailability(String stockavailability) {
        this.stockavailability = stockavailability;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
