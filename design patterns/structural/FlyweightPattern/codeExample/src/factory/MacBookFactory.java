package factory;

import java.util.HashMap;
import java.util.Map;

import beans.MacBook;
import beans.MacBookAir;
import beans.MacBookAirFlyWeight;

public class MacBookFactory {

	private static Map<String, MacBookAir> macBooks = new HashMap<String, MacBookAir>();

	public static MacBook createMacBookAir(String id, int ram, int discCapacity) {
		MacBookAir macBookAir = getMacBookAir(ram, discCapacity);

		return new MacBookAirFlyWeight(id, macBookAir);
	}

	public static int getCreatedMacs() {
		return macBooks.size();
	}

	private static MacBookAir getMacBookAir(int ram, int discCapacity) {
		String key = ram + "-" + discCapacity;

		if (!macBooks.containsKey(key)) {
			macBooks.put(key, new MacBookAir(ram, discCapacity));
		}
		return macBooks.get(key);
	}

}
