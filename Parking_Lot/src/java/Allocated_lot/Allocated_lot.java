/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Allocated_lot;
import java.util.Random;

/**
 *
 * @author nallu
 */
public class Allocated_lot {
    public int number_of_lots=100;
    Random rand=new Random();
    int rand_int1;
    String available_lot;
    public void setAvailable_lot(String available_lot){
        this.available_lot=available_lot;
    }
   
    boolean[] lot1;
    public Allocated_lot(){
        available_lot="lot1";
        
        lot1=new boolean[500];
        
    }
    public int get_lot(){
        
        rand_int1 = rand.nextInt(20);
        
        return rand_int1;
        
}
    
    
    
}
