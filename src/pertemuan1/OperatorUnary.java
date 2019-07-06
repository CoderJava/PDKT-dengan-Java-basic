package pertemuan1;

class OperatorUnary {
    public static void main(String[] args) {
        int nilaiA = -10;
        int nilaiB = 3;
        System.out.println("nilai A: " + nilaiA);
        System.out.println("nilai B: " + nilaiB);
        int tambahSatu = ++nilaiA;
        int kurangSatu = --nilaiB;
        boolean iniPagi = !true;
        System.out.println("tambah satu nilai A: " + tambahSatu);
        System.out.println("kurang satu nilai B: " + kurangSatu);
        System.out.println("ini pagi: " + iniPagi);
    }
}
