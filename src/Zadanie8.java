import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args){
        Scanner klawisz = new Scanner(System.in);
       int pomieszczenie1=(3*4);
       int pomieszczenie2=(3*4);
        int pomieszczenie3=(2*3);
        int pomieszczenie4=(2*2);

        System.out.println("Podaj długość pomieszczenia1:");

        int dlu= klawisz.nextInt();
        System.out.println("Podaj szerokość pomieszczenia1:");
        int szer= klawisz.nextInt();
        pomieszczenie1 = (dlu*szer);
        klawisz.nextLine();
        System.out.println("Podaj długość pomieszczenia2:");

         dlu= klawisz.nextInt();
        System.out.println("Podaj szerokość pomieszczenia2:");
        szer= klawisz.nextInt();
        pomieszczenie2 = (dlu*szer);
        klawisz.nextLine();
        System.out.println("Podaj długość pomieszczenia3:");

        dlu= klawisz.nextInt();
        System.out.println("Podaj szerokość pomieszczenia3:");
        szer= klawisz.nextInt();
        pomieszczenie3 = (dlu*szer);
        klawisz.nextLine();

        System.out.println("Podaj długość pomieszczenia4:");

         dlu= klawisz.nextInt();
        System.out.println("Podaj szerokość pomieszczenia4:");
         szer= klawisz.nextInt();
        pomieszczenie4 = (dlu*szer);
        klawisz.nextLine();



    }

}
