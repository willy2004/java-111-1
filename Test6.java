import java.util.Scanner;

public class Test{
	public static void main(String[] args){
          int num1;
          
       Scanner input = new Scanner(System.in); 
       System.out.print("Enter first integer:");
       num1 = input.nextInt();
                if(num1>100){
                   System.out.print("Enter first integer:XXX");         
                }else{      
		        switch( num1/10 ){
			    case 10: case 9:   
			       System.out.println (" A");
                   
			         break;
			     case 8: 
			        System.out.println(" B");
                   
			         break;
                 case 7:
			        System.out.println (" c");
                
			         break;
                 case 6:
			        System.out.println(" D");
               
			         break;				 
			     default: 
			        System.out.println(" E");
                
			         break; 
                }
       
                   }
		  }  
   }