import java.util.Scanner;

public class Zadania14 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double test1;
        System.out.println("Podaj wynik z pierwszego testu:");
        test1 = klawisz.nextDouble();
        klawisz.nextLine();
        double test2;
        System.out.println("Podaj wynik z drugiego testu:");
        test2 = klawisz.nextDouble();
        klawisz.nextLine();

        double test3;
        System.out.println("Podajwynik z trzeciego testu:");
        test3 = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Podaj ilosc testow:");
        double iloscTestow= klawisz.nextDouble();
        klawisz.nextLine();
        double srednia = (test1+test2+test3)/iloscTestow;
        System.out.println(srednia);

    }
}
