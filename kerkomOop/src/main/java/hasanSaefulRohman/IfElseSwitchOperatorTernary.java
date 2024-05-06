package hasanSaefulRohman;

import java.util.Scanner;
public class IfElseSwitchOperatorTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Selection statement (if-else) dengan operator ternary
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        String jenisAngka = (angka > 0) ? "positif" : (angka < 0) ? "negatif" : "nol";
        System.out.println("Angka yang dimasukkan adalah bilangan " + jenisAngka);

        // Selection statement (switch) dengan operator ternary
        System.out.print("Masukkan pilihan (A, B, atau C): ");
        char pilihan = input.next().charAt(0);

        String hasilPilihan = (pilihan == 'A') ? "Anda memilih pilihan A"
        : (pilihan == 'B') ? "Anda memilih pilihan B"
        : (pilihan == 'C') ? "Anda memilih pilihan C"
        : "Pilihan yang dimasukkan tidak valid";
        System.out.println(hasilPilihan);
    }
}
