import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double iloscciasteczek;
        System.out.println("Podajilosc ciasteczek");
        iloscciasteczek = klawisz.nextDouble();
        klawisz.nextLine();
        double skladnik1 = 1.5/iloscciasteczek;
        double skladnik2 = 1/iloscciasteczek;
        double skladnik3 = 2.75/iloscciasteczek;
        System.out.println(skladnik1);
        System.out.println(skladnik2);
        System.out.println(skladnik3);


    }
}
