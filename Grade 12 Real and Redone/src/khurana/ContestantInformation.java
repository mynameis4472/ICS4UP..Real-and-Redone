package khurana;

public class ContestantInformation {


	/**
	 *  @author Harkirat Khurana
	 */

	String specialChars[] = {"!","@","#","$","%","^","&","*","(",")","|","{","}","[","]","'",";",":",">","<","=","|","~","`",};

	private String firstName , lastName, streetNum, streetName, city, province, postalCode, phoneNum, age;

	/**
	 * 
	 * @param firstName1 sets first name
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setFirstName (String firstName1) throws InvalidInfoException
	{
		if (firstName1.length() <= 0)
		{
			throw new InvalidInfoException("Your name cannot have 0 letters.");
		}
		firstName1 = firstName1.substring(0, 1).toUpperCase() + firstName1.substring(1, firstName1.length()).toLowerCase();
		firstName = firstName1;
	}
	/**
	 * 
	 * @param lastName1 Sets lasttName
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setLastName (String lastName1)throws InvalidInfoException

	{

		if(lastName1.length()<= 0)
		{
			throw new InvalidInfoException("Your last name cannot have 0 letters.");	
		}
		lastName1 = lastName1.substring(0, 1).toUpperCase() +lastName1.substring(1, lastName1.length()).toLowerCase();
		
		this.lastName = lastName1;

	}
	/**
	 *
	 * @param streetNum1 Sets streetNum 
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setStreetNum (String streetNum1) throws InvalidInfoException
	{
		if(streetNum1.length()<=0)
		{
			throw new InvalidInfoException("Please enter a street number. If you do not have a street number, please input 'zero'.");
		}
		for (int i = 0; i< streetNum1.length();i++)
		{
			if (!Character.isDigit(streetNum1.charAt(i)))
			{
				throw new InvalidInfoException("Please enter a street number.");
			}
		}

		streetNum = streetNum1;



	}
	/**
	 *
	 * @param streetName1 Sets streetName 
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setStreetName (String streetName1)throws InvalidInfoException
	{


		for (int i = 0; i< streetName1.length();i++)
		{
			if (Character.isDigit(streetName1.charAt(i)))
			{
				throw new InvalidInfoException("Please only enter letters for the street name.");
			}
		}
		streetName1 = streetName1.substring(0, 1).toUpperCase() + streetName1.substring(1, streetName1.length()).toLowerCase();
		this.streetName = streetName1;
	}
	/**
	 * 
	 * @param city1 sets city
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setCity (String city1)throws InvalidInfoException
	{
		for (int i = 0; i< city1.length();i++)
		{
			if (Character.isDigit(city1.charAt(i)))
			{
				throw new InvalidInfoException("Please only include letters in your city name.");
			}
		}
		
		if(city1.length() == 0)
		{
			throw new InvalidInfoException("Please enter your city.");
		}
		
		city1 = city1.substring(0, 1).toUpperCase() + city1.substring(1, city1.length()).toLowerCase();
		this.city = city1;
	}
	/**
	 * 
	 * @param province1 sets province
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setProvince (String province1) throws InvalidInfoException
	{



		if (!(province1.equalsIgnoreCase("AB") || province1.equalsIgnoreCase("BC") || province1.equalsIgnoreCase("MB") || province1.equalsIgnoreCase("NL") || province1.equalsIgnoreCase("NS") || province1.equalsIgnoreCase("NT") || province1.equalsIgnoreCase("NU") || province1.equalsIgnoreCase("ON") || province1.equalsIgnoreCase("PE") || province1.equalsIgnoreCase("QS") || province1.equalsIgnoreCase("SK") || province1.equalsIgnoreCase("YT") )|| province1.matches("[0-9]"))
		{

			throw new InvalidInfoException("Province name invalid. Please enter one of the following:AB- Alberta, BC- British Colombia, MB- Manitoba, NL- Newfoundland and Labrador, NS- Nova Scotia, NT- Northwest Territories, NU- Nunavut, ON- Ontario, PE- Prince Edward Island, QS- Quebec, SK- Seskatchewan, YT- Yukon Territory");


		}

		if (province1.equals("AB") ||province1.equals("Alberta") || province1.equals("ab"))
		{
			province = "AB";
		}

		else if (province1.equals("BC") ||province1.equals("British Colombia") || province1.equals("bc"))
		{
			province1 = "BC";
		}
		else if (province1.equals("MB") ||province1.equals("Manitoba")|| province1.equals("mb"))
		{
			province1 = "MB";
		}
		else if (province1.equals("NL") ||province1.equals("Newfoundland and Labrador") || province1.equals("nl"))
		{
			province1 = "NL";
		}
		else if (province1.equals("NS") ||province1.equals("Nova Scotia")|| province1.equals("ns"))
		{
			province1 = "NS";
		}
		else if (province1.equals("NT") ||province1.equals("Nunavut")|| province1.equals("nt"))
		{
			province1 = "NT";
		}
		else if (province1.equals("ON") ||province1.equals("Ontario")|| province1.equals("on"))
		{
			province1 = "ON";
		}
		else if (province1.equals("PE") ||province1.equals("Prince Edward Island")|| province1.equals("pe"))
		{
			province1 = "PE";
		}
		else if (province1.equals("QS") ||province1.equals("Quebec")|| province1.equals("qs"))
		{
			province1 = "QS";
		}
		else if (province1.equals("SK") ||province1.equals("Saskatchewan")|| province1.equals("sk"))
		{
			province1 = "SK";
		}
		else if (province1.equals("YK") ||province1.equals("Yukon Territory")|| province1.equals("yk"))
		{
			province1 = "YK";
		}


		this.province = province1;
	}
	/**
	 * 
	 * @param postalCode1 sets postalCode
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setPostalCode (String postalCode1)throws InvalidInfoException
	{
		if(postalCode1.length()> 6 || postalCode1.length()< 6)
		{
			throw new InvalidInfoException("Postal code invalid. Please only write the numbers and the letters. Do not include any - or () or spaces.");
		}
		else if (!(postalCode1.matches("[A-Z][0-9][A-Z][0-9][A-Z][0-9]")))
		{
			throw new InvalidInfoException("Postal Code Invalid. Please enter your postal code in this format: 'A#A#A#'.");
		}
		

		this.postalCode = postalCode1;
	}
	/**
	 * 
	 * @param phoneNum1 sets phoneNum
	 * @throws InvalidInfoException throws exception when input is not as expected
	 */
	public  void setPhoneNum (String phoneNum1)throws InvalidInfoException
	{
		if (!(phoneNum1.length() ==10))
		{
			throw new InvalidInfoException("Please enter a valid phone number and in the following format : ##########");
		}
		if(!phoneNum1.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
		{
			throw new InvalidInfoException("Only include numbers please.");
		}


		this.phoneNum = phoneNum1;

	}
	/**
	 * 
	 * @param age1 age
	 * @throws InvalidInfoException error message is displayed
	 */
	public  void setAge (String age1)throws InvalidInfoException
	{ 
		for(int k = 0; k >= age1.length(); k++)
		{
			if(!(Character.isDigit(age1.charAt(k)))== true)
			{
				throw new InvalidInfoException("Please use only digits.");
			}
		}

		if(Integer.parseInt(age1)  <=0)
		{
			throw new InvalidInfoException("Being under 0 years is not possible. Also, if you are 0 and can use a computer, please book an appointment with us so we can talk to you personally.");
		}


		this.age = age1;
	}


	/**
	 * 	
	 * @return firstName returns firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 *
	 * @return lastName returns firstName 
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * 
	 * @return streetNum returns firstName
	 */
	public String getStreetNum()
	{
		return streetNum;
	}
	/**
	 * 
	 * @return streetName returns streetName
	 */
	public String getStreetName()
	{
		return streetName;
	}
	/**
	 * 
	 * @return city returns city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * 
	 * @return province returns province
	 */
	public String getProvince()
	{
		return province;
	}
	/**
	 * 
	 * @return postalCode returns postalCode
	 */
	public String getPostalCode()
	{
		return postalCode;
	}
	/**
	 * 
	 * @return phoneNum sets phoneNum
	 */
	public String getPhoneNum()
	{
		return phoneNum;
	}
	/**
	 * 
	 * @return age returns age
	 */
	public int getAge()
	{
		return (Integer.parseInt(age)) ;
	}



/**
 * 
 * @param contestant1 object holding contestant's information
 */
	public ContestantInformation(ContestantInformation contestant1)

	{
		this.firstName = contestant1.firstName;
		this.lastName = contestant1.lastName;
		this.streetNum = contestant1.streetNum;
		this.streetName = contestant1.streetName;
		this.city = contestant1.city;
		this.province = contestant1.province;
		this.phoneNum = contestant1.phoneNum;
		this.postalCode = contestant1.postalCode;
		this.age = contestant1.age;

	}
	/**
	 * 
	 */
	public ContestantInformation()
	{

	}
	/**
	 * 
	 * @param fName First Name
	 * @param lName Last Name
	 * @param streetNum Street Number
	 * @param streetName Street Name
	 * @param city City
	 * @param province Province
	 * @param postalCode Postal Code
	 * @param phoneNum Phone Number
	 * @param age Age
	 */
	public ContestantInformation(String fName,String lName,String streetNum,String streetName,String city,String province,String postalCode,String phoneNum,String age )
	{

	}

	/**
	 * 
	 * @param firstName First Name
	 * @param lastName Last Name
	 * @param streetNum Street Number
	 * @param streetName Street Name
	 * @param city City
	 * @param province Province
	 * @param postalCode Postal Code
	 * @param age Age 
	 * @param phoneNum Phone Number
	 * @return returns all the variables in one line
	 */
	public String toString (String firstName, String lastName, String streetNum, String streetName, String city, String province, String postalCode, String phoneNum, String age )
	{
		return (firstName +  " " + lastName +  " " + streetNum +  " " + streetName +  " " + city +  " " + province +  " " + postalCode +  " " + phoneNum + " " + age);

	}
	public String toString ()
	{
		return (firstName +  " " + lastName +  " " + streetNum +  " " + streetName +  " " + city +  " " + province +  " " + postalCode +  " " + phoneNum +  " " + age);

	}

}
