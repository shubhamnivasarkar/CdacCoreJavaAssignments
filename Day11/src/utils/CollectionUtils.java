package utils;

import java.util.ArrayList;
import java.text.ParseException;
import com.app.core.Student;
import static com.app.core.Course.*;
import static utils.Validation.*;

public class CollectionUtils {
	public static ArrayList<Student> populateSampleData() {
		ArrayList<Student> list = new ArrayList<>();
		try {
			list.add(new Student("abc123", "ranveer", "ranveer@gmail.com", "abc123", DBT, 8.50, convertDate("01/01/2019")));
			list.add(new Student("abc45", "mukesh", "mukesh@gmail.com", "abc124", REACT, 5.50, convertDate("01/02/2019")));
			list.add(new Student("abc456", "kumar", "kumar@gmail.com", "abc134", ANGULAR, 4.50, convertDate("01/03/2019")));
			list.add(new Student("abc56", "vinay", "vinay@gmail.com", "abc234", REST, 4.00, convertDate("01/04/2009")));
			list.add(new Student("abc567", "vijay", "vijay@gmail.com", "abc12234", SPRING, 7.50, convertDate("01/05/2017")));
			list.add(new Student("abc54", "rajesh", "rajesh@gmail.com", "abc13234", HIBERNATE, 8.25, convertDate("01/06/2018")));
			list.add(new Student("abc231", "ravindra", "ravindra@gmail.com", "abc15234", DBT, 9.50, convertDate("01/07/2020")));
			list.add(new Student("abc321", "yogesh", "yogesh@gmail.com", "abc12346", DBT, 6.50, convertDate("01/08/2010")));
		
		}catch (ParseException e) {
			System.out.println("error in sample data"+ e);
		}
		return list;
	}
}
