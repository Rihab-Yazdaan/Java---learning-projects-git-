import java.io.*;
import java.util.*;

public class MadlibsGame{
    public static void main(String[] args){
        String adjective1,adjective2,adjective3,noun1,verb1;
        Scanner X = new Scanner(System.in);

        System.out.println("Today I went to a __________ zoo.");
        System.out.print("Enter a adjective: ");
        adjective1 = X.nextLine();

        System.out.println("In a exhibition, I saw a __________.");
        System.out.print("Enter a noun: ");
        noun1 = X.nextLine();

        System.out.println(noun1 + " was __________ and _________!");
        System.out.print("Enter a adjective: ");
        adjective2 = X.nextLine();

        System.out.println(noun1 + " was " + adjective2 + " and __________!");
        System.out.print("Enter a verb: ");
        verb1 = X.nextLine();

        System.out.println("I was __________!");
        System.out.print("Enter a adjective: ");
        adjective3 = X.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo." + "In a exhibition, I saw a " + noun1 + "."+ noun1 + 
        " was " + adjective2 + " and " + verb1+"! "+"I was " + adjective3 + "!");
    }
}
