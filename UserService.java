

public class UserService {
public User createUser(String username, String name,String password) {
	User user = new User();
	user.setUserName(username);
	user.setName(name);
	user.setPassword(password);
	return user;
	
}

public String[] parseText(String input) {
	String[] elements = input.split(",");
	for (int i = 0; i < elements.length; i++) {
		elements[i] = elements[i].trim();
	}
	return elements;
}

public User validateUser(String usernameInput, String passwordInput, User[] users) {
	
	
	for(User user : users) {
		
		if (user.getUserName().equalsIgnoreCase(usernameInput) && user.getPassword().equalsIgnoreCase(passwordInput))
				 {
			return user;
			
		}

}
	return null;
}
}

