package pertemuan2;

class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        /*mobilku.cetakWarna();*/
        String warnaMobilku = mobilku.ambilWarna();
        System.out.println("Warna mobilku: " + warnaMobilku);

        Mobil mobilKawan = new Mobil("hitam");
        /*mobilKawan.cetakWarna();*/
        String warnaMobilKawan = mobilKawan.ambilWarna();
        System.out.println("Warna mobil kawan: " + warnaMobilKawan);
    }
}
