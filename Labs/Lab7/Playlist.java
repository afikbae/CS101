/*
    @author mehmet akif şahin 22203673 
    lab 7 - revision Playlist class implementation
    @date 01/12/2022
*/

public class Playlist {
    private static int noOfPlaylists = 0;

    private int ID;
    private int userID;
    private String name;
    private int noOfTracks = 0;
    private String listOfTracks;

    public Playlist (int userID, String name) 
    {
        this.name = name;
        this.userID = userID;
        this.ID = ++noOfPlaylists;
        this.listOfTracks = "";
    }

    public int getID () 
    {
        return this.ID;
    }

    public int getUserID()
    {
        return this.userID;
    }

    public String getName()
    {
        return this.name;
    }

    public int getNumberOfTracks()
    {
        return this.noOfTracks;
    }

    public String getListOfTracks()
    {
        return this.listOfTracks;
    }

    public void addTrack (Track track)
    {
        listOfTracks += track.getID() + " ";
        noOfTracks++;
    }

    public boolean removeTrack (Track track)
    {
        int indexPrevSpace = -1;
        for (int i = 0; i < this.listOfTracks.length(); i++)
        {
            if (this.listOfTracks.substring(i,i+1).equals(" "))
            {
                if (this.listOfTracks.substring(indexPrevSpace+1,i).equals("" + track.getID()))
                {
                    this.listOfTracks = this.listOfTracks.substring(0,indexPrevSpace) + this.listOfTracks.substring(i,this.listOfTracks.length());
                    return true;
                }
                indexPrevSpace = i;
            }
        }
        return false;
    }

    public String toString() {
        String str = "******************************************\n";
        str += String.format("Playlist of user %d with %d tracks: %s\n",this.userID,this.noOfTracks,this.listOfTracks);
        str += String.format("Name: %s\n",this.name);
        str += "******************************************\n";
        return str;
    }

    public static void main(String[] args) {
        Track t1 = new Track("Love over gold", 123, 234, "12/08/1982", (short)2473); 
        t1.setGenre("RO"); 
        Track t2 = new Track("Gozleri aska gulen", 140, 98, "18/04/2018", (short)257); 
        t2.setGenre("PO"); 
        
        Playlist plist = new Playlist(9, "Ugur's favorites"); 
        
        plist.addTrack(t1); 
        plist.addTrack(t2); 
        
        System.out.println(plist.toString()); 
        
        if (plist.removeTrack(t2)) { 
            System.out.println("Track " + t2.getID() + 
                " successfully removed from playlist " + plist.getID() + ".\n"); 
        } 
        else { 
            System.out.println("Track " + t2.getID() + " not found in playlist " + 
                plist.getID() + "!\n"); 
        } 
        
        System.out.println(plist.toString()); 
    }
}
