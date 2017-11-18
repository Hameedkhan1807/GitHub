package devops.numbers;
/**
 * 
 */

//import static org.junit.Assert.*;


import org.junit.*;

import devops.numbers.Convertor;



public class ConvertorTest {
	
	@Test
	public void checkNotNull() {
		Convertor convtest = new Convertor();
		String str = convtest.convert(10);
		Assert.assertNotNull(str);
	}

	@Test
	public void checkTens() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("Fifty", convtest.convert(50));
	}
	
	@Test
	public void checkOness() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("Three", convtest.convert(3));
			}
	@Test
	public void checkLessthanNineteen() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("Eighteen", convtest.convert(18));
			}
	
	@Test
	public void checkNegativeNumber() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("negative Twenty Three", convtest.convert(-23));
	}

	@Test
	public void checklargeNumber() {
		Convertor convtest = new Convertor();
		Assert.assertEquals("Three Hundred Thirty Four Million Four Hundred Thirty Four Thousand Five Hundred Sixty Seven",
				convtest.convert(334434567));
	}

}
