package S101HerenciaPolimorfismoNivel3;

public class TennisNews extends News{
    private String player;

    public TennisNews(String player,
                        String holder, String text, double score, double price){
        super( holder,  text,  score, price);

        this.player = player;
    }

    public String getPlayer() {
        return player;
    }
    public double calculatePriceNews(){

        double price = 150.0;



        if(player.equalsIgnoreCase("nadal") || player.equalsIgnoreCase("federer") ||
                player.equalsIgnoreCase("djokovic")){
            price += 100.0;

        }

        return price;
    }
    public double calculateScoreNews(){

        double score = 4.0;

        if(player.equalsIgnoreCase("nadal") || player.equalsIgnoreCase("federer") ||
                player.equalsIgnoreCase("djokovic")){
            score += 3.0;

        }

        return score;
    }

    @Override
    public String toString() {
        return "TennisNews" + "\n"+
                "Player= " + player + '\n' +
                super.toString();
    }
}
