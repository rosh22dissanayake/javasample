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
      my.details(7.2,3.1);
     my.area();
      
    }
    
}
class sph{
   double radius;
    double height;
     double area;
    
   public void details(double r, double h){
        radius =r;
        height =h;
        
        area =3.14*r*r*h;
     
        
    }
   public void area(){
       System.out.println(area);
   }
    
}
