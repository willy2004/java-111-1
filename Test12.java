import java.util.Scanner;

public class Test12{
	public static void main(String[] args){
		int row =0;
		int blank =4; //空格
		int star =0;  //**
		int col;
		while(row < 9){
			  col = 0;
	          while (col < blank){
			   System.out.print(" ");
			   col += 1;
			   }
			   col = 0;
			 while (col <= star){
			   System.out.print("*");
			   col += 1;
			}
         
			System.out.print("\n");
			
            if(row < 4){
			  blank -= 1;//前4行正常空格減一
			  star += 2; //前4行正常**減一
            }else{
              blank += 1; //到第4行反轉
			  star -= 2;  // 
			row +=1;
		    }
	}
}
