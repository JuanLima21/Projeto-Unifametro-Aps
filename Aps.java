
import java.util.Scanner;


public class Aps {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Boas vindas ! ");
        System.out.println("Mensagem sobre igualdade de genero e impoortancia"); // POR MENSAGEM CORRETA

      System.out.println( "Escolha a uma opção que deseje ler mais sobre : ");
      

      // DEFINIR ESTRUTURA DE REPETIÇÃO PARA SELEÇÃO NO MENU USANDO SWITCH
        System.out.println("opçoes para ler mais 1- mulheerr ;; 2 - homem ");
        int selecao = sc.nextInt();


      switch (selecao) {
                case 1 -> System.out.println("menu 1");
                case 2 -> System.out.println(" menu 2 ! ");
                case 3 -> System.out.println("Menu 3 ");
 
            }
         // while (selecao != 3);




 

    }
}
