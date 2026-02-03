package aula3;
import java.util.Scanner;
public class ifElse {
    static void main() {
        Scanner aula = new Scanner(System.in);

        IO.println("digite sua nota 1");
        int notas=aula.nextInt();
        IO.println("digite sua nota 2");
        int nota2= aula.nextInt();
        IO.println("digite sua nota 3");
        int nota3= aula.nextInt();
        int media=(notas + nota2 + nota3) / 3;
        if (media<4){
            IO.println("reprovado");

        }else if (media <= 6){
            IO.println("recuperação");

        }else {
            IO.println("aprovado");

        }



    }
}
