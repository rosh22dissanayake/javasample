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
      main my= new main();
      my.details(30,3.5);
     my.force();
      
    }
    
}
class main{
   double mass;
    double accela;
     double force;
    
   public void details(double m, double a){
        mass =m;
        accela =a;
        
        force =m*a;
     
        
    }
   public void force(){
       System.out.println(force);
   }
    
}
