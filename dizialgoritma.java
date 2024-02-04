import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random rnd = new Random(); 
        int[] dizi = new int[100];
        int[] dizi2=new int[100];
         int silinecek = rnd.nextInt(100); 
    
        for (int i=0; i < 100; i++) {
            int sayi = rnd.nextInt(1000) + 1;  
            dizi[i] = sayi;
             dizi2[i]=sayi;
             if(i == silinecek)
             {
              
            dizi2[i]=0;
             }
              if(dizi[i] !=  dizi2[i] )
              {
                    System.out.println( "Farklı olan eleman : " + dizi[i]);
                      
                     
                      
                      System.out.println( "Dizideki indisi: " + i);
                                          
                  
              }
             
        }
           
                    
        
       // System.out.println( "SİLİNEN İNDİS" +"  "+ silinecek );
        
       /* 
       DİZİDEKİ DEĞERLERİ YAZDIRMA 
       for (int i = 0; i < 100; i++) {
            System.out.println( "DİZİ1" + " // " + i + " // " + dizi[i]); 
           System.out.println( "DİZİ2" + " // "+ i + " // "+ dizi2[i]); 
                      

           
             
        }
            */
              
    }
   
      

    

}
