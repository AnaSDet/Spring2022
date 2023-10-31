package OOP_InheritanceInJava;

public class ThisKeyword_12_3 {
    public static void main(String[] args) {
MusicAlbum sc = new MusicAlbum("If you reading this it's too late", "Drake", 2014, false);
System.out.println(sc.isForKids);
System.out.println(sc.title);

MusicAlbum sc2 = new MusicAlbum("Graduation", "Kanye West", 2010, false);
System.out.println(sc2.artist);
    }
}


class MusicAlbum{
    public String title;
    public String artist;
    public int yearReleased;
    public boolean isForKids;

//    public MusicAlbum(String albumTitle, String albumArtist,
//                      int albumYearReleased, boolean isAlbumForKids){
//        title = albumTitle;
//        artist = albumArtist;
//        yearReleased = albumYearReleased;
//        isForKids = isAlbumForKids;
//
//    }


    //this keyword helps you access the instance variables
    //of your current class.
    //this key word helos us differentiate between method or constructor params
    //and instance variables.
    //It helps us avoid redundancy in variable naming


    public MusicAlbum(String title, String artist, int yearReleased, boolean isForKids){
        this.title= title;
        this.artist = artist;
        this.yearReleased = yearReleased;
        this.isForKids = isForKids;

    }
}