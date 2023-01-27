package recenssementWcs;

public class Wilder {

	private String firstname = "";
	private boolean aware = false;
	
	public Wilder(String firstname, boolean aware) {
		
		this.firstname = firstname;
		this.aware = aware;
		
	}
	
	public void WhoAmI() {
		
		if ( this.aware == true ) {
			
			System.out.println("Je m'appelle " + this.firstname + " et je suis aware");
			
			return;
			
		} else {
			
			System.out.println("Je m'appelle " + this.firstname + " et je ne suis pas aware");
			return;
			
		}
			
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
}
