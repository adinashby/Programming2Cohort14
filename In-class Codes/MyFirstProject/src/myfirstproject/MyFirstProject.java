/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstproject;

/**
 *
 * @author hashemim
 */
public class MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte myByteForThisLoop = 0;
        short myShort = 32;
        char myChar = 12;
        int myInt = 5 / 2;

        float myFloat = 5.0f / 2;
        double myDouble = 5.0d / 2;

        long myLong = 234234234L;

        boolean myBoolean = true; // or false

        System.out.println("myInt is: " + myInt);
        System.out.println("myFloat is: " + myFloat);
        System.out.println("myDouble is: " + myDouble);
        System.out.println("myLong is: " + myLong);
        System.out.println("myBoolean is: " + myBoolean);
        System.out.println("");

        sayHi();

    }

    public static void sayHello() {
        System.out.println("Helloooo");
    }

    public static void sayHi() {
        System.out.println("Hiiii");
        
        sayHiJames();
    }

//    public int sayHi() {
//        System.out.println("Hiiii");
//        sayHiJames();
//        
//        return 0;
//    }

    public static void sayHiJames() {
        System.out.println("Hiiii James!!");
    }

}
