public class User4{ 
	public static void main (String[] args){

     int[] myArr = {7,5,4,8,1,2};

	 
	 int y=myArr.length-1;
	 for(int x=0; x<myArr.length/2; x++){
                    
				int  temp = myArr[x];
				    myArr[x] = myArr[myArr.length-1-x];
					myArr[myArr.length-1-x] =   temp;		
					}
	for(int x=0; x<myArr.length; x++){
	System.out.println("==>"+myArr[x]);
	}
}
}