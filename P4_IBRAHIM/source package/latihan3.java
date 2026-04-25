import java.util.Scanner;
public class latihan3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float makan, transport, belanja;
        
    
    //S1 Statment Perintah
    System.out.print("Masukkan makan: ");
    makan = input.nextFloat();
    System.out.print("Masukkan transport: ");
    transport = input.nextFloat();
    System.out.print("Masukkan belanja: ");
    belanja = input.nextFloat();
    
    //P1 Proses 1
    float total = makan + transport + belanja;
    float discont = total * 10/100;
    float total_bayar = total - discont;

    //S2 tampilkan hasil
    System.out.println("\n=== HASIL ===");
    System.out.println("Total Sebelum Diskon: " + total);
    System.out.println("Diskon (10%): " + discont);
    System.out.println("Total Setelah Diskon: " + total_bayar);

}
}