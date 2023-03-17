import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double akcje = 600;
        double akcja1 = 21.77;
        double cenazaWA = akcje * akcja1;
        System.out.println(cenazaWA);
        double wysP = 0.02;
        double prowizja = akcje * akcja1 * wysP;
        System.out.println(prowizja);
        double lacznaK = cenazaWA+prowizja;
        System.out.println(lacznaK);
    }
}