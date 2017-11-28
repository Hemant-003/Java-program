
public class FrontEnd {
	public static void main(String[] args) {
		BackEnd Hemant = new BackEnd();
		BackEnd Ravi = new BackEnd();

		Hemant.setCustomerName("Hemant");
		System.out.println("Customer's name is " + Hemant.geCustomeName());

		Hemant.setAccountNumber(121295003);
		System.out.println("Account number is " + Hemant.getaccountNumber());

		Hemant.setEmailId("Hemant@gmail.com");
		System.out.println("Email id is " + Hemant.getEmailId());

		Hemant.setbalance(2002);
		{
			System.out.println("Balance is " + Hemant.getbalance());

			Hemant.setphoneNumber(740553046);
			System.out.println("Phone Number is " + Hemant.getphoneNumber());

			Hemant.withDrawal(500);
			Hemant.CustomerDeposit(800);

		}

	}
}
