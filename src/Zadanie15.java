import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cenaPlytkiD;
        System.out.println("Podaj cene detaliczna płytki:");
        cenaPlytkiD = klawisz.nextDouble();
        klawisz.nextLine();
        double procent= 0.4;

        double zysk = cenaPlytkiD * procent;
        System.out.println("Zysk:"+ zysk);
    }
}
