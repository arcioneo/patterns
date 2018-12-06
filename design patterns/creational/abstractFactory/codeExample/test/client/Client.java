package client;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Before;
import org.junit.Test;

import beans.Android;
import beans.Apple;
import beans.Mobile;
import consumer.MobileFactory;
import factory.AndroidFactory;
import factory.AppleFactory;

public class Client {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Mobile googlePixel = MobileFactory.getMobile(new AndroidFactory("LG", "Pixel"));
		Mobile iPhone6s = MobileFactory.getMobile(new AppleFactory("Apple", "Iphone 6s"));

		assertThat(googlePixel, IsInstanceOf.instanceOf(Android.class));
		assertThat(iPhone6s, IsInstanceOf.instanceOf(Apple.class));

		System.out.println(googlePixel);
		System.out.println(iPhone6s);
	}

}
