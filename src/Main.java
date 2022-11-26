import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int number= inp.nextInt();

        int basDegeri=0;
        int tempnumber=number;
        int toplam=0;

        while(tempnumber!=0){
           basDegeri=tempnumber%10;
           tempnumber/=10;
           toplam+=basDegeri;

        }
        System.out.println(toplam);
    }
}