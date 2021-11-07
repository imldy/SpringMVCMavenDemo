package cn.imldy.springmvc.convert;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author imldy
 * @date 2021/11/07 19:40
 * 使用Formatter自定义日期转换类
 **/
public class DateFormatter implements Formatter<Date> {
    // 定义日期格式
    String datePattern = "yyyy-MM-dd HH:mm:ss";
    // 声明SimpleDateFormat对象
    private SimpleDateFormat simpleDateFormat;

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        return simpleDateFormat.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        return new SimpleDateFormat().format(date);
    }
}
