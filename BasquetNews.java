package S101HerenciaPolimorfismoNivel3;

public class BasquetNews extends News{
    private String competition;
    private String club;


    public BasquetNews(String competition, String club,
                        String holder, String text, double score, double price){
        super( holder,  text,  score, price);
        this.competition = competition;
        this.club = club;
    }

    public String getCompetition() {
        return competition;
    }

    public String getClub() {
        return club;
    }

    public double calculatePriceNews(){
        double price = 250.0;


        if(competition.equalsIgnoreCase("Euro League")){
            price += 100.0;

        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            price += 100.0;

        }

        return price;
    }
    public double calculateScoreNews(){
        double score = 4.0;

        if (competition.equalsIgnoreCase("euro league") ){
            score += 3.0;
        }
        if (competition.equalsIgnoreCase("acb") ){
            score += 2.0;
        }
        if(club.equalsIgnoreCase("barça") || club.equalsIgnoreCase("madrid")){
            score += 1.0;

        }


        return score;

    }

    @Override
    public String toString() {
        return "BasquetNews" + "\n"+
                "Competition= " + competition + '\n' +
                "Club= " + club + '\n' +
                super.toString();
    }
}
