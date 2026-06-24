package session12;

public class Bankdetails {

	private String acc_name;
	private int acc_no;
	private double acc_balance;


	void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	void getAcc_name() {
		System.out.println("Account name is: " + acc_name);
	}
	
	void getAcc_no() {
		System.out.println("Account number is: " + acc_no);
	}
	
	void getAcc_balance() {
		System.out.println("Account balance is: " + acc_balance);
	}
}

