package CS4TruthRevis;

public class Song {
    private String name;
    private String artist;
    private String dateReleased;
    private String genre;
    
    public Song(String name, String artist, String dateReleased, String genre){
        this.name = name;
        this.artist = artist;
        this.dateReleased = dateReleased;
        this.genre = genre;   
    }    
    public Song(String name, String artist, String dateReleased){
        this.name = name;
        this.artist = artist;
        this.dateReleased = dateReleased;
    }    
    public Song(String name, String artist){
        this.name = name;
        this.artist = artist;
    }    

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public String getGenre() {
        return genre;
    }
}
