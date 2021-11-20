package utils;
import static utils.ValidationUtils.convertDate;

import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.*;

import static com.app.core.Category.*;

public class CollectionUtils {
	public static ArrayList<Book> populatedData(){
		ArrayList<Book> book = new ArrayList<>();
	try {
		book.add(new Book("ari", JAVA, 500.00, convertDate("01/01/2019"), "abc", 5));
		book.add(new Book("han", PYTHON, 200.00, convertDate("01/01/2018"), "def", 2));
		book.add(new Book("thh", JAVASCRIPT, 550.00, convertDate("01/02/2019"), "flip", 6));
		book.add(new Book("dem", C, 2500.00, convertDate("02/01/2019"), "hello", 7));
		book.add(new Book("world", QUANT, 3500.00, convertDate("01/01/2017"), "aim", 4));
		book.add(new Book("uni", JAVA, 500.00, convertDate("01/01/2019"), "abc", 5));
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return book;
}
	//add a static method to copy sample data from list ---> map
		public static HashMap<String, Book> populateMap(ArrayList<Book> accts)
		{
			HashMap<String,Book> map=new HashMap<>();
			for(Book a : accts) 
				System.out.println("Added "+map.put(a.getTitle(), a));
			return map;
		}



}
