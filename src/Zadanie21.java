import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj kwote ktora ktora desponujesz");
        double kwota = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Podajroczna stope oprocentowania");
        double stopa = klawisz.nextDouble()/100;
        klawisz.nextLine();

        System.out.println("Ile razy srodki sa kapitalizowane");
        int kapitalizacja = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Ile lat kwita beda na koncie");
        int lata = klawisz.nextInt();
        double wynik = kwota * Math.pow((1 + stopa / kapitalizacja), (kapitalizacja * lata));
        System.out.println("Na twoim koncie bedzie" + wynik);

    }
}
