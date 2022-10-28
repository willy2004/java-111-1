public class Test18{
    public static void main (String[] avgs){//輸入
        
        for(int i=0;i<6;i++){
            for(int k=i-4; k<=i-4+5;k++){
                if(k<1){ 
                    System.out.print("*");
                }else{
                    System.out.printf("%d",k);                   
                }
            }
              System.out.println("");  
          
        }    
       
        
    }
}