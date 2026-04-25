package Latihan;

import java.util.Scanner;

public class Class {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai Akhir (0-100): ");
        double nilai = input.nextDouble();

        System.out.print("Masukkan Kehadiran (0-21): ");
        double kehadiran = input.nextDouble();

        String grade;

        if (kehadiran < 15.75) {
            grade = "E (kehadiran < 75%)";
        } else if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Total Nilai: " + nilai);
        System.out.println("Total Kehadiran: " + kehadiran);
        System.out.println("Grade Akhir: " + grade);
    }
}