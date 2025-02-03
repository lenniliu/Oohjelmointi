package teht2_2.Task1;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItems(String item) {
        if (groceryList.contains(item)) {
            System.out.println(item + " is already in the list.");
        } else {
            groceryList.add(item);
            System.out.println(item + " has been added to the list.");
        }
    }

    public void removeItems(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println(item + " has been removed from the list.");
        } else {
            System.out.println(item + " was not found in the list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery list:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    public void checkItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println(item + " is in the list.");
        } else {
            System.out.println(item + " is not in the list.");
        }
    }


    public static void main(String[] args) {
        GroceryListManager list = new GroceryListManager();
        list.addItems("Milk");
        list.addItems("Bread");
        list.addItems("Butter");
        list.addItems("Milk");
        list.displayList();
        list.removeItems("Bread");
        list.displayList();
        list.checkItem("Milk");
        list.checkItem("Bread");
        list.removeItems("Cucumber");
    }
}
