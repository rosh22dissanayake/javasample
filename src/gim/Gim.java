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
      sph my= new sph();
      my.details(7,3.5);
     my.peri();
      
    }
    
}
class sph{
   double length;
    double radius;
     double peri;
    
   public void details(double l, double r){
        length =l;
        radius =r;
        
        peri =l + 2*3.14*r;
     
        
    }
   public void peri(){
       System.out.println(peri);
   }
    
}
