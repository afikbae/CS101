/*
    @author Mehmet Akif Şahin
    22203673
    @date 15/12/2022 
    Team Class
*/

import java.util.ArrayList;

public class Team {
    private int ID;
    private String name;
    private int averageAge;
    private int marketValue;
    private ArrayList<Player> squad;

    public Team(int ID, String name)
    {
        if (ID > 0) this.ID = ID;
        this.name = name;
        this.averageAge = 0;
        this.marketValue = 0;
        this.squad = new ArrayList<>();
    }

    public int getAverageAge()
    {
        return averageAge;
    }
    public int getID()
    {
        return ID;
    }
    public int getMarketValue()
    {
        return marketValue;
    }
    public String getName()
    {
        return name;
    }

    public ArrayList<Player> getSquad() {
        return squad;
    }

    private void calculateAverageAge()
    {
        int sum = 0;
        for (int i = 0; i < squad.size(); i++)
        {
            sum += squad.get(i).getAge();
        }
        this.averageAge = sum / this.squad.size();
    }

    private void calculateMarketValue()
    {
        int sum = 0;
        for (int i = 0; i < squad.size(); i++)
        {
            sum += squad.get(i).getMarketValue();
        }
        this.marketValue = sum;
    }

    public boolean playerExist(int jerseyNumber)
    {
        for (int i = 0; i < squad.size(); i++)
        {
            if (squad.get(i).getJerseyNumber() == jerseyNumber) return true;
        }
        return false;
        //return squad.contains(player);
    }

    public boolean addPlayer(Player player) 
    {
        for (int i = 0; i < squad.size(); i++)
        {
            if (squad.get(i) == player) return false;
        }
        if (this.name.equals(player.getNationality()))
        {
            squad.add(player);
            this.calculateAverageAge();
            this.calculateMarketValue();
            return true;
        }
        return false;
    }

    public boolean removePlayer(int jerseyNumber) 
    {
        for (int i = 0; i < squad.size(); i++)
        {
            if (squad.get(i).getJerseyNumber() == jerseyNumber) 
            {
                squad.remove(i);
                this.calculateMarketValue();
                this.calculateAverageAge();
                return true;
            }
        }

        return false;
    }

    public static Team findTeamByID(Team[] teams, int teamID)
    {
        Team team = null;
        for (int i = 0; i < teams.length; i++)
        {
            if (teams[i] != null && teams[i].getID() == teamID)
            {
                team = teams[i];
            } 
        }
        return team;
    }

    public static boolean printTeamByID (int teamID, Team[] teams)
    {
        for (int i = 0; i < teams.length; i++)
        {
            if (teams[i] != null && teams[i].getID() == teamID)
            {
                System.out.println(teams[i]);
                return true;
            }
        }
        System.out.println("Team does not exist.");
        return false;
    }

    public String toString()
    {
        String str = "=================================================================================" + "\n";
        str += "=                                 Team Details                                  =" + "\n";
        str += "=================================================================================" + "\n";
        str += "ID: " + this.ID + "\n";
        str += "Team: " + this.name + "\n";
        str += "Average Age: " + String.format("%,d",this.averageAge) + "\n";
        str += "Market Value: " + String.format("%,d",this.marketValue) + "\n";
        str += "Squad is composed of following players:" + "\n";
        str += "---------------------------------------------------------------------------------" + "\n";
        str += "Name                Age  Nationality    Number  Position            Market Value" + "\n";
        str += "---------------------------------------------------------------------------------" + "\n";
        for (int i = 0; i < squad.size(); i++)
        {
            str += squad.get(i).toString();
        }
        str += "=================================================================================" + "\n";
        return str;
    }
}
