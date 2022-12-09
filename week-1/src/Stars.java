import java.util.Scanner;

public class Stars {

    public static void trigle(int num) {


        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void opTrigle(int num) {
        for (int i = 1; i <= num; i++) {

            for (int j = i; j <= num; j++) {

                if (j != num) {
                    System.out.print(" ");
                } else {
                    for (int k = 1; k <= i; k++)
                        System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yıldızlarla çizilecek üçgen için;" +
                "\nSola yaslanmış üçgen istiyorsanız 1'e" +
                "\nSağa yaslanmış üçgen istiyorsanız 2'ye basınız");
        int sel = scan.nextInt();

        System.out.println("Yıldızınız kaç satırdan oluşsun");
        int num = scan.nextInt();
        switch (sel) {
            case 1:
                trigle(num);
                break;
            case 2:
                opTrigle(num);
        }

    }
}
