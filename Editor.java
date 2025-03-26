package S101HerenciaPolimorfismoNivel3;

import java.util.ArrayList;

public class Editor {
    private String name;
    private final String dni;
    private static final double salary = 1500.0;
    private ArrayList<News>news;

    public Editor(String name, String dni){
        this.name = name;
        this.dni = dni;
        this.news = new ArrayList<>();

    }
    public void addNews(News news){
        this.news.add(news);
    }
    public void showEditorNews() {
        System.out.println("Editor: ");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getDni());
        System.out.println("News:");
        System.out.println("News of editor: " + getNews());

        if (this.news.isEmpty()) {
            System.out.println("This editor doesn't have any news.");
        } else {
            for (News news : this.news) {
                news.showNews();
            }
        }
    }
    public void removeNews (News news){
        this.news.remove(news);
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<News> getNews() {
        return news;
    }

    @Override
    public String toString() {
        return "Editor " + "\n"+
                "Name= " + name + '\n' +
                "DNI= " + dni + '\n' +
                "Salary= " + salary + '\n' +
                "News=" + news
                ;
    }
}

