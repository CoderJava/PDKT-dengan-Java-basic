package pertemuan2;

class PerulanganWhile {
    public static void main(String[] args) {
        int nilai = 1;
        while (nilai <= 10) {
            System.out.println(nilai);
            nilai = nilai + 2;
            if (nilai > 5 && nilai <= 9) {
                break;
            }
        }
    }
}
