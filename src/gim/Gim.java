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
      main demo= new main();
      demo.data(10,3,2);
     demo.fspeed();
      
    }
    
}
class main{
   double speed;
    double accesa;
    double time;
     double fspeed;
    
   public void data(double u, double a,double t){
        speed =u;
         accesa =a;
       time = t;
        
        fspeed = u + a*t;
     
        
    }
   public void fspeed(){
       System.out.println(fspeed);
   }
    
}
