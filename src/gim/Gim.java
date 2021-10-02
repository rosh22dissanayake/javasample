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
      my.details(6,3.5);
     my.area();
      
    }
    
}
class sph{
   double length;
    double width;
     double area;
    
   public void details(double l, double w){
        length =l;
        width =w;
        
        area =l*w;
     
        
    }
   public void area(){
       System.out.println(area);
   }
    
}
