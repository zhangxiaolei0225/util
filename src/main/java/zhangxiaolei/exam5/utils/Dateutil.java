package zhangxiaolei.exam5.utils;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Dateutil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		Date date = getDateByInitMonth(src);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
	
	}
	/**
	 * 1.给定一个日期.计算该月有多少天?
	 */
	public static long getday(Date d) {
		Date date1 = getDateByInitMonth(d);
		Date date2 = getDateByFullMonth(d);
		long time = date1.getTime();
		long time2 = date2.getTime();
		return (time2-time)/(24*60*60*1000)+1;
		
	}
	/**
	 * 2.给定一个出生日期,计算其年龄?
	 * @throws ParseException 
	 */
	public static int getyear(Date d) throws ParseException {
		
		/*
		 * long time1 = d.getTime(); Date date2= new Date(); long time2 =
		 * date2.getTime(); return ((time2-time1)/(24*60*60*1000));
		 */
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int i = c.get(Calendar.YEAR);
		Date date = new Date();
		c.setTime(date);
		int j = c.get(Calendar.YEAR);
		return j-i;
		
	}
	
	public static Date getrandom(Date start,Date end) {
		long time1 = start.getTime();
		long time2 = end.getTime();
		//Random r = new Random();
		long time = (long) (Math.random()*(time2-time1+1)+time1);
		return new Date(time);
		
	}
	//示例:方法5：求过去日期离今天过去的天数
		public static int getDaysByDeparted (Date departed) {
			  //未来时间
					long d = departed.getTime();
					//当前时间
					long n = new Date().getTime();
					
					if(d>n)
						throw new RuntimeException("不是过去日期");
					return (int) ( Math.floor((n-d)/24.0/60/60/1000));
			
		
		}
		
		
		
		//示例:方法4：求未来日期离今天还剩的天数
		public static int getDaysByFuture (Date future) {
		    //未来时间
			long f = future.getTime();
			//当前时间
			long n = new Date().getTime();
			
			if(f<n)
				throw new RuntimeException("不是未来日期");
			return (int) Math.ceil((f-n)/24.0/60/60/1000);
			
		}
		

		/**
		 * 
		 * @Title: getAge
		 * @Description: 根据传入的日期获取你那里
		 * @param date
		 * @return
		 * @return: int
		 */
		public static int getAge(Date birthday) {
			// 获取当前系统的日历类
			Calendar c = Calendar.getInstance();
			// 获取当前年月日
			int yearNow = c.get(Calendar.YEAR);
			int monthNow = c.get(Calendar.MONTH);
			int dateNow = c.get(Calendar.DAY_OF_MONTH);
			// 用生日初始化日历类
			c.setTime(birthday);
			int yearBirth = c.get(Calendar.YEAR);
			int monthBirth = c.get(Calendar.MONTH);
			int dateBirth = c.get(Calendar.DAY_OF_MONTH);

			// 年龄 1990-02-10 2019-02-08
			int age = yearNow - yearBirth;
			// 出生月份大于前月份 年龄减少1
			if (monthBirth > monthNow) {
				age--;
			}
			// 如果月份一致并且 日期大于当前日期 年龄减少1
			if (monthBirth == monthNow && dateBirth > dateNow) {
				age--;
			}

			return age;

		}
}
