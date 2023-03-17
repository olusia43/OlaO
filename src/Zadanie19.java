import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double konsumenci = 12467;
        double procent = 0.14;
        double przyblizona = konsumenci * 0.14;
        System.out.println(przyblizona);
        double SC = 0.64;
        double smakcytrus = przyblizona* SC;
        System.out.println(smakcytrus);
    }
}
