import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b,c,sonuc;
        Scanner inp=new Scanner(System.in);
        System.out.print("a sayısını girin:");
        a=inp.nextInt();

        System.out.print("b sayısını girin:");
        b=inp.nextInt();

        System.out.print("c sayısını girin:");
        c=inp.nextInt();

        sonuc=a+b*c-b;
        System.out.print("sonuç: "+sonuc);

    }
}