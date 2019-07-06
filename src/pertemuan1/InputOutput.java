package pertemuan1;

import java.util.Scanner;

class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input nama kamu: ");
        String inputNama = scanner.nextLine();
        System.out.println("Nama kamu adalah " + inputNama);
    }
}
