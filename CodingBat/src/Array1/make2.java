/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array1;

/**
 *
 * @author someya.sayeh
 */
public class make2 {
     
 public int[] make2(int[] a, int[] b) {
  
         int []  num= new int[2]; 
 
   if((a.length==1 && b.length==1) || (a.length>=2 || b.length>=2) )  {
       
       if(a.length>=2){
            num= new int[]{a[0],a[1] }; 
       }
       
      else  if(a.length==1){
             num= new int[]{a[0],b[0] }; 
       }
        else {
             num= new int[]{b[0],b[1] }; 
       }
       
       
   }    

         return num;
     
     
}
}
