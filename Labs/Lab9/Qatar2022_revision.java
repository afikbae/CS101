/** A class for Qatar 2022 World Cup
*   Turkiye is also qualified in this version :)
*   Market values and player information is obtained from Transfermarkt.com
*   @author Ozcan Ozturk
*   @version 1.0
*/

/*
    Mehmet Akif Şahin
    22203673
    @date 15/12/2022 
    Qatar2022 revision
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Qatar2022_revision {
    
    private static Scanner in = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {
        

        Group groupA = new Group("A", 4);

        // Form the English Team
        Team england = new Team(34, "England");
        england.addPlayer(new Player("Raheem Sterling",  27, "England", 17, "Left Wing", 70000000));
        england.addPlayer(new Player("Phil Foden",  22, "England", 47, "Central Midfield", 110000000));
        england.addPlayer(new Player("Jack Grealish",  27, "England", 10, "Left Wing", 70000000));
        england.addPlayer(new Player("Declan Rice",  23, "England", 41, "Defensive Midfield", 80000000));
        england.addPlayer(new Player("Declan Rice",  23, "England", 41, "Defensive Midfield", 80000000));
        england.addPlayer(new Player("Aaron Ramsdale", 24, "England", 23, "Goalkeeper", 30000000)); 
        england.addPlayer(new Player("Aaron Ramsdale", 24, "England", 23, "Goalkeeper", 30000000));
        england.addPlayer(new Player("Jordan Pickford", 28, "England", 1, "Goalkeeper", 28000000));
        england.addPlayer(new Player("Nick Pope", 30, "England", 13, "Goalkeeper", 18000000));
        england.addPlayer(new Player("Ben White", 25, "England", 21, "Centre Back", 45000000)); 
        england.addPlayer(new Player("John Stones", 28, "England", 5, "Centre Back", 30000000));	
        england.addPlayer(new Player("Harry Maguire", 29, "England", 6, "Centre Back", 30000000));
        england.addPlayer(new Player("Eric Dier", 28, "England", 15, "Centre Back", 30000000));
        england.addPlayer(new Player("Conor Coady", 29, "England", 16, "Centre Back", 18000000));
        england.addPlayer(new Player("Luke Shaw", 27, "England", 3, "Left Back", 28000000)); 
        england.addPlayer(new Player("Kyle Walker", 32, "England", 2, "Right Back", 15000000)); 
        england.addPlayer(new Player("Jude Bellingham", 19, "England", 22, "Central Midfield", 100000000));
        england.addPlayer(new Player("Harry Kane", 29, "England", 9, "Centre Forward", 90000000));

        // Form the Turkish Team
        Team turkiye = new Team(38, "Türkiye");
        turkiye.addPlayer(new Player("Ugurcan Çakir", 26, "Türkiye", 23, "Goalkeeper", 14000000));
        turkiye.addPlayer(new Player("Altay Bayindir", 24, "Türkiye", 1, "Goalkeeper", 13000000)); 
        turkiye.addPlayer(new Player("Çaglar Söyüncü",	26, "Türkiye", 4, "Centre Back", 22000000)); 
        turkiye.addPlayer(new Player("Ozan Kabak", 22, "Türkiye", 15, "Centre Back", 10000000)); 
        turkiye.addPlayer(new Player("Tayyip Sanuç", 22, "Türkiye", 6, "Centre Back", 3800000)); 
        turkiye.addPlayer(new Player("Eren Elmali", 22, "Türkiye", 13, "Left Back", 4200000)); 
        turkiye.addPlayer(new Player("Zeki Çelik", 25, "Türkiye", 2, "Right Back", 15000000)); 
        turkiye.addPlayer(new Player("Salih Özcan", 24, "Türkiye", 5, "Defensive Midfield", 17000000));
        turkiye.addPlayer(new Player("Hakan Çalhanoglu", 28, "Türkiye", 10, "Central Midfield", 35000000));
        turkiye.addPlayer(new Player("Arda Güler", 17, "Türkiye", 25, "Attacking Midfield", 10000000));
        turkiye.addPlayer(new Player("Kerem Aktürkoglu", 24, "Türkiye", 7, "Left Wing", 13000000));
        turkiye.addPlayer(new Player("Cengiz Ünder", 25, "Türkiye", 17, "Right Wing", 17000000));
        turkiye.addPlayer(new Player("Enes Ünal", 25, "Türkiye", 16, "Centre Forward", 25000000));
        turkiye.addPlayer(new Player("Umut Bozok", 26, "Türkiye", 19, "Centre Forward", 5500000));
        turkiye.addPlayer(new Player("Cenk Tosun", 31, "Türkiye", 9, "Centre Forward", 2000000));

        // Form the Germany Team
        Team germany = new Team(6, "Germany");
        germany.addPlayer(new Player("Andre Ter Stegen", 30, "Germany", 22, "Goalkeeper", 30000000)); 
        germany.addPlayer(new Player("Manuel Neuer", 36, "Germany", 1, "Goalkeeper", 12000000));
        germany.addPlayer(new Player("Antonio Rüdiger", 29, "Germany", 2, "Centre Back", 40000000)); 
        germany.addPlayer(new Player("Niklas Süle", 27, "Germany", 15, "Centre Back", 35000000));
        germany.addPlayer(new Player("Thilo Kehrer", 26, "Germany", 5, "Centre Back", 22000000)); 
        germany.addPlayer(new Player("David Raum", 24, "Germany", 3, "Left Back", 26000000)); 
        germany.addPlayer(new Player("Lukas Klostermann", 26, "Germany", 16, "Right Back", 14000000)); 
        germany.addPlayer(new Player("Joshua Kimmich", 27, "Germany", 6, "Defensive Midfield", 80000000));
        germany.addPlayer(new Player("Leon Goretzka", 27, "Germany", 8, "Central Midfield", 65000000));
        germany.addPlayer(new Player("Ilkay Gündogan", 32, "Germany", 21, "Central Midfield", 25000000));
        germany.addPlayer(new Player("Jamal Musiala", 19, "Germany", 14, "Attacking Midfield", 100000000));
        germany.addPlayer(new Player("Leroy Sane", 26, "Germany", 19, "Left Wing", 70000000));
        germany.addPlayer(new Player("Serge Gnabry", 27, "Germany", 10, "Right Wing", 65000000));
        germany.addPlayer(new Player("Karim Adeyemi", 20, "Germany", 24, "Right Wing", 35000000));
        germany.addPlayer(new Player("Youssoufa Moukoko", 18, "Germany", 26, "Centre Forward", 30000000));
        germany.addPlayer(new Player("Niclas Füllkrug", 29, "Germany", 9, "Centre Forward", 5000000));
        
        
        groupA.addTeam(germany);
        groupA.addTeam(england);
        groupA.addTeam(turkiye);


        boolean isOver = false;

        printWelcomeText();
        while (!isOver)
        {
            printMenuText();
            int input = getIntegerInput("Your choice: ");
            
            while (!(input <= 7 && input >= 1))
            {
                System.out.println("Please input an integer between 1-7");
                input = getIntegerInput("Your choice: ");
            }
            
            if (input == 1)
            {
                addNewTeam(groupA);
            }

            else if (input == 2)
            {
                int displayTeamID = getIntegerInput("What is the unique ID of the Team?: ");
                if (displayTeamID < 0)
                {
                    System.out.println("Team ID cannot be negative!");
                }
                else 
                {
                    Team.printTeamByID(displayTeamID, groupA.getTeams());
                }
            }

            else if (input == 3)
            {
                int teamID = getIntegerInput("What is the unique ID of the Team to add the Player?: ");
                if (teamID < 0)
                {
                    System.out.println("Team ID cannot be negative!");
                }
                else 
                {
                    addNewPlayer(groupA, teamID);
                }
            }

            else if (input == 4)
            {
                int teamID = getIntegerInput("What is the unique ID of the Team to remove the Player?: ");
                if (teamID < 0)
                {
                    System.out.println("Team ID cannot be negative!");
                }
                else 
                {
                    removePlayer(groupA, teamID);
                }
            }

            else if (input == 5)
            {
                addGame(groupA);
            }

            else if (input == 6)
            {
                System.out.print(groupA);
            }
            
            else if (input == 7)
            {
                String pos = getStringInput("Enter the position of the player: ");

                System.out.println("---------------------------------------------------------------------------------\n"
                +"Name                Age  Nationality    Number  Position            Market Value\n"
                +"---------------------------------------------------------------------------------\n");

                for (int i = 0; i < groupA.getTeams().length; i++)
                {
                    if (groupA.getTeams()[i]!=null)
                    {
                        ArrayList<Player> players = groupA.getTeams()[i].getSquad();
                        for (int j = 0; j < players.size(); j++) {
                            if (players.get(j).getPosition().equals(pos))
                            {
                                System.out.print(players.get(j));
                            }
                        }
                    }
                }

                System.out.println("=================================================================================");
            }

            else if (input == 8)
            {
                isOver = true;
            }
        }
    }

    public static void printWelcomeText()
    {
        System.out.println("---------------------------------------------------\n"
                          +"Welcome to Qatar 2022! Get Ready for the World Cup!\n"
                          +"---------------------------------------------------");
    }

    public static void printMenuText() {
        System.out.print("-------------- Group: A -------------------\n"
                          +"1 - Create a new Team\n"
                          +"2 - Display a Team\n"
                          +"3 - Add a Player to a Team\n"
                          +"4 - Remove a Player with ID from a Team\n"
                          +"5 - Add a Game to the Group\n"
                          +"6 - Display Standings\n"
                          +"7 - List the players in the group with a specific position\n"
                          +"8 - Exit\n"
                          +"-------------------------------------------\n");
    }

    public static int getIntegerInput() {
		while (true)
        {
            if (in.hasNextInt())
            {
                int value = in.nextInt();
                in.nextLine();
                return value;
            }
            System.out.print("Please input an integer: ");
            in.next();
        }
	}

    public static int getIntegerInput(String displayMessage) {
        System.out.print(displayMessage);
		return getIntegerInput();
	}

    public static String getStringInput() {
        return in.nextLine();
    }

    public static String getStringInput(String displayMessage) {
        System.out.print(displayMessage);
        return getStringInput();
    }

    public static boolean addNewTeam(Group group) {
        if (group.isFull())
        {
            System.out.printf("Group already has %d/%d teams.\n", group.getNumberOfTeams(), group.getGroupSize());
            return false;
        }
        int teamID = getIntegerInput("What is the unique ID of the Team?: ");
        if (teamID < 0)
        {
            System.out.println("Team ID cannot be negative!");
            return false;
        }

        String teamName = getStringInput("What is the name of the Team?: ");
        Team newTeam = new Team(teamID, teamName);

        group.addTeam(newTeam);
        return true;
    }

	private static boolean addNewPlayer(Group group, int teamID)
    {
        Team team = Team.findTeamByID(group.getTeams(), teamID);
        if (team == null)
        {
            System.out.println("Team does not exist!");
            return false;
        }

        String name = getStringInput("Enter the name of the player: ");
        int age = getIntegerInput("Enter the age of the player: ");
        if (age <= 0)
        {
            System.out.println("Age cannot be negative!");
            return false;
        }
        String nationality = getStringInput("Enter the nationality of the player: ");
        if (!nationality.equals(team.getName()))
        {
            System.out.println("Player must be a citizen of the country!");
            return false;
        }
        int jerseyNumber = getIntegerInput("Enter the jersey number of the player: ");
        if (team.playerExist(jerseyNumber))
        {
            System.out.println("Player with the jersey number already exists!");
            return false;
        }
        String pos = getStringInput("Enter the position of the player: ");
        int marketValue =  getIntegerInput("Enter the market vale of the player: ");
        if (marketValue < 0)
        {
            System.out.println("Market value cannot be negative");
            return false;
        }

        Player newPlayer = new Player(name, age, nationality, jerseyNumber, pos, marketValue);
        team.addPlayer(newPlayer);
        return true;
    }

    private static boolean removePlayer(Group group, int teamID)
    {
        Team team = Team.findTeamByID(group.getTeams(), teamID);
        if (team == null)
        {
            System.out.println("Team does not exist!");
            return false;
        }
        int jerseyNumber = getIntegerInput("Enter the jersey number of the player: ");
        if (!team.removePlayer(jerseyNumber))
        {
            System.out.println("Player does not exist!");
            return false;
        }
        return true;
    }

    private static boolean addGame(Group group)
    {
        int firstTeamID = getIntegerInput("What is the unique ID of the First Team?: ");
        Team team1 = Team.findTeamByID(group.getTeams(), firstTeamID);
        if (!group.teamExists(firstTeamID))
        {
            System.out.println("First team does not exist!");
            return false;
        }
        int secondTeamID = getIntegerInput("What is the unique ID of the Second Team?: ");
        Team team2 = Team.findTeamByID(group.getTeams(), secondTeamID);
        if (!group.teamExists(secondTeamID))
        {
            System.out.println("Second team does not exist!");
            return false;
        }
        System.out.print("Enter the score (such as 2 1): ");
        int[] scores = {0,0};
        for (int i = 0; i < 2; i++)
        {
            while (!in.hasNextInt())
            {
                in.next();                
            }
            scores[i] = in.nextInt();
            if (scores[i] < 0)
            {
                System.out.println("Scores cannot be negative!");
                return false;
            }
        }
        Game newGame = new Game(team1, team2, scores[0], scores[1]);
        if (!group.addGame(newGame))
        {
            System.out.println("Already a game between the teams exists!");
            return false;
        }
        return true;
    }
}
