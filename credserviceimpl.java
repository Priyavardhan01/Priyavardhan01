package credentialmanager1;

public class credserviceimpl implements credservice {

	@Override
	public String generateemailid(String firstname, String lastname, String departement) {
		// TODO Auto-generated method stub
		return firstname+lastname+"@"+"newco.com";
	}

	@Override
	public String generatepassword(String firstname, String lastname) {
		// TODO Auto-generated method stub
		return firstname+lastname+"@"+"6783";
	}
	  public void showCredentials(String firstname, String lastname,String department){
			System.out.println("Emailid="+ generateemailid(firstname,lastname, department));
			System.out.println("password="+generatepassword(firstname, lastname));
		}
	  }
