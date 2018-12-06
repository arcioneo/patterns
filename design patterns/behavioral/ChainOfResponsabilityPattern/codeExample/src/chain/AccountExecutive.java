package chain;

public class AccountExecutive implements IAuthority {
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
		if (amount <= 10_000) {
			System.out.println("AccountExecutive will approve it");
		} else {
			next.requestLoan(amount);
		}
	}

}
