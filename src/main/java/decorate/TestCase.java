package decorate;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by AdrainHuang on 2018/3/20.
 */
public class TestCase {
	public static void main(String[] args) throws ParseException {
		Flower flower = new Flower();
		flower.setColor("红色");
		flower.setSmell("菊花");
		LowerGardener lowerGardener = new LowerGardener(flower);
		lowerGardener.clip();
		MedianGardener medianGardener = new MedianGardener(lowerGardener);
		medianGardener.clip();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse("20180321"));
		cal.add(Calendar.DATE, -1);
		String date = sdf.format(cal.getTime());
		System.out.println(date);

	}
}
