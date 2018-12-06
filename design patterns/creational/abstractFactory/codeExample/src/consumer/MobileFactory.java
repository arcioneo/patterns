package consumer;

import beans.Mobile;
import interfaces.MobileAbstractFactory;

public class MobileFactory {

	public static Mobile getMobile(MobileAbstractFactory factory) {
		return factory.createMobile();
	}

}
