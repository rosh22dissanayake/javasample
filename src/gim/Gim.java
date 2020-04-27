/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gim;

/**
 *
 * @author Chathani
 */
public class Gim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      box my= new box();
      my.details(10, 20, 30);
     my.volume();
      
    }
    
}
class box{
    int length;
    int width;
    int height;
    int total;
    
    public void details(int l, int w, int h){
        length =l;
        width =w;
        height =h;
        total =l*w*h;
     
        
    }
   public void volume(){
       System.out.println(total);
   }
    
}