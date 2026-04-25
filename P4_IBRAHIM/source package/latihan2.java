import java.util.Scanner;
public class latihan2 {
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
    float p_makan = (makan/total)*100;
    float p_transport = (transport/total)*100;
    float p_belanja = (belanja/total)*100;

    //S2 tampilkan hasil
    System.out.println("\ntotal: " + total);
    System.out.println("Makan: " + p_makan + "%");
    System.out.println("Transport: " + p_transport + "%");
    System.out.println("Belanja: " + p_belanja + "%");


}
}