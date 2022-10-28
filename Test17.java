public class Test17{
    public static void main (String[] avgs){//輸入
        
        for(int i=0;i<6;i++){
            for(int k=5; k>=0;k--){
                if(k>i){ 
                    System.out.print("*");
                }else{
                    System.out.printf("%d",(k-i-1)*-1);                   
                }
            }
              System.out.println("");  
          
        }    
       
        
    }
}