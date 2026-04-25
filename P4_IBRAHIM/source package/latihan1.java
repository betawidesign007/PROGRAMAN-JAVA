import java.util.Scanner;
public class latihan1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float realisasi, kehadiran, tugas, uts, uas, total;
        float b_kehadiran, b_tugas, b_uts, b_uas;
    
    //S1 Statment Perintah
    System.out.print("Masukkan realisasi: ");
    realisasi = input.nextFloat();
    System.out.print("Masukkan kehadiran: ");
    kehadiran = input.nextFloat();
    System.out.print("Masukkan tugas: ");
    tugas = input.nextFloat();
    System.out.print("Masukkan uts: ");
    uts = input.nextFloat();
    System.out.print("Masukkan uas: ");
    uas = input.nextFloat();

    //P1 Proses 1
    b_kehadiran = (kehadiran/realisasi)*10;
    b_tugas = (tugas*20)/100;
    b_uts = (uts*30)/100;
    b_uas = (uas*40)/100;
    total = b_kehadiran + b_tugas + b_uts + b_uas;

    //S2 tampilkan realisasi, kehadiran, tugas, uts, uas, total
    System.out.println("\n===HASIL===");
    System.out.println("Realisasi: " + realisasi);
    System.out.println("Kehadiran: " + kehadiran);
    System.out.println("Tugas: " + tugas);
    System.out.println("UTS: " + uts);
    System.out.println("UAS: " + uas);
    System.out.println("Total Nilai: " + total);

}
}