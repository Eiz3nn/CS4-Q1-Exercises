package q1exercise5;

import java.util.*;

public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();
  
    public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    this.earnings = 0;
    
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList<>();
    
    // add 'this' store to storeList
    storeList.add(this);
}

public String getName(){
    return name;
}
  
public double getEarnings(){
    return earnings;
}

public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if (index > itemList.size()) {
        System.out.printf("Sorry, there are only %d items in this store.\n\n", itemList.size());  

    } else {
        // get Item at index from itemList and add its cost to earnings
        earnings += itemList.get(index).getCost();

        // print statement indicating the sale
        System.out.printf("Successfully sold %s.\n\n", itemList.get(index).getName());
    }

}

public void sellItem(String name){
    boolean found = false;

    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    for (Item i : itemList) {
        if (name.equals(i.getName())) {
            // get Item from itemList and add its cost to earnings
            earnings += i.getCost();

            // print statement indicating the sale
            System.out.printf("Successfully sold %s.\n\n", i.getName());

            found = true;
            break;
      } 
    }
    if (!found) {
        System.out.printf("Sorry, item \"%s\" does not exist in this store.\n\n", name);
    }
}

public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    if (itemList.contains(i)) {
        // get Item from itemList and add its cost to earnings
        earnings += i.getCost();

        // print statement indicating the sale
        System.out.printf("Successfully sold %s.\n\n", i.getName());
    } else {
        System.out.printf("Sorry, item \"%s\" does not exist in this store.\n\n", i.getName());
    }
}

public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
}

public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("Filter type: %s\n", type);
    for (Item i : itemList) {
        if (type.equals(i.getType())) {
            System.out.println(i.getName());
        }
    }
    System.out.println();
}

public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("Filter maximum price: %.2f\n", maxCost);
    for (Item i : itemList) {
        if (maxCost >= i.getCost()) {
            System.out.println(i.getName());
        }
    }
    System.out.println();
}

public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("Filter mininmum price: %.2f\n", minCost);
    for (Item i : itemList) {
        if (minCost <= i.getCost()) {
            System.out.println(i.getName());
        }
    }
    System.out.println();
}

public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (Store i : storeList) {
        System.out.printf("Name: %s, Earnings: %.2f\n", i.getName(), i.getEarnings());
    }
    System.out.println("\n");
}
}
