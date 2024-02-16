import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileService {
//	return the user of array
	public User[] readDataFromFile() {
		// Read data from file
			BufferedReader fileReader = null;
			UserService userService = new UserService(); 
			User[] users = new User[4];
			int i = 0;
			
		try {
			fileReader =  new BufferedReader( new FileReader("DataFile1"));
			String line ;
//			We are assigning the parenthesis and  checking the results (operation) (line = fileReader.readLine() against !=null
		while((line = fileReader.readLine()) != null ) {
			String  assignedArray [] = line.split(",");	
		    String userName = assignedArray[0];
            String name = assignedArray[1];
            String password = assignedArray[2];
            System.out.println(line);
//             create a user from the object
        User user =  userService.createUser( userName, password); 
        System.out.println(user.getName());
         users[i] = user;
         i++;
		}
		
		System.out.println(Arrays.toString(users));
		}
		catch(IOException e ) {
			System.out.println("Oops, the file is not found");
		}
		finally {
			try {
				System.out.println("Closing fileReader");
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
		return users;	
	}

}
