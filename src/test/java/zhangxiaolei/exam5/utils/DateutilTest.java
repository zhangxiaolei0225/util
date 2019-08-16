package zhangxiaolei.exam5.utils;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateutilTest {

	@Test
	public void testGetDateByInitMonth() {
		Date date = Dateutil.getDateByInitMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {
		Date date = Dateutil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	@Test
	public void testgetyear() throws ParseException {
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Date date1
		 * =sdf.parse("1996-1-18"); long getyear = Dateutil.getyear(date1);
		 * System.out.println(getyear/365);
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 =sdf.parse("1996-1-18");
		int l = Dateutil.getyear(date1);
		System.out.println(l);
	}
	@Test
	public void testgetday() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date date1 =sdf.parse("1996-2-18");
		long getday = Dateutil.getday(date1);
		System.out.println(getday);
	}
	
	@Test
	public void test1() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date1 = Dateutil.getDateByInitMonth(new Date());
		Date date2 = Dateutil.getDateByFullMonth(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sql2 = sql.replace("{1}",sdf.format(date1)).replace("{2}", sdf.format(date2)); 
		System.out.println(sql2);
	}

}
