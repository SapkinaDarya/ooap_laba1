import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        NewCipher bCipher = new Binary();

        String res = bCipher.cipher(a);
        System.out.println(res);
        String decod = bCipher.decod(res);
        System.out.println(decod);

        NewCipher cCipher = new Caesar();
        a = scanner.nextLine();
        res = cCipher.cipher(a);
        System.out.println(res);
        decod = cCipher.decod(res);
        System.out.println(decod);

        NewCipher tCipher = new Transp();
        a = scanner.nextLine();
        res = tCipher.cipher(a);
        System.out.println(res);
        decod = tCipher.decod(res);
        System.out.println(decod);


    }
}
