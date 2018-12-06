package chain;

public class Bank implements IAuthority {

	private IAuthority next;

	@Override
	public void setNext(IAuthority authority) {
		next = authority;
	}

	@Override
	public IAuthority getNext() {
		return next;
	}

	@Override
	public void requestLoan(int amount) {
		AccountExecutive accountExecutive = new AccountExecutive();
		TeamLeader teamLeader = new TeamLeader();
		Manager manager = new Manager();
		Director director = new Director();

		this.setNext(accountExecutive);
		accountExecutive.setNext(teamLeader);
		teamLeader.setNext(manager);
		manager.setNext(director);

		next.requestLoan(amount);

	}

}
