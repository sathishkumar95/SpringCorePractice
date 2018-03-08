import java.util.ArrayList;

public class Orders{

    private ArrayList<Items> items;
    private double totalPrice;


    public void setItems(ArrayList<Items> item) {
        this.items = item;
        System.out.println("Added these items in cart");
        for(Items i:items)
        {
            this.totalPrice += i.getPrice();
        }
    }

    public void addItem(Items item)
    {
        items.add(item);
    }

    public ArrayList<Items> getItems() {
        return items;
    }





    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }




}
