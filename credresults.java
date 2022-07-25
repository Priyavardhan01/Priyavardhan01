package credentialmanager1;

import java.util.Scanner;
import credentialmanager1.employee;
import credentialmanager1.credserviceimpl;

@SuppressWarnings("unused")
public class credresults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first name ");
    String firstname=sc.next();
    System.out.println("enter last name ");
    String lastname =sc.next();
    System.out.println("enter department ");
    String department = sc.next();
    employee emp=new employee(firstname , lastname);
    emp.setDepartment(department);
    

    credserviceimpl cred= new credserviceimpl();
    cred.showCredentials(firstname, lastname, department);
    
    
    
    
	
}
}