package pertemuan2;

class KombinasiPerulangan {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 10) {
            /*for (int b = 1; b <= a; b++) {
                System.out.print(b);
            }*/
            if (a % 2 == 0) {
                System.out.println(a + " merupakan bilangan genap");
            } else {
                System.out.println(a + " merupakan bilangan ganjil");
            }
            a = a + 1;
        }
    }
}
