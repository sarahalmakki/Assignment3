
public class User {
	//instant variable declare as private
		private String name;
		private String username;
		private String password;
		
		
		//getters and setters for the above instant variables
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getUserName() {
			return username;
		}
		public void setUserName(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", userName=" + username + ", password=" + password + "]";
		}
}


		

