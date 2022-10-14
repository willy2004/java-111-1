import java.util.Scanner;

public class Test11{
	public static void main(String[] args){
		int row =0;
		int a;
		while(row < 9){
			a = row;
			if(row >= 5){
			a = 8 - row;	
				
				
			}
			 int star =0;
			 while (star <= a){
			   System.out.print("*");
			   star = star +1;
			 }
			System.out.println("");
			row = row +1;
		    }
	}
}