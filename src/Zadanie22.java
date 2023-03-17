import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double Lakcji = 1000;
        double cenaZa1 = 32.87;
        double prowizjaA = cenaZa1 * 0.02;
        double kwotaZA =prowizjaA + cenaZa1;
        double kwotazaplacona= Lakcji*kwotaZA;
        System.out.println(kwotazaplacona);
        System.out.println(prowizjaA*Lakcji);
        double kwotaDJ= Lakcji*(33.92-(33.92*0.02));
        System.out.println(kwotaDJ);
        double wartprowizji = (33.92*0.02)*Lakcji;
        System.out.println(wartprowizji);
        double zysk = kwotazaplacona-(kwotaDJ+wartprowizji);
        System.out.println(zysk);

    }
}
