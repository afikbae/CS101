/*
    @author Mehmet Akif Şahin
    22203673
    @date 15/12/2022 
    Game Class
*/


public class Game {
    private Team[] teams;
    private int[] goals;
    public Game(Team team1, Team team2, int team1Goals, int team2Goals) {
        teams = new Team[2];
        teams[0] = team1;
        teams[1] = team2;
        goals = new int[2];
        goals[0] = team1Goals;
        goals[1] = team2Goals;
    }

    public Team[] getTeams()
    {
        return teams;
    }

    public int getTeamPoints(int teamID)
    {
        if (goals[0] > goals[1] && teamID == teams[0].getID())
        {
            return 3;
        }
        else if (goals[0] < goals[1] && teamID == teams[1].getID())
        {
            return 3;
        }
        else if (goals[0] == goals[1] && (teamID == teams[0].getID() || teamID == teams[1].getID()))
        {
            return 1;
        }
        return 0;
    }

    public String toString() {
        String str = String.format("%s vs. %s: %d-%d\n", teams[0].getName(), teams[1].getName(), goals[0], goals[1]);
        return str;
    }
}
