import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args){
        Scanner klawisz = new Scanner(System.in);
        String firstName;
        System.out.println("Podaj imie pierwsze:");
        firstName = klawisz.next();
        klawisz.nextLine();

        String middleName;
        System.out.println("Podaj imie drugie:");
        middleName = klawisz.next();
        klawisz.nextLine();

        String lastName;
        System.out.println("Podaj nazwisko:");
        lastName = klawisz.next();
        klawisz.nextLine();
    }
}


