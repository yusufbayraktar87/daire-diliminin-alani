import java.util.Scanner;

public class dairedilimi {
    public static void main(String[] args){

        // Yarıçapı ve derecesi girilen daire diliminin alanını hesaplama

        Scanner input = new Scanner(System.in);

        int r, alfa;
        double pi = 3.14, alan;

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = input.nextInt();
        System.out.print("Açıyı Giriniz : ");
        alfa = input.nextInt();

        alan = pi * r * r * (alfa / 360);

        System.out.println("Yarıçapı " + r + " Olan " + alfa + " Derecelik " + "Daire Diliminin Alanı : " + alan);
    }
}
