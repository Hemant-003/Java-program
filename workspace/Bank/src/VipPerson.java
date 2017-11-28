
public class VipPerson {

	private String Name;
	private double CreditLimit;
	private String EmailAddress;
	
	public VipPerson(){
		this("Hemant",5000,"anyone");
	}
	public VipPerson(String Name, double CreditLimit){
		this(Name, CreditLimit, "hemantchaurasia95@gmail.com");
	}
	public VipPerson(String Name, double CreditLimit, String EmailAddress){
		this.Name=Name;
		this.CreditLimit=CreditLimit;
		this.EmailAddress=EmailAddress;
	}
	}
