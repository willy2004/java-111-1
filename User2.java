public class User2{
	public static void main (String[] args){
		//Car myCar = new Car();
		int[] arr = {9,8,7,6,5};
		int temp ;
		int count =0;
		for (int x=0; x <arr.length; x++){
		    for(int y=x+1; y < arr.length ; y++){
            	if(arr[x] > arr[y]){		
					temp = arr[x];
				    arr[x] = arr[y];
					arr[y] = temp;
		}
		     count++;
		}
	}
		for (int x=0; x<arr.length; x++){
			System.out.println(">>" + arr[x]);
		}
	 	System.out.printf("%d" ,count);
    }
	    public static void add(int x){
			System.out.println("===>" + x);
		}
	
		   
}
			