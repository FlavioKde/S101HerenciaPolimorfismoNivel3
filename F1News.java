package S101HerenciaPolimorfismoNivel3;

public class F1News extends News{

    private String team;

    public F1News(String team,
                  String holder, String text, double score, double price){
        super( holder,  text,  score, price);
        this.team = team;
    }
    @Override
    public void showNews() {
        System.out.println("Team: " + getTeam() + "\n"+
                           "Holder: " + getHolder() + "\n"+
                           "Text: " + getText() + "\n"+
                           "Score: " + getScore() +"\n"+
                           "Price: " + getPrice());
    }

    public String getTeam() {
        return team;
    }
    public double calculatePriceNews(){

        double price = 100.0;

        if(team.equalsIgnoreCase("mercedes") || team.equalsIgnoreCase("ferrari")){
            price += 50.0;

        }

        return price;

    }
    public double calculateScoreNews(){

        double score = 4.0;

        if(team.equalsIgnoreCase("mercedes") || team.equalsIgnoreCase("ferrari")){
            score += 2.0;

        }

        return score;

    }


    @Override
    public String toString() {
        return "F1News" + "\n"+
                "Team= " +team +
                super.toString();
    }
}
