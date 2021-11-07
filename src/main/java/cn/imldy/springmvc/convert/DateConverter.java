package cn.imldy.springmvc.convert;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author imldy
 * @date 2021/11/07 19:17
 **/
public class DateConverter implements Converter<String, Date> {

    // Converter(需要被转换的类型，需要转换成的目标类型)
    private String datePattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date convert(String s) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern);
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("无效的日期格式，请使用此格式" + this.datePattern);
        }
    }

}
