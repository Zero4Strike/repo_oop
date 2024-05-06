package hasanSaefulRohman;

import java.util.Scanner;
public class OperatorTernaryAndSelection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
//        statment selection if-else dimulai
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();
        
        if (angka > 0){
            System.out.println("Angka yang dimasukkan adalah bilangan positif");
        }else if(angka < 0){
            System.out.println("Angka yang dimasukkan adalah bilangan negatif");
        }else{
            System.out.println("Angka yang dimasukkan adalah nol");
        }
        
//        operator artimatika
        int x = 5;
        int y = 3;
        int hasilPenjumlahan = x + y;
        int hasilPengurangan = x - y;
        int hasilPerkalian = x * y;
        double hasilPembagian = (double) x / y;
        
//      Selection Statement (switch)
        System.out.print("Masukkan pilihan (A, B, atau C): ");
        char pilihan = input.next().charAt(0);
        
        switch (pilihan){
            case 'A':
                System.out.print("Anda Memilih A");
                break;
            case 'B':
                System.out.print("Anda Memilih B");
                break;
            case 'C':
                System.out.print("Anda Memilih C");
                break;
            default :
                System.out.print("Pilihan yang anda pilih tidak valid");
                break;
        }
    }
}
