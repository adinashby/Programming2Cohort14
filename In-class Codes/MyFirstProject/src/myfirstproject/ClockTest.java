/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstproject;

/**
 *
 * @author hashemim
 */
public class ClockTest {
    public static void main(String[] args) {
        Clock myClock1 = new Clock();
        Clock myClock2 = new Clock();
        
        Clock myClock3 = new Clock(15,35,10);
        Clock copyClock = new Clock(myClock3);
        
        System.out.println(myClock3);
    }
    
}
