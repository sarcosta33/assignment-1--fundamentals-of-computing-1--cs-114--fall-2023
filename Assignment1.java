// Import libraries here

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here

    //Part 1
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

    //Part 2
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a number in fahrenheit:");

    int fTemp = scan.nextInt();
    String word = scan.nextLine();

    System.out.println((fTemp-32)/(1.8));
    
    //Part 3
    System.out.println("Enter a 5-character string: ");

    System.out.println(word);
  }
}
