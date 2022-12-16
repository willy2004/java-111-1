public class User5{ 
	public static void main (String[] args){

		int[] myArr = {7,5,4,9,8,1,2};
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
		
		 for(int x=0; x<myArr.length; x++){
               for(int y=x+1; y <myArr.length ; y++){
            	if(myArr[x] < myArr[y]){		
					temp = myArr[x];
				    myArr[x] =myArr[y];
					myArr[y] = temp;	
		 }
		 }
		 }   
		 
        
		
		//for(int x=0; x<myArr[0]; x++){
		System.out.println("max"+myArr[0]);
	   // }
	    //for(int x=0; x<myArr[0]; x++){
		System.out.println("min"+myArr[6]);
	    //}
		System.out.println(sum/7);
		System.out.println(myArr[3]);
}
}