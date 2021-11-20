package utils;

import static com.app.core.Book.sdf;

import java.text.ParseException;
import java.util.Date;

import com.app.core.Category;

public class ValidationUtils {
	

	public static Date convertDate(String publishDate) throws ParseException
	{
		return sdf.parse(publishDate);
	}
	//add static method to parse string --> enum
	public static Category convertType(String type)
	{
		return Category.valueOf(type.toUpperCase());//IllegalArgumentException : un chked
	}
	

}
