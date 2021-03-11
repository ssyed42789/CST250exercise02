
package cst250exercise02;

import java.util.ArrayList;


public class ShoppingList {
    
    private ArrayList<ShoppingItem> items;

    public ShoppingList(ArrayList<ShoppingItem> items) {
        this.items = items;
    }
    
    public ShoppingList() {
        this.items = new ArrayList<>();
    }

    public ArrayList<ShoppingItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ShoppingItem> items) {
        this.items = items;
    }
    
    public void addItemToList(String ItemName) {
        ShoppingItem newItem = new ShoppingItem(ItemName);
        this.items.add(newItem);
    }
    public void display(){
        System.out.println("-----------------");
        System.out.println("Items:");
        System.out.println("-----------------");
        this.items.forEach(item -> {
            item.display();
        });
        System.out.println("-----------------");
    }
        
    
    
}
