import java.util.Scanner;

public class soutin {
        public static void main(String[] args) {
            System.out.println("hello world");
            String msg = "I'm happy today.";
            int a = 150;
            int o = 0226;
            int h = 0x96;
            double d = 10;
            
            System.out.println(msg);
            System.out.println(a);
            System.out.println(o);
            System.out.println(h);
            System.out.println(d);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Mi a kedvenc zened?: ");
            String zene = scanner.nextLine();

            System.out.print("Mi a kedvenc ételed?: ");
            String etel = scanner.nextLine();

            System.out.print("Mi a kedvenc hobbid?: ");
            String hobbi = scanner.nextLine();

            System.out.print("Mi a kedvenc filmed?: ");
            String film = scanner.nextLine();

            System.out.print("Mi a kedvenc uticélod?: ");
            String ut = scanner.nextLine();

            System.out.println("A kedvenc zeneszámod: " + zene);
            System.out.println("A kedvenc ételed: " + etel + ", hobbid: " + hobbi);
            System.out.println("Kedvenc filmed: ");
            System.out.println("Uticélod: " + ut);
        }
    }

