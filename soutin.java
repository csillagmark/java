import java.util.Scanner;

public class soutin {
        public static void main(String[] args) {
            System.out.println("Márkócicus <3");
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

            System.out.print("mi a kedvenc zened?: ");
            String zene = scanner.nextLine();

            System.out.print("mi a kedvenc ételed?: ");
            String etel = scanner.nextLine();

            System.out.print("mi a kedvenc hobbitd?: ");
            String hobbi = scanner.nextLine();

            System.out.print("mi a kedvenc filmed?: ");
            String film = scanner.nextLine();

            System.out.print("mi a kedvenc uticelod?: ");
            String ut = scanner.nextLine();

            System.out.println(zene + etel + hobbi + film + ut);
        }
    }

