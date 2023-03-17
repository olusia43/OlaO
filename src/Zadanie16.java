import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj ulubione miasto:");
        String name = klawisz.nextLine();

  int dlugosc=name.length();
        String duze, male;
        duze = name.toUpperCase();
        male = name.toLowerCase();
        System.out.println(name);
        char pierwszyZnak = name.charAt(0);
        System.out.println("DługośćNazwy:"+ dlugosc+"\n"+duze+"\n"+male+"\n"+pierwszyZnak);

    }
}

