package S101HerenciaPolimorfismoNivel3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EditorialManager editorialManager = new EditorialManager();
        boolean exit = false;


        do {
            System.out.println("----Editorial Manager----");
            System.out.println("-------------------------");
            System.out.println("---------Options---------");
            System.out.println("1-Introduce editor");
            System.out.println("2-Delete editor");
            System.out.println("3-Introduce a news item to the editor");
            System.out.println("4-Delete news");
            System.out.println("5-Show news by editor");
            System.out.println("6-Calculate news score");
            System.out.println("7-Calculate price of the news");
            System.out.println("0-Exit");
            System.out.println("-------------------------");

            System.out.println("Selection one option");
            int numberSelected = scanner.nextInt();
            scanner.nextLine();

            switch (numberSelected){
                case 1:{
                        editorialManager.createEditor(scanner);
                        editorialManager.showEditor();
                        break;
                }
                case 2:{
                        System.out.println("Can you tell me the name of the editor to delete?");
                        String nameDelete = scanner.next();
                        scanner.nextLine();

                        System.out.println("Can you tell me the ID of the editor to delete?");
                        String dni = scanner.next();
                        scanner.nextLine();

                        editorialManager.deleteEditor(dni);
                        System.out.println("The editor with ID "+dni+" was eliminated");
                        break;
                }
                case 3:{
                        editorialManager.addNewsEditor(scanner);
                        break;
                }
                case 4:{
                        editorialManager.deleteNewsEditor(scanner);

                }
                case 5:{
                         editorialManager.showEditor();
                    break;
                }
                case 6:{
                        editorialManager.calculateNewsScoreEditor(scanner);
                    break;
                }
                case 7:{
                        editorialManager.calculateNewsPriceEditor(scanner);
                    break;
                }
                case 0:{
                        System.out.println("Leaving......");
                        exit = true;
                        break;

                }
            }


        }while (!exit);

    scanner.close();
    }
}
