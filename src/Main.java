import java.util.Scanner;
public class Main {

    static void desen (int a){
        System.out.print(a+" ");
        int total=a;


        for (int i=a;i>=0;i--) {
            total -= 5;
            System.out.print(total + " ");
            if (total<=0){break;}
            }

        for (int i=a;i>=0;i--) {
            total += 5;
            System.out.print(total + " ");
            if (total==a){break;}
        }

    }



    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int a = imp.nextInt();
        desen(a);
    }
}