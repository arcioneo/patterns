package chain;

public class Manager implements IAuthority {

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
		if (amount > 50_000 && amount <= 100_000) {
			System.out.println("Manager will approve it");
		} else {
			next.requestLoan(amount);
		}
	}

}
