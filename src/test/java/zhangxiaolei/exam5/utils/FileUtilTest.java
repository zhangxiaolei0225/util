package zhangxiaolei.exam5.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String string = FileUtil.getExtendName("aaaa.jsp");
		System.out.println(string);
	}

	@Test
	public void testGetTempDirectory() {
		System.out.println(FileUtil.getTempDirectory());
	}

	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
