package model;

import java.util.ArrayList;

public class UserOption {
	
	private ArrayList<Integer> options = new ArrayList<>();
	private int optionsLength;
	
	public UserOption() {
		this.optionsLength = 5;
		this.initialOptions(options);
	}
	
	public ArrayList<Integer> getOptions() {
		System.out.println(options);
		return options;
	}
	
	public int getOptionsLength() {
		System.out.println(optionsLength);
		return optionsLength;
	}
	
	public void setOptionsLength(int optionsLength) {
		this.optionsLength = optionsLength;
		this.addOptions(options);
	}
	
	private ArrayList<Integer> initialOptions(ArrayList<Integer> options){
		for(int i = 1; i <= this.optionsLength; i++) {
			options.add(i);
		}
		return options;
	}
	
	private ArrayList<Integer> addOptions(ArrayList<Integer> options){
		
		for(int i = options.size() + 1; i <= this.optionsLength; i++) {
			options.add(i);
		}
		
		return options;
	}

}
