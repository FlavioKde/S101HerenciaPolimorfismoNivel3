package S101HerenciaPolimorfismoNivel3;

public class MotoGpNews extends News{
    private String team;

    public MotoGpNews(String team,
                  String holder, String text, double score, double price){
        super( holder,  text,  score, price);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
    public double calculatePriceNews(){
        double price = 100.0;

        if(team.equalsIgnoreCase("honda") || team.equalsIgnoreCase("yamaha")){
            price += 50.0;

        }

        return price;

    }
    public double calculateScoreNews(){
        double score = 3.0;

        if(team.equalsIgnoreCase("honda") || team.equalsIgnoreCase("yamaha")){
            score += 3.0;

        }

        return score;

    }


    @Override
    public String toString() {
        return "MotoGpNews" + "\n"+
                "Team= " +team +
                super.toString();
    }
}
