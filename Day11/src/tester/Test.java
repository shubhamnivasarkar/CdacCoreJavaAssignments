package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;


import com.app.core.Course;
import com.app.core.Student;
import static com.app.core.Student.sdf;
import static utils.Validation.convertDate;
import static utils.Validation.convertType;
import custom_exception.StudentHandlingException;
import custom_comp.StudentDateComparator;

import static utils.CollectionUtils.populateSampleData;;

public class Test {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)){
		ArrayList<Student> stud = populateSampleData();
		boolean exit = false;
		while(!exit) {
			System.out.println("Option 1. Add student details, 2. Fetch Student details, 3. Display all, "
					+ "4. Cancel Admission, 5. Update GPA, 6. Display Details by date, 7.  Sort by asc PRN no, "
					+ "8.Sort by GPA, 9. Sort by Course and GPA. 10. Remove details as per GPA, "
					+ "11. Display details in reverse order,  100.Exit");
		try {
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter Student Details : PRN, NAME, EMAIL, PASSWORD, Course TYPE, GPA, DOB ");
				stud.add(new Student(sc.next(), sc.next(), sc.next(), sc.next(), convertType(sc.next()), sc.nextDouble(), sdf.parse(sc.next())));
				
				
				break;
				
			case 2:
				System.out.println("Enter PRN : ");
				Student s1 = new Student(sc.next());
				int index = stud.indexOf(s1);
				if(index == -1) {
				
					throw new StudentHandlingException("Student PRN not found"); 
				}
					System.out.println(stud.get(index));
				
				break;
				
			case 3:
				System.out.println("Display all");
				for(Student s5 : stud) {
				System.out.println(s5);
				}
				break;
				
			case 4:
				System.out.println("Enter PRN : ");
				Student s2 = new Student(sc.next());
				int index1 = stud.indexOf(s2);
				if(index1 == -1)
					throw new StudentHandlingException("Student PRN not found");
				else if(stud.remove(s2)){
					System.out.println("Removed successfully");
				}
				break;
				
			case 5:
				System.out.println("Enter PRN and Update GPA (Gpa must contain  "
						+ "upto 2 decimal digit");
				Student student1 = new Student(sc.next());
				double gpa = sc.nextDouble();
				int index2 = stud.indexOf(student1);
				Student stud2 = stud.get(index2);
				stud2.setGPA(gpa);
				System.out.println("Updated successfully");
				System.out.println(stud2.toString());
				break;
				
			case 6:
				System.out.println("Enter course name and date");
				Course c = convertType(sc.next());
				Date ipdate = convertDate(sc.next());
				System.out.println("List of course wise name and Dob after" +sdf.format(ipdate));
				for(Student s : stud) {
					if(s.getType().equals(c)) {
						if(s.getDob().before(ipdate))
							System.out.println("Student details"+s);
					}
				}
				
				
				break;

				
			case 7:
				Collections.sort(stud);
				
				break;

			case 8:
				Collections.sort(stud, new StudentDateComparator());
				break;

			case 9:
				Collections.sort(stud, new Comparator<Student>() {// ano inner cls begi
					@Override
					public int compare(Student a1, Student a2) {
						System.out.println("in compare : date n bal");
						int ret = a1.getType().compareTo(a2.getType());
						if (ret == 0) 
						{
							
							if (a1.getGpa() < a2.getGpa())
								return -1;
							if (a1.getGpa() == a2.getGpa())
								return 0;
							return 1;
						}
						return ret;
					}
				}// ano inner cls end
				);
				break;

			case 10:
				System.out.println("Failed students removed from list");
				Iterator<Student>itr = stud.iterator();
				while(itr.hasNext()) {
					Student d = itr.next();
					itr.remove();
					System.out.println(d);
				}
				
				break;

			case 11://Display detials in reverse
		        Collections.sort(stud, Collections.reverseOrder());

				
				break;

				
				
				
				
			case 100:
				exit = true;
				break;
				
				
			}
		
		}catch(Exception e){
				e.printStackTrace();
			}
		sc.nextLine();
		
			
				}
		
			}
		}
	}
	


	


