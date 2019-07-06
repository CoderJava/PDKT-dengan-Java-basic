package pertemuan1;

class OperatorEqualityAndRelational {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 9;
        boolean kondisi1 = nilaiA == nilaiB;
        boolean kondisi2 = nilaiA > nilaiB;
        boolean kondisi3 = nilaiA >= nilaiB;
        boolean kondisi4 = nilaiA < nilaiB;
        boolean kondisi5 = nilaiA <= nilaiB;
        boolean kondisi6 = nilaiA != nilaiB;
        System.out.println("Apakah nilai A sama dengan nilai B: " + kondisi1);
        System.out.println("Apakah nilai A lebih besar dari nilai B: " + kondisi2);
        System.out.println("Apakah nilai A lebih besar sama dengan nilai B: " + kondisi3);
        System.out.println("Apakah nilai A lebih kecil dari nilai B: " + kondisi4);
        System.out.println("Apakah nilai A lebih kecil sama dengan nilai B: " + kondisi5);
        System.out.println("Apakah nilai A tidak sama dengan nilai B: " + kondisi6);
    }
}
