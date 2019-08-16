package zhangxiaolei.exam5.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("  ");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText("  ");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		System.out.println(StringUtil.randomChineseString(3));
	}

	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
		for (int i = 0; i < 10; i++) {
			System.out.println(StringUtil.generateChineseName());
		}
	}

}
