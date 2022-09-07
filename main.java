public class main {
    public static void main(String[] args) {

        for (int a = 0; a <=5; a++) {
            for (int b = 5; b > a; b-=1) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}