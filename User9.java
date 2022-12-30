public class User9{ 
	public static void main (String[] args){

		int[] myArr = {10,9,8,7,6,5,4,3,2,1,0};
		int left =0;
		int right = myArr.length-1;
		int medianIndex;
		int target=2;
		int targetIndex=0;
	    int count = 0;
			
             for(int i=0; i<3;i++){
				 medianIndex = (right - left)/2 + left;
            	if(myArr[medianIndex] == target){		
				    targetIndex = medianIndex;	
					break;
		        }
				count++;
			    if(target>myArr[medianIndex])
					right= medianIndex;
		        else
					left = medianIndex;
				//System.out.printf("%d %d %d\n ",right,left,medianIndex);
			}
			System.out.println("The position is "+ targetIndex);
		    System.out.println("count "+ count);
}
}



 

