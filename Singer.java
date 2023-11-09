package CS4TruthRevis;

public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public void performForAudience(int audience){
        System.out.println(name + " performed in a concert with " + audience + " listeners");
        System.out.println(name + " earned " + (100*audience) + " money \n");
        
        this.noOfPerformances += 1;
        this.earnings += (100*audience);
    }
    
    public void changeFavSong(Song newSong){
        this.favoriteSong = newSong;
        System.out.println(name + " changed their favorite song to \"" + newSong.name + "\"\n");
    }
    
    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = favoriteSong;
    }
}
