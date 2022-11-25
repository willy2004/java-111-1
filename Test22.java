 import java.util.Scanner;               
public class Test22{	
    public static void main (String[] avgs){//輸入
	      
		    
            int i;
            int j=0;
			int g=0;
			
			int k=85;
			 Scanner input = new Scanner(System.in);
           System.out.print("Enter  integer=");
           i = input.nextInt();
			
			
        /*     for(int i=85;i<=7;i++){
                for(int k= 5; k<=8;k++){
		        if()
                   System.out.printf("%d");   */
			  if(i<7){  
               System.out.printf("%d",k);  
			   }else if(i>=8&i<=12){
				g=k+(i-8)*5; 
		       System.out.printf("%d",g); 
			   }else if (i>=12&i<=50){
               g=k+(i-8)*5;   
		       j=g+(i-12)*10;
			   System.out.printf("%d",j);  
			   }
          
					
			
		
	}
}