/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialjavadasar;

/**
 *
 * @author iwicaksana
 */
public class Piramida {
    
    public static void main(String[] args) {
        System.out.println("PIRAMIDA SETENGAH KANAN");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        System.out.println("PIRAMIDA SETENGAH KIRI");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("PIRAMIDA PENUH");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
