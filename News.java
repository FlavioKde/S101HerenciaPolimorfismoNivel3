package S101HerenciaPolimorfismoNivel3;

public abstract class News {
    private String holder;
    private String text;
    private double score;
    private double price;

    public News(String holder, String text, double score, double price) {
        this.holder = holder;
        this.text = text;
        this.score = score;
        this.price = price;
    }

    public String getHolder() {
        return holder;
    }

    public String getText() {
        return text;
    }

    public double getScore() {
        return score;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void showNews(){
        System.out.println("News: ");
        System.out.println("Holder: " + getHolder()+ '\n');
        System.out.println("Text: " + getText()+ '\n');
        System.out.println("Score: " + getScore()+ '\n');
        System.out.println("Price: " + getPrice()+ '\n');
    }

    @Override
    public String toString() {
        return "News-> " +
                "Holder: " + holder + '\n' +
                "Text: " + text + '\n' +
                "Score: " + score + "\n"+
                "Price: " + price
                ;
    }
    public abstract double calculatePriceNews();
    public abstract double calculateScoreNews();
}
