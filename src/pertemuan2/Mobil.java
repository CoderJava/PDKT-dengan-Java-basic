package pertemuan2;

class Mobil {
    String warna;

    Mobil() {
        warna = "hijau";
    }

    Mobil(String warna) {
        this.warna = warna;
    }

    void cetakWarna() {
        System.out.println("Warna mobilnya adalah: " + warna);
    }

    String ambilWarna() {
        return warna;
    }
}
