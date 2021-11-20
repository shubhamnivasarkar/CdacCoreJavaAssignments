package utils;



import java.text.ParseException;
import java.util.Date;
import com.app.core.Course;



import static com.app.core.Student.sdf;


public class Validation {
	public static Date convertDate(String date) throws ParseException
	{
		return sdf.parse(date);
	}
	//add static method to parse string --> enum
	public static Course convertType(String course)
	{
		return Course.valueOf(course.toUpperCase());//IllegalArgumentException : un chked
	}
	
}
