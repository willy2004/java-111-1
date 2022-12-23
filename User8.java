import java.util.Scanner;
public class User8{ 
	public static void main (String[] args){

		int[] myArr = {7,5,4,9,8,1,2};
		int[] flag= new int[myArr.length];
		int count;
		int flag_count=1;
		int med=0;
		int num=0;
		Scanner input = new Scanner(System.in); 
        System.out.print("Enter first integer:");
        num = input.nextInt();
	
		//==============================================
			
		    for(int i=0;i<num;i++){
			int flag_min = 1000;
			int flag_min_index = 0;
            for(int j=0; j<myArr.length;j++){
            	if(myArr[j] < flag_min && flag[j]==0){		
				    flag_min = myArr[j];
					flag_min_index = j;	
		        }
			}
		    flag[flag_min_index] = flag_count;
            flag_count++;
            med = myArr[flag_min_index];			
		 }   
		 
       
		System.out.println("med:"+med);
}
}