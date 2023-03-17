import java.util.Scanner;
public class Zadanie23 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double V;
        System.out.println("Podaj liczbe sadzonek:");
        V = klawisz.nextDouble();
        klawisz.nextLine();
        double R;
        System.out.println("Podaj dlugosc rzedow");
        R = klawisz.nextDouble();
        klawisz.nextLine();
        double E;
        System.out.println("Podaj ilosc miejsca zajmowanegoi");
        E = klawisz.nextDouble();
        klawisz.nextLine();
        double S;
        System.out.println("Podaj miejsca zajmowanego miedzy sadzonkami :");
        S = klawisz.nextDouble();
        klawisz.nextLine();
        double wynik =(R-2*E) /S;
        System.out.println(wynik);

    }
}