import java.io.*;
import java.util.*;

public class Bakeary{

    public static void Menu(){
        String[] Items = {"1.Hotdog $4.99","2.Cake $10.99","3.Cake slice $4.99","4.crossaint $7.99","5.pig blanket $14.99"};
        
        System.out.println("\n\t------Menu------");

        for(int i = 0; i < 5;i++){
            System.out.println(Items[i]);
        }

    }

    public static HashMap<String, Double> GetItems(){

        HashMap<String, Double> Item = new HashMap<>();

        Item.put("hotdog",4.99);
        Item.put("cake",10.99);
        Item.put("cake slice", 4.99);
        Item.put("crossaint", 7.99);
        Item.put("pig blanket",14.99);

        return Item;
    }

    public static int Action(){
        Scanner X = new Scanner(System.in);

        System.out.print("Select a task: \n");
        System.out.print("1.Menu\n2.Coupon\n3.Exit\nEnter the number of the action: ");
        int action = X.nextInt();

        X.close();

        return action;
    }


    public static void main(String[] args){

        Scanner X = new Scanner(System.in);

        double price = 0;

        HashMap<String, Double> menu = GetItems();

        int action = Action();

        if(action == 1){
            Menu();
        };

        while(action != 3){
            System.out.print("Would you like to add something?[Y/N]: ");
            String YN = X.nextLine();
            String Item;

        
            if(YN.equals("Y") || YN.equals("y")){
                while(YN.equals("Y") || YN.equals("y")){
                    System.out.print("Enter the item you want: ");
                    Item = X.nextLine();

                    System.out.print("Do you want " + Item +" for "+menu.get(Item)+"$ [Y/N]: ");
                    String conform = X.nextLine();

                    if(conform.equals("Y") || conform.equals("y")){
                        System.out.print("How much of " + Item + " would you like?: ");
                        double Amount = X.nextDouble();
                        X.nextLine();

                        price = (Amount * menu.get(Item))+price;

                        System.out.printf("The price is %.2f\nWould you like to pay or continue adding?: ",price);
                        YN = X.nextLine();

                    }
                }
                
            }
        }

        System.out.print("Program terminated");
        
        X.close();


    }

}