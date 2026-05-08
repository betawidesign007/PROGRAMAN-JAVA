/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;
    interface Tanaman {
        void subur();
    }
    abstract class MakhlukHidup {
        public void bernapas() {
            System.out.println("Tanaman Melakukan Pertukaran Udara");
        }
        abstract void tumbuh();
    }
class Pohon extends MakhlukHidup implements Tanaman {
    @Override
    void tumbuh() {
        System.out.println("Durianku Tumbuh Rindang");
    }
    
    @Override
    public void subur() {
        System.out.println("Durianku Tumbuh Subur");
    }
    
    public void lebat() {
        System.out.println("Durianku Lebat Buahnya");
    }
}
/**
 *
 * @author betawi
 */
public class latihan2 {
    public static void main(String args[]) {
        Pohon p = new Pohon();
        p.bernapas();
        p.tumbuh();
        p.subur();
        p.lebat();
        
    }
}
