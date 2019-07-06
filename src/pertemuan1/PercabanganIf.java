package pertemuan1;

class PercabanganIf {
    public static void main(String[] args) {
        int nilaiA = 5;
        int nilaiB = 2;
        boolean bilanganAGanjil = nilaiA % 2 >= 1;
        boolean bilanganBGanjil = nilaiB % 2 >= 1;
        if (bilanganAGanjil && bilanganBGanjil) {
            System.out.println("Nilai A dan B merupakan bilangan ganjil");
        } else if (bilanganAGanjil) {
            System.out.println("Nilai A merupakan bilangan ganjil");
        } else if (bilanganBGanjil) {
            System.out.println("Nilai B merupakan bilangan ganjil");
        } else {
            System.out.println("Nilai A dan B merupakan bukan bilangan ganjil");
        }
    }
}
