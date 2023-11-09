package CS4TruthRevis;

public class CS4TruthRevis {

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("New York", "E56", "06/27/2024", 215839);
        Ticket ticket2 = new Ticket("Quezon City", "216", "08/25/2023", 73466);
        Ticket ticket3 = new Ticket("Paris", "837", "06/27/2024", 190543);
        
        Song comeInsideOfMyHeart = new Song("Come Inside Of My Heart", "IV of Spades", "01/18/2019", "Alternative/Indie");
        Song bawatKaluluwa = new Song("Bawat Kaluluwa", "IV of Spades", "01/18/2019", "Alternative/Indie");
        
        Singer zild = new Singer("Zild", bawatKaluluwa);
        zild.performForAudience(12);
        zild.changeFavSong(comeInsideOfMyHeart);   
    }
}
