import java.util.Scanner;

public class Test{
	public static void main(String[] args){
          int num1;
          
       Scanner input = new Scanner(System.in);
       System.out.print("Enter first integer:");
       num1 = input.nextInt();

       if (num1 >= 60){
       System.out.print("Good");
       }
       
   }
}