import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int pudelko= 40;
        int porcjawP=10;
        double iloscC;
        System.out.println("Podajzjedzone ciasteczka:");
        iloscC = klawisz.nextDouble();
        klawisz.nextLine();
        double iloscCwP= pudelko/porcjawP;
        double kcal= 300/iloscCwP;
        double zjedzonekalorie= iloscC * kcal;
        System.out.println("Ilość zjedzonych kalorii:");
        System.out.println(zjedzonekalorie);

    }
}