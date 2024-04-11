package model.options;

public abstract class Options {

  protected int ID;
  public abstract void optionAction();
  
  public int getID() {
	return ID;
  }

  public void setID(int iD) {
	ID = iD;
  }
  
} 
