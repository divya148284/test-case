import java.util.Scanner;
public class IncomeTaxCal
{
public static void main(String[] args)
{
float income;
Scanner scan=new Scanner(System.in);

System.out.print("Are you married or single?(M/F/SC): ");

String status = scan.next(); 
System.out.print("Enter Income of person : ");
income=scan.nextFloat();
float tax = getTax(status,income);
}
public static float getTax( String status,float income){
	float tax=0;
if(status.equalsIgnoreCase("M")) {
if (income<=180000.)
tax=0;
else if (income<=300000.00)
tax=(income-180000.00F)*10/100;
else if (income<=500000.00)
tax=(income-300000.00F)*20/100+5000;
else
tax=(income-500000.00F)*30/100+5000+30000;

System.out.printf("Income = %f \n",income);
System.out.printf("TAX = %f \n",tax);
}

else {
	if(status.equalsIgnoreCase("F")) {
		if (income<=180000.)
		tax=0;
		else if (income<=300000.00)
		tax=(income-180000.00F)*10/100;
		else if (income<=500000.00)
		tax=(income-300000.00F)*20/100+5000;
		else
		tax=(income-500000.00F)*30/100+5000+30000;

		System.out.printf("Income = %f \n",income);
		System.out.printf("TAX = %f \n",tax);
		}
	
}
return tax;

}
}