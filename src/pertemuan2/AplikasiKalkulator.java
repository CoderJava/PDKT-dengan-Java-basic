package pertemuan2;

import java.util.InputMismatchException;
import java.util.Scanner;

class AplikasiKalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===APLIKASI KALKULATOR===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Input Menu: ");
        try {
            int menu = scanner.nextInt();
            int angkaA;
            int angkaB;
            int output;
            /*if (menu == 1) {
                // lakukan operasi penjumlahan
                System.out.print("Input Angka A: ");
                angkaA = scanner.nextInt();
                System.out.print("Input Angka B: ");
                angkaB = scanner.nextInt();
                output = angkaA + angkaB;
                System.out.println("Output: " + output);
            } else if (menu == 2) {
                // lakukan operasi pengurangan
                System.out.print("Input Angka A: ");
                angkaA = scanner.nextInt();
                System.out.print("Input Angka B: ");
                angkaB = scanner.nextInt();
                output = angkaA - angkaB;
                System.out.println("Output: " + output);
            } else if (menu == 3) {
                // lakukan operasi perkalian
                System.out.print("Input Angka A: ");
                angkaA = scanner.nextInt();
                System.out.print("Input Angka B: ");
                angkaB = scanner.nextInt();
                output = angkaA * angkaB;
                System.out.println("Output: " + output);
            } else if (menu == 4) {
                // lakukan operasi pembagian
                System.out.print("Input Angka A: ");
                angkaA = scanner.nextInt();
                System.out.print("Input Angka B: ");
                angkaB = scanner.nextInt();
                output = angkaA / angkaB;
                System.out.println("Output: " + output);
            } else {
                System.out.println("Input tidak valid");
            }*/

            switch (menu) {
                case 1:
                    // lakukan operasi penjumlahan
                    System.out.print("Input Angka A: ");
                    angkaA = scanner.nextInt();
                    System.out.print("Input Angka B: ");
                    angkaB = scanner.nextInt();
                    output = angkaA + angkaB;
                    System.out.println("Output: " + output);
                    break;
                case 2:
                    // lakukan operasi pengurangan
                    System.out.print("Input Angka A: ");
                    angkaA = scanner.nextInt();
                    System.out.print("Input Angka B: ");
                    angkaB = scanner.nextInt();
                    output = angkaA - angkaB;
                    System.out.println("Output: " + output);
                    break;
                case 3:
                    // lakukan operasi perkalian
                    System.out.print("Input Angka A: ");
                    angkaA = scanner.nextInt();
                    System.out.print("Input Angka B: ");
                    angkaB = scanner.nextInt();
                    output = angkaA * angkaB;
                    System.out.println("Output: " + output);
                    break;
                case 4:
                    // lakukan operasi pembagian
                    System.out.print("Input Angka A: ");
                    angkaA = scanner.nextInt();
                    System.out.print("Input Angka B: ");
                    angkaB = scanner.nextInt();
                    output = angkaA / angkaB;
                    System.out.println("Output: " + output);
                    break;
                default:
                    System.out.println("Input tidak valid");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Input harus angka 1, 2, 3 atau 4");
        }
    }
}
