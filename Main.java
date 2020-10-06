import java.util.Scanner;
/**
 * program that prints a box of stars
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask them for a number between 1-10
    System.out.println("Please enter a number between 1 and 10");
    int num = input.nextInt();
    
    for (int i = 1; i <= num; i++){

      for (int j = 1; j <= num; j++){
        System.out.print("*");
      
    }
    System.out.println("");
    }
    
  }
}
