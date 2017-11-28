
public class BackEnd {
	private static int helplineNumber;
	private int accountNumber;
	private int balance;
	private String CustomerName;
	private String EmailId;
	private int phoneNumber;
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber= accountNumber;
	}	
	public int getaccountNumber()
	{
		return this.accountNumber;
	}
	public void setbalance(int balance)
	{
		this.balance= balance;
	}
	public int getbalance()
	{
		return this.balance;
	}
	public void setCustomerName(String CustomerName)
	{
		this.CustomerName= CustomerName;
	}
	public String geCustomeName()
	{
		return this.CustomerName;
	}
	public void setEmailId(String EmailId){
		this.EmailId= EmailId;
	}
	public String getEmailId(){
		return this.EmailId;
	}
	public void setphoneNumber(int phoneNumber){
		this.phoneNumber= phoneNumber;
	}
	public int getphoneNumber(){
		return this.phoneNumber;
	}

	public int CustomerDeposit(int Money){
		if (Money>0){
			balance=balance + Money;
		}
		System.out.println("Current Balance is " + balance);
		return balance;
		
	}

	public int withDrawal(int Amount){
		if(Amount>0){
			balance= balance-Amount;
		}
		System.out.println("Amount Withdtawal is " + Amount + "Balance Left Is " + balance);
		return balance;
		
	}


}