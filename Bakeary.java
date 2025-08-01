import java.io.*;
import java.util.Scanner;

public class Bakeary{

    public static void Menu(){
        String[] Items = {"1.Hotdog\t$4.99","2.Cake\t\t$10.99","3.Cake slice\t$4.99","4.crossaint\t$7.99","5.pig blanket\t$14.99"};
        
        System.out.println("\n\t------Menu------");

        for(int i = 0; i < 5;i++){
            System.out.println(Items[i]);
        }

    }
    public static void main(String[] args){
        Scanner X = new Scanner(System.in);
        String[] Items = {"1.Hotdog\t$4.99","2.Cake\t\t$10.99","3.Cake slice\t$4.99","4.crossaint\t$7.99","5.pig blanket\t$14.99"};

        System.out.print("Select a task: \n");
        System.out.print("1.Menu\n2.Coupon\n3.Exit\nEnter the number of the action: ");
        int action = X.nextInt();
        X.nextLine();

        if(action == 1){
            Menu();
        };

        System.out.print("Would you like to add something?[Y/N]: ");
        String YN = X.nextLine();
        String Item;

        if(YN.equals("Y")){
            while(YN.equals("Y")){
                System.out.print("Enter the item you want: ");
                Item = X.nextLine();

                for(int i = 0; i < 5; i++){
                    if(Items[i].equals(Item)){
                        System.out.print("You want to add "+ Items[i]);
                        
                    }

                }
            }
            
        }
        
        

        X.close();


    }

}