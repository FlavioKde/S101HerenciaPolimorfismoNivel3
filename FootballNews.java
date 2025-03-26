package S101HerenciaPolimorfismoNivel3;

public class FootballNews extends News{
    private String competition;
    private String club;
    private String player;

    public FootballNews(String competition, String club, String player,
                        String holder, String text, double score, double price){

        super( holder,  text,  score, price);
        this.competition = competition;
        this.club = club;
        this.player = player;

    }
    @Override
    public void showNews() {
        System.out.println(
                "Holder: " + getHolder() + "\n"+
                "Competition: " + getCompetition() + "\n"+
                "Club: " + getClub() + "\n"+
                "Player: " + getPlayer() + "\n"+
                "Text: " + getText() + "\n"+
                "Score: " + getScore() +"\n"+
                "Price: " + getPrice());
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    public String getPlayer() {
        return player;
    }
    @Override
    public double calculatePriceNews(){
        double price = 300.0;


        if(competition.equalsIgnoreCase("Champions League")){
            price += 100.0;

        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            price += 100.0;

        }
        if(player.equalsIgnoreCase("ferran torres") || player.equalsIgnoreCase("benzema")){
            price += 50.0;

        }

        return price;

    }
    public double calculateScoreNews(){
        double score = 5.0;

        if (competition.equalsIgnoreCase("Champions League")){
            score += 3.0;
        }
        if (competition.equalsIgnoreCase("League")){
            score += 2.0;
        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            score += 1.0;

        }
        if(player.equalsIgnoreCase("ferran torres") || player.equalsIgnoreCase("benzema")){
            score += 1.0;

        }

        return score;

    }
/*
    @Override
    public String toString() {
        return "FootballNews" + "\n"+
                "Competition= " + competition + '\n' +
                "Club= " + club + '\n' +
                "Player= " + player + '\n' +
                 super.toString();
    }

 */
}
