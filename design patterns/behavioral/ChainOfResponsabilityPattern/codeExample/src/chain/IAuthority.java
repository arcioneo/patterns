package chain;

public interface IAuthority {

	void setNext(IAuthority authority);

	IAuthority getNext();

	void requestLoan(int amount);

}
