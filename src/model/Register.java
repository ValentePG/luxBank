package model;

public class Register implements UserRegister {
	
	private User user;
	private Password password;
	
	public Register(User user, Password password) {
		this.user = user;
		this.password = password;
		this.createUser(user, password);
	}
	
	@Override
	public void createUser(User user, Password password) {
		 
		
	}

	public String getUser() {
		return user.getUser();
	}

	public void setUser(User user) {
		this.user.setUser(getUser());
	}

	public String getPassword() {
		return password.getPassword();
	}

	public void setPassword(Password password) {
		this.password.setPassword(getPassword());
	}

	
	
}
