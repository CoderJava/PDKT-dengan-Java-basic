package pertemuan2;

class PerulanganDoWhile {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println(a);
            a = a + 1;
            if (a == 6) {
                break;
            }
        } while (a <= 10);
    }
}
