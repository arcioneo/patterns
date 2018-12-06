package facade;

import utilities.PaymentManager;
import utilities.RoomAvailabilityChecker;
import utilities.RoomLocker;

public class ReservationFacade {
	private PaymentManager			paymentManager;
	private RoomAvailabilityChecker	roomAvailabilityChecker;
	private RoomLocker				roomLocker;

	public ReservationFacade() {
		super();
		paymentManager = new PaymentManager();
		roomAvailabilityChecker = new RoomAvailabilityChecker();
		roomLocker = new RoomLocker();
	}

	public void reserveRoom() {
		roomAvailabilityChecker.isRoomAvailableForDate();
		roomLocker.lockRoom();
		paymentManager.receivePayment();
	}

}
