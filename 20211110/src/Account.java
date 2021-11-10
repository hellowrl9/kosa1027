
public class Account {
	String accountNo;
	String owner;
	int balance;
	public Account() {}
	public Account(String accountNo, String owner,
			int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	//setter, getter 생성 단축키 : Alt + Shift + S > r > alt + a :모두 선택
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
