/*
    @author mehmet akif şahin 22203673 
    lab 7 - Track class implementation
    @date 01/12/2022
*/

public class Track {
    private static int count = 0;
    private static int allCount = 0;

    private int ID;
    private String title;
    private int album;
    private int artist;
    private String releaseDate;
    private short duration;
    private String genre = "UN";
    private boolean isActive;
    private long playCount;

    public Track(String title, int album, int artist, String releaseDate, short duration)
    {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.duration = duration;
        
        Track.allCount++;
        this.ID = Track.allCount;

        this.register();
    }

    // GETTERS

    public int getID()
    {
        return this.ID;
    }
    public String getTitle()
    {
        return this.title;
    }
    public int getAblum()
    {
        return this.album;
    }
    public int getArtist()
    {
        return this.artist;
    }
    public String getReleaseDate()
    {
        return this.releaseDate;
    }
    public int getDuration()
    {
        return this.duration;
    }
    public String getGenre()
    {
        return this.genre;
    }
    public long getPlayCount()
    {
        return this.playCount;
    }

    // SETTERS

    public boolean setGenre(String genre)
    {
        if (genre.equals("UN") || 
        genre.equals("PO") ||
        genre.equals("RO") ||
        genre.equals("JA") ||
        genre.equals("OT"))
        {
            this.genre = genre;
            return true;
        }
        this.genre = "UN";
        return false;
    }

    public boolean register()
    {
        if (this.isActive)
        {
            return false;
        }
        this.isActive = true;
        Track.count++;
        return true;
    }

    public boolean unregister()
    {
        if (!this.isActive)
        {
            return false;
        }
        this.isActive = false;
        Track.count--;
        return true;
    }

    // SERVICE METHODS

    public boolean isBefore (Track anotherTrack)
    {
        if (Track.reverseDate(this.getReleaseDate()).compareTo(Track.reverseDate(anotherTrack.getReleaseDate())) < 0)
        {
            return true;
        }
        return false;
    }

    public boolean play()
    {
        if (this.isActive)
        {
            this.playCount++;
            return true;
        }
        System.out.println("play() called on a inactive track!");
        return false;
    }

    public boolean playBatch(int countToIncrement)
    {
        if (this.isActive)
        {
            this.playCount += countToIncrement;
            return true;
        }
        System.out.println("play() called on a inactive track!");
        return false;
    }

    public String toString()
    {
        String str = "*************************************\n";
        if (isActive) str += "Active track " + this.ID + " among " + Track.count + " active tracks\n";
        else str += "Inactive track " + this.ID + " among " + Track.allCount + " tracks\n";
        str += String.format("%-9s%s\n","Title:", this.title);
        str += String.format("%-9s%d\n","Album:", this.album);
        str += String.format("%-9s%d\n","Artist:", this.artist);
        str += String.format("%-9s%s\n","Release:", this.releaseDate);
        str += String.format("%-9s%s\n","Length:", (this.duration / 60) + " min and " + (this.duration % 60) + " sec");
        if (this.genre.equals("UN")) str += String.format("%-9s%s\n","Genre:", "Unspecified");
        else if (this.genre.equals("PO")) str += String.format("%-9s%s\n","Genre:", "Popular");
        else if (this.genre.equals("RO")) str += String.format("%-9s%s\n","Genre:", "Rock");
        else if (this.genre.equals("JA")) str += String.format("%-9s%s\n","Genre:", "Jazz");
        else if (this.genre.equals("OT")) str += String.format("%-9s%s\n","Genre:", "Other");
        str += String.format("%-9s%s\n","Played:", this.playCount);
        str += "*************************************\n";
        return str;
    }

    // HELPERS

    public static String reverseDate (String date) 
    {
        return date.substring(6,10) + "/" + date.substring(3,5) + "/" + date.substring(0,2); 
    }

    // MAIN FOR TESTING

    public static void main(String[] args) {
        Track t1 = new Track("Love over gold", 123, 234, "12/08/1982", (short)2473);
        t1.setGenre("RO");
        Track t2 = new Track("Gozleri aska gulen", 0, 98, "18/04/2018", (short)257);
        t2.setGenre("PO");
        Track t3 = new Track("Down to the waterline", 123, 234, "09/06/1978", (short)235);
        System.out.println("Is t1 before t2? " + t1.isBefore(t2));
        System.out.println("Is t2 before t3? " + t2.isBefore(t3));

        t1.play();
        t3.play();
        t3.play();
        t1.playBatch(100);
        t3.playBatch(10);
        t1.play();
        t2.playBatch(50);
        t1.unregister();
        t1.play();
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }
}
