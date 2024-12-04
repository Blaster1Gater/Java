package HPP;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tudo{
    public class Util{
        public static String Input(String Mensagem){
            Scanner scanner = new Scanner(System.in);

            // Solicitar ao usuário para inserir algo
            System.out.print(Mensagem);

            // Ler o input como String (equivalente ao input() do Python)
            String input = scanner.nextLine();

            // Fechar o Scanner
            scanner.close();

            // Retorna o valor digitado
            return input;
        }

        public static void Print(String Mensagem, boolean LN){
            if (LN){
                System.out.println(Mensagem);
            }
            else{
                System.out.print(Mensagem);
            }
        }
        public static int Rand(int Min, int Max){
            return ThreadLocalRandom.current().nextInt(Min, Max + 1);
        }
    };

    public class Inutil{
        public static void OMG(){
            while (true){
                Util.Print(
                            Colors.ALL_TEXT_COLORS[ThreadLocalRandom.current().nextInt(0, Colors.ALL_TEXT_COLORS.length)] + 
                            Colors.ALL_BACKGROUND_COLORS[ThreadLocalRandom.current().nextInt(0, Colors.ALL_BACKGROUND_COLORS.length)] + 
                            Char.Tudo[ThreadLocalRandom.current().nextInt(0, Char.Tudo.length)] + 
                            Colors.RESET,
                            false
                        );

            }
        }
    }
}