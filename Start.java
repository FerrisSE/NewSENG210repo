import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// objects
		Scanner scnr = new Scanner(System.in);

		// variables
		int userInput;

		System.out.println("Welcome to Joey's Pizza! What can we make for you?");
		System.out.println("Type a number to choose:\n 1.Pizza \n 2.Pasta \n 3.Subs");
		userInput = scnr.nextInt();

		switch (userInput) {
			case 1:

				System.out.println("You have ordered a pizza");

    			System.out.println("Choose your Crazy Crust flavor:");
    			System.out.println("1. Garlic");
    			System.out.println("2. Parmesan");
    			System.out.println("3. Red Pepper");
    			System.out.println("4. Butter & Herb");

    			int crustChoice = scnr.nextInt();

				    if (crustChoice == 1) 
						{
        					System.out.println("Crazy Crust: Garlic");
    					} 
						else if (crustChoice == 2) 
						{
							System.out.println("Crazy Crust: Parmesan");
    					} 
						else if (crustChoice == 3) 
						{
							System.out.println("Crazy Crust: Red Pepper");
    					} 
						else if (crustChoice == 4) 
						{
							System.out.println("Crazy Crust: Butter & Herb");
    					} 
						else 
						{
							System.out.println("Invalid crust choice");
    					}

				break;
			case 2:
				System.out.println("You have order Pasta");

				break;
			case 3:
				System.out.println("You have order a subsandwhich");

				break;
			default:
				System.out.println("That was not an option goodbye");
				break;
		}

	}

	public static string pizza =
			"                     ____\n" +
			"               _,--~~    ~~--._\n" +
			"            ,/'  m%%%%%%=@%%m  `\\.\n" +
			"           /' m%%o(_)%%o%%%%o%%m `\\\n" +
			"         /' %%@=%o%%%o%%%o%(_)o%%% `\\\n" +
			"        /  %o%%%%%=@%%%(_)%%o%%@=%%  \\\n" +
			"       |  (_)%(_)%%o%%%o%%%%=@(_)%%%  |\n" +
			"       | %%o%%%%o%%%(_)%%o%%o%%%%o%%% |\n" +
			"       | %%o%(_)%%%%%o%(_)%%%o%%o%o%% |\n" +
			"       |  (_)%%=@%(_)%o%o%%(_)%o(_)%  |\n" +
			"        \\ ~%%o%%%%%o%o%=@%%o%%@%%o%~ /\n" +
			"         \\. ~o%%(_)%%%o%(_)%%(_)o~ ,/\n" +
			"           \\_ ~o%=@%(_)%o%%(_)%~ _/\n" +
			"             `\\_~~o%%%o%%%%%~~_/'\n" +
			"                `--..____,,--'\n";
}
