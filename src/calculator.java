import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {

    System.out.println("Application started");
    
    Scanner scan = new Scanner(System.in);
    int num1, num2;
    
    System.out.println("Enter the numbers:");
    num1 = scan.nextInt();
    num2 = scan.nextInt();

    int result = add(num1, num2);
    System.out.println("Result: " + result);
  }

  public static int add(int num1, int num2) {
    return num1 + num2;
  }
}
