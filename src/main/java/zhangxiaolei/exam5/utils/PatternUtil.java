package zhangxiaolei.exam5.utils;

public class PatternUtil {
	public static Integer getlastnumfromurls(String url) {
		String[] split = url.split("\\D+");
		String num = split[split.length-1];
		return Integer.parseInt(num);
	}
	public static String getfirstnumfromurls(String url) {
		String[] split = url.split("\\D+");
		return split[1];
		
	}

}
