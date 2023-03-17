import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double cenaposilku;
        System.out.println("Podaj cene posilku:");
        cenaposilku = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println(cenaposilku);
        double podatek = 0.675;
        System.out.println("Wartosc podatku ");
        double wartoscP = cenaposilku * podatek;
        System.out.println(wartoscP);
        double napiwek = 0.20;
        double wysN = cenaposilku * napiwek;
        System.out.println("Wysokosc napiwku" + wysN);
        double cenaC = (wartoscP + wysN + cenaposilku);
        System.out.println("Cena za całość: " + cenaC);
    }
}
