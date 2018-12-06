package chain;

public class TeamLeader implements IAuthority {
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
		if (amount > 10_000 && amount <= 50_000) {
			System.out.println("TeamLeader will approve it");
		} else {
			next.requestLoan(amount);
		}
	}
}
