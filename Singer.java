package CS4TruthRevis;

public class Singer {

    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances;
    
    public void performForAudience(int audience){
        System.out.println(getName() + " performed in a concert with " + audience + " listeners");
        System.out.println(getName() + " earned " + (100*audience) + " money \n");
        
        this.noOfPerformances += 1;
        totalPerformances++; 
        
        this.earnings += (100*audience);
    }
    
    public void performForAudience(int audience, Singer otherSinger){
        System.out.println(this.getName() + " and " + otherSinger.getName() + " performed in a concert with " + audience + " listeners");
        System.out.println(this.getName() + " earned " + (50*audience) + " money \n");
        
        this.noOfPerformances++;
        otherSinger.noOfPerformances++;
        
        this.earnings += (50*audience);
        otherSinger.earnings += (50*audience);
        
        totalPerformances += 2;
    }
    
    public void changeFavSong(Song newSong){
        this.favoriteSong = newSong;
        System.out.println(getName() + " changed their favorite song to \"" + newSong.getName() + "\"\n");
    }
    
    public Singer(String name, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = favoriteSong;
    }
    
    public String getName() {
        return name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public static int getTotalPerformances() {
        return totalPerformances;
    }
}
