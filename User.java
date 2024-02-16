
public class User {
	//instant variable declare as private
		private String name;
		private String userName;
		private String password;

	//getters and setters for the above instant variables
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", userName=" + userName + ", password=" + password + "]";
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		}


