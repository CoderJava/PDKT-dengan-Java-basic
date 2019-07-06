package pertemuan1;

class OperatorCondition {
    public static void main(String[] args) {
        int nilaiA = 5;
        int nilaiB = 2;
        boolean kondisi1 = nilaiA == 5; // true
        boolean kondisi2 = nilaiA % 2 >= 1; // true
        boolean kondisi3 = nilaiA == nilaiB; // false
        boolean kondisi4 = nilaiB % 2 == 0; // true
        System.out.println("Nilai A: " + nilaiA);
        System.out.println("Nilai B: " + nilaiB);
        if (kondisi1 && kondisi2) {
            System.out.println("Nilai A merupakan bilangan prima dan bilangan ganjil");
        } else if (kondisi1){
            System.out.println("Nilai A merupakan angka 5");
        } else {
            System.out.println("Nilai A merupakan bukan bilangan prima dan bilangan ganjil");
        }

        if (kondisi3 || kondisi4) {
            System.out.println("Nilai A sama dengan Nilai B atau Nilai B merupakan bilangan genap");
        } else {
            System.out.println("Nilai A tidak sama dengan nilai B atau Nilai B bukan bilangan genap");
        }
    }
}
