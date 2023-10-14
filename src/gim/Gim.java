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
      my.details(20,1.5);
     my.energy();
      
    }
    
}
class main{
   double mass;
    double speed;
     double energy;
    
   public void details(double m, double s){
        mass =m;
        speed =s;
        
        energy =m*s*s;
     
        
    }
   public void energy(){
       System.out.println(energy);
   }
    
}
