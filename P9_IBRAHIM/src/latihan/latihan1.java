/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
    interface Makhluk {
        void sound();
    }

    abstract class LivingThing {
        public void breathe () {
            System.out.println("Makhluk Hidup Bernapas");
        }
        
        abstract void move();
        
    }
    
    class human extends LivingThing implements Makhluk {
        @Override
        void move() {
            System.out.println("Manusia Berjalan");
        }
        
        @Override
        public void sound() {
            System.out.println("Manusia Berbicara");
        }
    }
        
/**
 *
 * @author betawi
 */
public class latihan1 {
    public static void main(String args[]) {
        human manusia = new human();
        manusia.breathe();
        manusia.move();
        manusia.sound();
    }
}
