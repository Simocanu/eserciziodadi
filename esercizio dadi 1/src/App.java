import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int dado1, dado2, dadopc1, dadopc2, risposta, sommadadi, sommadadipc;

        System.out.println("Giochiamo a dadi!");
        System.out.println("Vuoi tirare i dadi? 1)Sì 2)No");
        risposta = sc.nextInt();

        if (risposta == 1) {

            dado1 = rnd.nextInt(6) + 1;
            dado2 = rnd.nextInt(6) + 1;

            sommadadi = dado1 + dado2;

            System.out.println("Hai fatto: " + sommadadi);

            dadopc1 = rnd.nextInt(6) + 1;
            dadopc2 = rnd.nextInt(6) + 1;

            sommadadipc = dadopc1 + dadopc2;

            System.out.println("Il pc ha fatto: " + sommadadipc);

            if (sommadadi == sommadadipc)
                System.out.println("Hai pareggiato.");
            else {
                if (sommadadi > sommadadipc)
                    System.out.println("Hai vinto!");
                else
                    System.out.println("Il pc ha vinto.");
                }
           

        }

        sc.close();

    }
}
