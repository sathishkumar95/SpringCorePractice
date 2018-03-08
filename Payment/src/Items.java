public class Items {

    private String itemId;
    private double price;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Items(String itemId, double price) {
        this.itemId = itemId;
        this.price = price;
    }


}
