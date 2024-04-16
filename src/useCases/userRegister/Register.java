package useCases.userRegister;

public class Register implements UserRegister {
	
	private User user;
	private Password password;
	
	public Register(User user, Password password) {
		this.user = user;
		this.password = password;
		this.createAccount(user, password);
	}
	
	@Override
	public void createAccount(User user, Password password) {
		 
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	
	
	
}
