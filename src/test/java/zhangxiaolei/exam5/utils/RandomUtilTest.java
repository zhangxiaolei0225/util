package zhangxiaolei.exam5.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			
			int random = RandomUtil.random(1,3);
			System.out.println(random);
		}
		
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(5,10,3);
		for (int i : is) {
			System.out.print(i+" ");
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 10; i++) {
			
			char c = RandomUtil.randomCharacter();
			System.out.println(c);
		}
	}

	@Test
	public void testRandomString() {
		for (int i = 0; i <10; i++) {
			
			String String = RandomUtil.randomString(5);
			System.out.println(String);
		}
	}

}
