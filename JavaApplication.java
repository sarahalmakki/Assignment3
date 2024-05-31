import java.util.Scanner;

public class JavaApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// istanting and calling the userService call the User instructor
//	Calling fileservice out and assign userarray
		String fileName = "DataFile1";
		int Max_login_attemp = 5;

		FileService fileService = new FileService();
		User[] users = fileService.readDataFromFile();
//	for (int i = 0; i < 4 ; i++) {System.out.println(users[i]);
		int loginAttemps = 0;
		while (loginAttemps < Max_login_attemp ) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please, insert your username");
			String UserNameInput = scanner.nextLine();
			System.out.println("Please, insert your password");
			String passwordInput = scanner.nextLine();
			User user = new User();
			UserService userService = new UserService();
			 User loggedInUser = userService.validateUser(UserNameInput, passwordInput ,users);

			
			 if (loggedInUser != null )  {
				 System.out.println("welcome :" + loggedInUser.getName());
				 break;

			} else{
				System.out.println("Invalid login. Please try again!");
				loginAttemps++;
			}
		
			if (loginAttemps ==  Max_login_attemp) {
				System.out.println("Too many failed login attemps. You are now locked out");
		}
	}
	}
}



