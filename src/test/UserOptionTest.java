package test;

import model.UserOption;

public class UserOptionTest {

	public static void main(String[] args) {
		
		UserOption options = new UserOption();
		options.getOptions();
		options.setOptionsLength(20);
		System.out.println(options.getOptionsLength());
		options.getOptions();

	}

}
