package Lab5;

public class NameException extends Exception
{
	NameException (String s)
	{
		super (s);
	}
	public static void validate(String s1,String s2)throws NameException
	{
		if(s1.isEmpty()||s2.isEmpty() )
		{
			throw new NameException("ENTER FIRST AND LAST NAME");
		}
		else
		{
			System.out.println("Your welcome");
		}
	}
	public static void main(String[] args) {
		String fname="";
		String lname="";
		try {
			validate(fname,lname);
		} catch (NameException e) {
			System.out.println("Exception occured"+e.getMessage());
			e.printStackTrace();
		}
	}
}
