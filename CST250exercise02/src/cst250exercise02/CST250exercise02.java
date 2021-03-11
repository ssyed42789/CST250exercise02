
package cst250exercise02;


public class CST250exercise02 {


    public static void main(String[] args) {
       Person customer01 = new Person("Jack");
       customer01.getShoppingList().addItemToList("Milk");
       customer01.getShoppingList().addItemToList("Bread");
       customer01.display();
       
    }
    
}
