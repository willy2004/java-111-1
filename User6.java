public class User6{ 
	public static void main (String[] args){

		int[] myArr = {7,5,4,9,8,1,2};
		int[] flag= new int[myArr.length];
		int count;
		int flag_count=1;
        int max=myArr[0];
		int min=myArr[0];
		 int sum = 0;
	 	  int temp;
		
		/*  for (int x : myArr) {
            if (x > max)
                max = x;
        } */
		 for(int x=0; x<myArr.length; x++){
               for(int y=x+1; y <myArr.length ; y++){
            	if(myArr[x] < myArr[y]){		
					temp = myArr[x];
				    myArr[x] =myArr[y];
					myArr[y] = temp;
				
		 }}} 
		 /* for (int x : myArr) {
            if (x < min)
                min = x;
        }	 */
		for(int x=0; x<myArr.length; x++){
               for(int y=x+1; y <myArr.length ; y++){
            	if(myArr[x] > myArr[y]){		
					temp = myArr[x];
				    myArr[x] =myArr[y];
					myArr[y] = temp;	
		 }
		 }
		 }   
		 
		 for(int x=0; x<myArr.length; x++){
               for(int y=x+1; y <myArr.length ; y++){
            	if(myArr[x] < myArr[y]){		
					temp = myArr[x];
				    myArr[x] =myArr[y];
					myArr[y] = temp;	
		 }
		 }
		 }   
		 for(int x=0; x<myArr.length; x++){
			 sum += myArr[x];
			 
		 }
		//==============================================
			int med=0;
		    for(int i=0;i<4;i++){
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
		 
        
		
		//for(int x=0; x<myArr[0]; x++){
		System.out.println("max:"+myArr[0]);
	   // }
	    //for(int x=0; x<myArr[0]; x++){
		System.out.println("min:"+myArr[6]);
	    //}
		System.out.println("sum:"+sum/7);
		System.out.println("med:"+myArr[3]);
}
}