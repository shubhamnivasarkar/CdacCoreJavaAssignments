package custom_comp;

import java.util.Comparator;

import com.app.core.Student;

public class StudentDateComparator implements Comparator<Student>{

@Override
public int compare(Student d1, Student d2) {
	System.out.println(" in compare : date");
	return ((Double)d1.getGpa()).compareTo(d2.getGpa());
	
}
	
	
}
