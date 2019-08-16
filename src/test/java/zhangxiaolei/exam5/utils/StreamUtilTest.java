package zhangxiaolei.exam5.utils;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new FileInputStream("D:/demo.txt"));
		System.out.println(string);
		
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new File("D:/demo.txt"));
		System.out.println(string);
	}

}
