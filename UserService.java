

public class UserService {
public User createUser(String userName, String password) {
	User user = new User();
	user.setName(userName);
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

public boolean validateUser(String userNameInput, String passwordInput, User[]users) {
	
	
	for(User user : users) {
		
		if (user.getUserName().equalsIgnoreCase(userNameInput) && user.getPassword().equalsIgnoreCase(passwordInput)
				) {
			return true;
			
		} else {
			return false;
		}

}
}
}
