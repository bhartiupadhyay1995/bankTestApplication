
 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Heloo");
      Account account=new Account("A1234","Checking",100.00);
      account.deposit(500,"USD");
      account.withdraw(100,"USD");

	}

}
