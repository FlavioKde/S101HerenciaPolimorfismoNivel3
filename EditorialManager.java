package S101HerenciaPolimorfismoNivel3;

import java.util.ArrayList;
import java.util.Scanner;


public class EditorialManager {
    private ArrayList<Editor> editors;

    public EditorialManager() {
        this.editors = new ArrayList<>();
    }

    public void createEditor(Scanner scanner) {
        System.out.println("Can you tell me the name of the editor");
        String name = scanner.next();
        scanner.nextLine();

        System.out.println("Can you tell me the number of DNI");
        final String dni = scanner.next();
        scanner.nextLine();

        Editor editor = new Editor(name, dni);
        this.editors.add(editor);

        System.out.println("editor created successfully");


    }

    public void showEditor() {
        for (Editor editor : this.editors) {
            //System.out.println(editor.toString());
            editor.showEditorNews();
        }
    }

    public void deleteEditor(String dni) {

        boolean found = false;

        for (int i = 0; i < this.editors.size(); ++i) {
            Editor editor = this.editors.get(i);
            if (editor.getDni().equalsIgnoreCase(dni)) {
                this.editors.remove(i);
                System.out.println("The editor has been successfully removed");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The editor you mentioned has not been found");
        }

    }

    public void addNewsEditor(Scanner scanner) {
        System.out.println("Can you tell me the ID of the editor?");
        String dni = scanner.next();
        scanner.nextLine();


        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dni)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }


        System.out.println("Can you tell me the headline of the news");
        String holder = scanner.next();
        scanner.nextLine();

        System.out.println("Can you tell me the text of the news");
        String text = scanner.next();
        scanner.nextLine();

        System.out.println("What kind of new is football, basquet, tennis, F1, motoGp");
        String textUser = scanner.next();
        scanner.nextLine();

        if (textUser.equals("football")) {
            System.out.println("Can you tell me the competition of the news");
            String competition = scanner.next();
            scanner.nextLine();

            System.out.println("Can you tell me the club of the news");
            String club = scanner.next();
            scanner.nextLine();

            System.out.println("Can you tell me the player of the news");
            String player = scanner.next();
            scanner.nextLine();

            FootballNews footballNews = new FootballNews(competition, club, player, holder, text, 0.0, 0.0);
            double price = footballNews.calculatePriceNews();
            double score = footballNews.calculateScoreNews();

            footballNews.setPrice(price);
            footballNews.setScore(score);

            foundEditor.addNews(footballNews);

            System.out.println("Football news has been successfully created");

        }

        if (textUser.equals("basquet")) {
            System.out.println("Can you tell me the competition of the news");
            String competition = scanner.next();
            scanner.nextLine();

            System.out.println("Can you tell me the club of the news");
            String club = scanner.next();
            scanner.nextLine();


            BasquetNews basquetNews = new BasquetNews(competition, club, holder, text, 0.0, 0.0);
            double price = basquetNews.calculatePriceNews();
            double score = basquetNews.calculateScoreNews();

            basquetNews.setPrice(price);
            basquetNews.setScore(score);

            foundEditor.addNews(basquetNews);

            System.out.println("Basquet news has been successfully created");

        }
        if (textUser.equals("tennis")) {
            System.out.println("Can you tell me the name of the player");
            String player = scanner.next();
            scanner.nextLine();


            TennisNews tennisNews = new TennisNews(player, holder, text, 0.0, 0.0);
            double price = tennisNews.calculatePriceNews();
            double score = tennisNews.calculateScoreNews();

            tennisNews.setPrice(price);
            tennisNews.setScore(score);

            foundEditor.addNews(tennisNews);

            System.out.println("Tennis news has been successfully created");

        }
        if (textUser.equals("F1")) {
            System.out.println("Can you tell me the name of the team");
            String team = scanner.next();
            scanner.nextLine();


            F1News f1News = new F1News(team, holder, text, 0.0, 0.0);
            double price = f1News.calculatePriceNews();
            double score = f1News.calculateScoreNews();

            f1News.setPrice(price);
            f1News.setScore(score);

            foundEditor.addNews(f1News);

            System.out.println("Tennis news has been successfully created");

        }
        if (textUser.equals("MotoGP")) {
            System.out.println("Can you tell me the name of the team");
            String team = scanner.next();
            scanner.nextLine();


            MotoGpNews motoGpNews = new MotoGpNews(team, holder, text, 0.0, 0.0);
            double price = motoGpNews.calculatePriceNews();
            double score = motoGpNews.calculateScoreNews();

            motoGpNews.setPrice(price);
            motoGpNews.setScore(score);

            foundEditor.addNews(motoGpNews);

            System.out.println("Tennis news has been successfully created");

        }


    }

    public void calculateNewsScoreEditor(Scanner scanner) {

        System.out.println("Can you tell me the ID of the editor please?");
        String dniScore = scanner.next();
        scanner.nextLine();


        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dniScore)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }
        System.out.println("What kind of new is footballNews, basquetNews, tennisNews, F1News, motoGpNews");
        String textUser = scanner.next();
        scanner.nextLine();

        if (textUser.equalsIgnoreCase("footballNews")) {

            System.out.println("Football news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("basquetNews")) {

            System.out.println("Basquet news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("tennisNews")) {

            System.out.println("Tennis news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("F1News")) {

            System.out.println("F1 news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
        if (textUser.equalsIgnoreCase("MotoGpNews")) {

            System.out.println("MotoGp news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Score: " + n.getScore());

                }

            }

        }
    }

    public void calculateNewsPriceEditor(Scanner scanner) {

        System.out.println("Can you tell me the ID of the editor please?");
        String dniPrice = scanner.next();
        scanner.nextLine();


        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dniPrice)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }
        System.out.println("What kind of new is footballNews, basquetNews, tennisNews, F1News, motoGpNews");
        String textUser = scanner.next();
        scanner.nextLine();

        if (textUser.equalsIgnoreCase("footballNews")) {

            System.out.println("Football news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("basquetNews")) {

            System.out.println("Basquet news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("tennisNews")) {

            System.out.println("Tennis news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("F1News")) {

            System.out.println("F1 news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
        if (textUser.equalsIgnoreCase("MotoGpNews")) {

            System.out.println("MotoGp news for editor " + foundEditor.getName() + ":");
            for (News n : foundEditor.getNews()) {
                if (n instanceof FootballNews) {
                    System.out.println("Title: " + n.getHolder());
                    System.out.println("Price: " + n.getPrice());

                }

            }

        }
    }

    public void deleteNewsEditor(Scanner scanner) {

        System.out.println("Can you tell me the ID of the editor?");
        String dni = scanner.next();
        scanner.nextLine();

        Editor foundEditor = null;
        for (Editor editor : editors) {

            if (editor.getDni().equalsIgnoreCase(dni)) {
                foundEditor = editor;
                break;
            }

        }
        if (foundEditor == null) {
            System.out.println("No editor found with the provided ID.");
            return;
        }
        System.out.println("What kind of new is footballNews, basquetNews, tennisNews, F1News, motoGpNews");
        String textUser = scanner.next();
        scanner.nextLine();

        if (textUser.equalsIgnoreCase("footballNews")) {
            System.out.println("What is the title of the news");
            String textTitle = scanner.next();
            scanner.nextLine();

            //debo comparar la noticia a eliminar con el titulo

            boolean found = false;

            for (int i = 0; i < foundEditor.getNews().size(); i++) {
                // if (foundEditor.getNews().get(i) instanceof FootballNews && (FootballNews) foundEditor.getNews().get(i).getHolder().equalsIgnoreCase(textTitle)){
                if (foundEditor.getNews().get(i) instanceof FootballNews) {
                    foundEditor.getNews().remove(i);

                    System.out.println("The news of editor has been successfully removed");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("The news of editor you mentioned has not been found");
            }
        }


    }
}



