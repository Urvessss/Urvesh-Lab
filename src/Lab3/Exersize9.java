package Lab3;


	import java.time.*;
	
	
	public class Exersize9 {	
		
		   public static void main(String[] args)
		    {
		        LocalDate pdate = LocalDate.of(1998,05,26);
		        LocalDate now = LocalDate.now();
		 
		        Period diff = Period.between(pdate, now);
		 
		     System.out.printf("\nDifference is %d years, %d months and %d days old:", 
		                    diff.getYears(), diff.getMonths(), diff.getDays());
		  }
		}

