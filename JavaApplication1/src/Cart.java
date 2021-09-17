
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Cart {
    ArrayList<Item> items = new ArrayList<>();

     private int maxLength;

    public Cart(int maxLength) {

        this.maxLength = setMaxLength(maxLength);
}


    private int setMaxLength(int maxLength) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public boolean add(Item item) {

        if (items.size() < maxLength) {

            return items.add(item);

        }

        return false;

    }

public float getSumPrice(){

        float sum = 0;

        for (Item item:items) {

            sum += item.getPrice();

        }

        return sum;

    }
public void raisePrices(float percent){

        float tempPrice;

        for (Item item:items) {

            tempPrice = item.getPrice();

            tempPrice = tempPrice + tempPrice*(percent/100);

            item.setPrice(tempPrice);

        }

}
public void reducePrices(float percent){

        float tempPrice;

        for (Item item:items) {

            tempPrice = item.getPrice();

            tempPrice = tempPrice - tempPrice*(percent/100);

            item.setPrice(tempPrice);

        }

    }
@Override

    public String toString() {

        return getClass().getSimpleName() +

                " items=" + items;

    }

}