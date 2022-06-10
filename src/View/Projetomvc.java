package View;

import java.util.Scanner;
import Control.DB; 

public class Projetomvc {

    public static void main(String[] args) {
       
        DB dataBaseLojinha = new DB();
        
       Scanner leitor = new Scanner(System.in);
       dataBaseLojinha.conecta();
       
       if(dataBaseLojinha.estaConectado()){
       }
        int menu = 0;
        while (menu != 4) {
            Menu.imprimeMenu();
            menu = leitor.nextInt();

            switch (menu) {
                case 1:
                    dataBaseLojinha.listar();
                case 2:
                    dataBaseLojinha.inserir("n", 11, "x", 85);
                case 3:
                   dataBaseLojinha.editar(1,2);
                case 4:
                  System.out.println("Até logo!");
                    break;
               
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
