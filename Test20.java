public class Test20{
    public static void main (String[] avgs){//輸入
      int width=0;
        for(int i= -4;i<=4;i++){
            for(int k= -5; k<=5;k++){
                if(Math.abs(k) > width ) 
                    System.out.print("*");
                else
                    System.out.print(" ");                   
                     }
                    System.out.println("");  
					if(i < 0)
                    width++;
				    else
					width--;	
			
		}
	}
}