/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Main {



    public static void main(String[] args) {

	// write your code here

        Item item = new Item("item", 10.0F);

        Item item1 = new Item("item1", 20.0F);

        Item item2 = new Item("item2", 30.0F);

        Item item3 = new Item("item3", 40.0F);

        Item item4 = new Item("item4", 50.0F);

        Item item5 = new Item("item", 60.0F);
        
        Item item6 = new Item("item", 70.0F);
        
        Item item7 = new Item("item", 80.0F);
        
        Item item8 = new Item("item", 90.0F);
        

        Cart cart = new Cart(5);

        cart.add(item);

        cart.add(item1);

        cart.add(item2);

        cart.add(item3);

        cart.add(item4);

        cart.add(item5);
        
        cart.add(item6);
        
        cart.add(item7);
        
        cart.add(item8);

        System.out.println(cart);

        System.out.println("sum = " + cart.getSumPrice());

        System.out.println("===============");

        cart.raisePrices(15);

        System.out.println("sum(+15%) = " + cart.getSumPrice());

        System.out.println("===============");

        cart.reducePrices(30);

        System.out.println("sum(-30%) = " + cart.getSumPrice());

    }

}
