import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double produkt;
        System.out.println("Podaj cene produktu:");
        produkt = klawisz.nextDouble();
        klawisz.nextLine();

        double podatekstanowy;
        podatekstanowy = (double)produkt * 0.04;
        System.out.println(podatekstanowy);

        double podateklokalny;
        podateklokalny = (double)produkt * 0.02;
        System.out.println(podateklokalny);


        double calkowitacena = (double)produkt +podatekstanowy + podateklokalny;
        System.out.println(calkowitacena);
    }
}
