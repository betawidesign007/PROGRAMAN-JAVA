import java.util.Scanner;

public class tugas1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nama_buah;
        int jumlah;
        System.out.print("input Nama Buah: ");
        nama_buah = input.nextLine();
        System.out.print("input Jumlah: ");
        jumlah = input.nextInt();
        System.out.print("")
        System.out.println("Nama Buah:" + nama_buah);
        System.out.println("Jumlah:" + jumlah);
    }
}