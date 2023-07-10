/*
    @author Mehmet Akif Şahin
    22203673
    @date 15/12/2022 
    Group Class
*/

public class Group {
    private String name;
    private int groupSize;
    private int numberOfTeams;
    private Team[] teams;
    private Game[][] games;
    private int[] points;


    public Group(String name, int groupSize)
    {
        this.name = name;
        this.groupSize = groupSize;
        this.numberOfTeams = 0;
        this.teams = new Team[this.groupSize];
        this.games = new Game[this.groupSize][this.groupSize];
        this.points = new int[groupSize];
    }

    public Team[] getTeams() {
        return teams;
    }

    public String getName() {
        return name;
    }

    public int getGroupSize()
    {
        return groupSize;
    }

    public int getNumberOfTeams()
    {
        return numberOfTeams;
    }
    
    public boolean teamExists(int teamID) 
    {
        for (int i = 0; i < teams.length; i++)
        {
            if (teams[i].getID() == teamID) return true;
        }
        return false;
    }

    public boolean isFull()
    {
        return this.numberOfTeams == this.groupSize;
    }

    public boolean addTeam(Team team)
    {
        for (int i = 0; i < teams.length; i++)
        {
            if (teams[i] == team) return false;    
        }
        teams[this.numberOfTeams++] = team;
        return true;
    }

    public boolean addGame(/*Team team1, Team team2, int goal1, int goal2*/Game game)
    {
        Team team1 = game.getTeams()[0];
        Team team2 = game.getTeams()[1];

        if (team1 == team2)
            return false;
        if (!this.teamExists(team1.getID()) || !this.teamExists(team2.getID()))
            return false;

        int indexOfTeam1 = 0;
        int indexOfTeam2 = 0;

        for (int i = 0; i < numberOfTeams; i++)
        {
            if (this.teams[i].getID() == team1.getID())
                indexOfTeam1 = i;
            if (this.teams[i].getID() == team2.getID())
                indexOfTeam2 = i;
        }

        if (this.games[indexOfTeam1][indexOfTeam2] != null || this.games[indexOfTeam2][indexOfTeam1] != null)
        {
            return false;
        }

        this.games[indexOfTeam1][indexOfTeam2] = game;

        this.points[indexOfTeam1] += this.games[indexOfTeam1][indexOfTeam2].getTeamPoints(team1.getID());
        this.points[indexOfTeam2] += this.games[indexOfTeam1][indexOfTeam2].getTeamPoints(team2.getID());
        
        return true;
    }

    public String toString() {
        String str = "==================================\n";
        str +=       "=       Group B Standings        =\n";
        str +=       "==================================\n";
        
        int[] sortedPointIndexs = new int[points.length];

        for (int i = 0; i < points.length; i++)
        {
            sortedPointIndexs[i] = i;
        }

        for (int i = 0; i < points.length - 1; i++)
        {
            for (int j = 0; j < points.length - i - 1; j++)
            {
                if (points[sortedPointIndexs[j]] < points[sortedPointIndexs[j + 1]])
                {
                    int temp = sortedPointIndexs[j];
                    sortedPointIndexs[j] = sortedPointIndexs[j+1];
                    sortedPointIndexs[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < this.numberOfTeams; i++)
        {
            str += String.format("  %d.%13s ( %2d )%4d\n", i+1, this.teams[sortedPointIndexs[i]].getName(), this.teams[sortedPointIndexs[i]].getID(), this.points[sortedPointIndexs[i]]);
        }
        str += "==================================\n";
        return str;
    }
}
