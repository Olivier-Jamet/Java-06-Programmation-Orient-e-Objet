package recenssementWcs;

public class Classroom {

	public static void main(String[] args) {

		Wilder wilder1 = new Wilder ( "Paul", true );
		Wilder wilder2 = new Wilder ( "Marie", false );
		Wilder wilder3 = new Wilder ( "Pierre", false );
		Wilder wilder4 = new Wilder ( "Sandy", true );
		
		wilder1.WhoAmI();
		wilder2.WhoAmI();
		wilder3.WhoAmI();
		wilder4.WhoAmI();
	}

}
