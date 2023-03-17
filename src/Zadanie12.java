import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double km;
        System.out.println("Podaj przejechane kilometry:");
        km = klawisz.nextDouble();
        klawisz.nextLine();

        double litr;
        System.out.println("Podaj zużytą  ilość paliwa:");
        litr = klawisz.nextDouble();
        klawisz.nextLine();
        double kmnalitr = km / litr;
        System.out.println(kmnalitr);
    }
}
