package inheritance;

public class CheckerPieces {
	
	//Private means that the variable can only be manipulated and accessed
	//by using public functions.
	private  char sym;
	private boolean king;
	
	public void setSym(char c) {
		sym = c;
	}
	
	public char getSym() {
		return sym;
	}
	
	public void setKing(boolean k) {
		king = k;
	}

	public boolean isKing() {
		return king;
	}
	
	public boolean isValid() {
		//if ( )
		  //return true;
		return false;
	}
}
