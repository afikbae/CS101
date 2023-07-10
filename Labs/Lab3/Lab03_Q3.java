import java.util.Scanner;

/*
 * Mehmet Akif Şahin Lab 202 - 3 Question 3
 * 20 October 2022
 * This is a basic text based PvP game.
 */

public class Lab03_Q3 {
    public static void main(String[] args) {
        String username = "JavaWarrior";
        String password ="JavaRocks";
        int balance = 600;
        String buddyName = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String usernameInput = input.next();

        if(!usernameInput.equals(username))
        {
            System.out.println("Username not found! Bye!");
        }
        else
        {
            System.out.print("Enter your password: ");
            String passwordInput = input.next();

            if (!passwordInput.equals(password))
            {
                System.out.println("Wrong password! Bye!");
            }
            else
            {
                System.out.print("1- Upgrade armor\n2- Add a buddy\n3- Chance credentials\nSelect an operation: ");
                String operation = input.next();

                if (operation.equals("1"))
                {
                    System.out.printf("Upgrade armor:\nYou have %d coins.\n", balance);
                    if (balance >= 150)
                    {
                        balance -= 150;
                        System.out.printf("Your armor has been upgraded!\nYou have %d coins. Bye!\n", balance);
                    }
                    else
                    {
                        System.out.print("Not enough coins! ");
                    }
                }

                else if (operation.equals("2"))
                {
                    if (buddyName.equals(""))
                    {
                        System.out.printf("Add a buddy:\nEnter your buddy's name: ");
                        buddyName = input.next();
                        System.out.printf("Your buddy is %s. Bye!", buddyName);
                    }
                    else
                    {
                        System.out.printf("Add a buddy:\nYou already have a buddy!\nYour buddy is %s. Bye!\n", buddyName);
                    }
                }

                else if (operation.equals("3"))
                {
                    System.out.print("Change credentials:\n1- Change username\n2- Change password\nSelect an option: ");
                    String credentialOption = input.next();

                    if(credentialOption.equals("1"))
                    {
                        System.out.print("Enter your new username: ");
                        username = input.next();
                        System.out.printf("Your username is %s\nYour password is %s\nBye!\n",username ,password);
                    }

                    else if(credentialOption.equals("2"))
                    {
                        System.out.print("Enter your new password: ");
                        String inPassword = input.next();
                        if (inPassword.length() <= 20)
                        {
                            password = inPassword;
                            System.out.printf("Your username is %s\nYour password is %s\nBye!\n",username ,password);
                        }
                    }
                }
            }
        }

        input.close();
    }
}
