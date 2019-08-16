package zhangxiaolei.exam5.utils;



import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() throws UnsupportedEncodingException, ParseException {
		String s = "2010-1-1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < 10; i++) {
			String name = StringUtil.generateChineseName();
			Integer age = RandomUtil.random(1,120);
			String about = StringUtil.randomChineseString(140);
			Date created = Dateutil.getrandom(sdf.parse(s), new Date());
			System.out.println(sdf.parse(s));
			Person person = new Person(name, age, about,created);
			System.out.println(person);
			
		}
		
	}

}
