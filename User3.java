public class User3{
	public static void main (String[] args){
		//Car myCar = new Car();
		int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
		int temp ;
         
		 int count=0;
		for (int x=0; x <arr.length; x++){
            	if(arr[x]==2){
					System.out.println(">>" + x);
					break;
				}			
				 count++;
			    }
	    	
		    /* for(int y=x+1; y < arr.length ; y++){
            	if(arr[x] > arr[y]){		
					temp = arr[x];
				    arr[x] = arr[y];
					arr[y] = temp;
		}
		     count++;
		} */
	
		/* for (int x=0; x<arr.length; x++){
			System.out.println(">>" + arr[x]);
		} */
	 	System.out.printf("%d" ,count);
    }
	 /*    public static void add(int x){
			System.out.println("===>" + x);
		} */
	
		   
}
			