package devops.mocking;

public class LoginController {
private Authenticate authenticate ;
private String token ;

	public LoginController( Authenticate authenticate ) {
	this.authenticate=authenticate ;
	}
	
	
	public String getToken() {
		return token ;
	}

	public void authenticate( String user, String password ) {
     token= authenticate.verifyUser(user, password);
	}

	public boolean isUserValid() {
		return false ;
	}

}
