import java.util.Scanner;

public class Test{
	public static void main(String[] args){
          int num1;
          int num2;
          int sum;
       
       Scanner input = new Scanner(System.in);
       System.out.print("Enter first integer:");
       num1 = input.nextInt();
       
       System.out.print("Enter first integer:");
       num2  = input.nextInt();
       
       sum = num1 + num2;
       System.out.print("The sum is " + sum  );
       
       
   }
   /*  public static void printStr(int str){
        System.out.println(str);
   } */
}