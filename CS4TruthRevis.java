package CS4TruthRevis;

public class CS4TruthRevis {

    public static void main(String[] args) {
        Burger burger1 = new Burger("Cheeseburger", 2, 1, 1, 1, 2);
        Burger burger2 = new Burger("Double Cheeseburger", 2, 2, 2, 1, 2);
        Burger burger3 = new Burger("Big Mac", 3, 2, 2, 2, 4);

        System.out.println("Burger 1");
        System.out.println("Name: " + burger1.name);
        System.out.println("No. of buns: " + burger1.noOfBun);
        System.out.println("No. of patties: " + burger1.noOfPatty);
        System.out.println("No. of cheeses: " + burger1.noOfCheese);
        System.out.println("No. of lettuces: " + burger1.noOfLettuce);
        System.out.println("No. of tomatoes: " + burger1.noOfTomato + "\n");    

        System.out.println("Burger 2");
        System.out.println("Name: " + burger2.name);
        System.out.println("No. of buns: " + burger2.noOfBun);
        System.out.println("No. of patties: " + burger2.noOfPatty);
        System.out.println("No. of cheeses: " + burger2.noOfCheese);
        System.out.println("No. of lettuces: " + burger2.noOfLettuce);
        System.out.println("No. of tomatoes: " + burger2.noOfTomato + "\n");    

        System.out.println("Burger 3");
        System.out.println("Name: " + burger3.name);
        System.out.println("No. of buns: " + burger3.noOfBun);
        System.out.println("No. of patties: " + burger3.noOfPatty);
        System.out.println("No. of cheeses: " + burger3.noOfCheese);
        System.out.println("No. of lettuces: " + burger3.noOfLettuce);
        System.out.println("No. of tomatoes: " + burger3.noOfTomato + "\n");    

        System.out.println("Double Cheeseburger total ingredients: " + (burger2.noOfBun + burger2.noOfPatty + burger2.noOfCheese + burger2.noOfLettuce + burger2.noOfTomato));
        System.out.println("A Double Cheeseburger has more patties than a Big Mac: " + (burger2.noOfPatty > burger3.noOfPatty));
        System.out.println("A Double Cheeseburger has twice the amount of cheese as a Cheeseburger: " + ((burger1.noOfCheese)*2 == burger2.noOfCheese));
    }    
}