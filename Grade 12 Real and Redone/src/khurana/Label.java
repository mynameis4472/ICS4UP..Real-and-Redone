/**
 * 
 */
package khurana;

/**
 * @author Harkirat Khurana
 *
 */
public class Label {
	
	private ContestantInformation ci1 = new ContestantInformation();
	
	
	/**
	 * 
	 * @param ci uses the information from the ContestantInformation class to format the information in this class using methods
	 */
	public Label (ContestantInformation ci)
	{
		 ci1 = ci;
		 String name= formatName();
			String address =  formatAddress();
			String number = formatNumber();
		 toString(name, address, number);
		
	}
	/**
	 * 
	 * @return nameOutput formats the first name and last name of the user
	 */
	public String formatName( )
	{
		String nameOutput = ci1.getLastName() + ", " + ci1.getLastName() + "\n";
		return nameOutput;
	}
	/**
	 * 
	 * @return formatted address
	 */
	public String formatAddress( )
	{
		String addressOutput = ci1.getStreetNum() + " " + ci1.getStreetName() + "\n" + ci1.getCity() + ", " + ci1.getProvince() + "\n" + ci1.getPostalCode().substring(0, 3)+ " "+ ci1.getPostalCode().substring(3, 6) + "\n";             
				
		return addressOutput;
	}
	/**
	 * 
	 * @return formatted phone number, 
	 */
	public String formatNumber( )
	{
		String phoneNumOutput =  "(" + ci1.getPhoneNum().substring(0, 3) + ") "+ ci1.getPhoneNum().substring(3, 6) + " - " + ci1.getPhoneNum().substring(5, 9);
		return phoneNumOutput;
	}

	/**
	 * 
	 * @param name- formatted name
	 * @param address- formatted address
	 * @param number- formatted phone number
	 * @return finalOutput- all the formatted things compiled
	 */
	public String toString(String name, String address, String number)
	{
		String finalOutput = formatName() + formatAddress() + formatNumber() ;
		System.out.println(name + address + number );
		return finalOutput;
	
	
		 
		
	}
	
}