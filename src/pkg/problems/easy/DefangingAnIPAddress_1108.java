package pkg.problems.easy;

/***
 * 
 	Given a valid (IPv4) IP address, return a defanged version of that IP address.

	A defanged IP address replaces every period "." with "[.]".
 *
 */

public class DefangingAnIPAddress_1108 {
	

	//validate if it is the right IP address
	public static boolean validateIpAddress() {
		
		return true;
	}
	//defang the valid ip address and return
	public static String defangIpAddress(String inputIpAddress) throws Exception {
		String outputIpAddress = null;
		if(validateIpAddress()) {
			outputIpAddress = inputIpAddress.replaceAll("\\.", "[.]");
			return outputIpAddress ;	
		}
		else throw (new Exception("Invalid Input IP format"));
		
	}

	public static void main(String[] args) throws Exception {
		String sampleIPAddress = "1.1.1.1";
		
		System.out.println("Defanged IP Address: "+defangIpAddress(sampleIPAddress));
	}

}
