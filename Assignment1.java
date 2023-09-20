// Import libraries here

import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here

    //initals (SC)
    System.out.println("\s\sSSS\s\s\t\t\s\sCCC");
    System.out.println("SS\s\s\sSS\t\tCC\s\s\sCC");
    System.out.println("SS\t\tCC");
    System.out.println("\s\sSS\t\tCC");
    System.out.println("\s\s\s\sSS\t\tCC");
    System.out.println("\s\s\s\s\s\sSS\tCC");
    System.out.println("\s\s\s\s\s\sSS\tCC");
    System.out.println("SS\s\s\s\sSS\tCC\s\s\sCC");
    System.out.println("\s\sSSSS\t\t\s\sCCC");
    System.out.println("\t"); //end

    //declaring variables
    int fTemp;
    String word;
    int num1;

    Scanner scan = new Scanner(System.in);

    //input for 5-character string
    System.out.println("Enter a 5-character string: ");
    word = scan.nextLine();
    while(word.length() != 5) {
      System.out.println("Make 5 characters long!");
      if(word.length() != 5){
        word = scan.nextLine();
      }
    }

    //input for temp conversions
    System.out.println("Enter a number in fahrenheit:");
    fTemp = scan.nextInt();

    scan.close(); //ends scan

    System.out.println("Random number generated. Continuing...");

    String reveresedString = new StringBuilder(word.substring(1,4)).reverse().toString();

    //generates random number from 32 to 16384
    Random generator = new Random();
    num1 = generator.nextInt(16384-32+1) + 32;

    /*prints temp in celsius, word reversed with first
    and last letters cut off, and randomly generated number*/
    System.out.println("Your new string is " + ((fTemp-32)/(1.8)) + reveresedString + num1);
  }
}
