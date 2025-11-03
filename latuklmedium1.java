package com.mycompany.latihanukl3;

import java.util.Scanner;

public class Latihanukl3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        if (angka < 0) {
            System.out.println("Angka harus positif! Tidak bisa menghitung faktorial dari bilangan negatif.");
        } else {
            long faktorial = 1;

            for (int i = 1; i <= angka; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);
        }

        input.close();
    }
}
