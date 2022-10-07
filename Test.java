import java.util.Scanner;

public class Test{
	public static void main(String[] args){
          int num1;
          
       Scanner input = new Scanner(System.in); 
       System.out.print("Enter first integer:");
       num1 = input.nextInt();

       if (num1 >= 90 & num1 <= 100){
          System.out.print(" A "); 
          }
	   if   (num1 >= 80 & num1 <= 89){  
		 System.out.print(" B ");}    
          
	    if  (num1 >= 70 & num1 <= 79){    
		 System.out.print(" C "); }   
          
	    if  (num1 >= 60 & num1 <= 69){    
		 System.out.print(" D ");}    
          
		if  (num1 <= 60){    
		 System.out.print(" E "); }	  
		  
       
          
		  }  
   }
