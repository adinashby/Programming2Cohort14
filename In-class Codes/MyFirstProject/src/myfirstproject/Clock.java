/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstproject;

/**
 *
 * @author hashemim
 */
public class Clock {
    int hour;
    int minute;
    int second;
    
    static int numberOfClocks = 0;
    
    public Clock() {
        hour = 0;
        minute = 0;
        second = 0;
        
        ++numberOfClocks;
    }
    
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
        ++numberOfClocks;
    }
    
    public Clock(Clock clock) {
        this.hour = clock.hour;
        this.minute = clock.minute;
        this.second = clock.second;
        
        ++numberOfClocks;
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        
    }
}
