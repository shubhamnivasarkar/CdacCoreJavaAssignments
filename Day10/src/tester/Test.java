package tester;

import java.util.ArrayList;

import java.util.Scanner;
import com.app.core.Student;
import static com.app.core.Student.sdf;

import static utils.Validation.convertType;
import custom_exception.StudentHandlingException;

public class Test {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)){
		ArrayList<Student> stud = new ArrayList<>();
		System.out.println("AL content");
		for(Student s : stud)
			System.out.println(s);
		boolean exit = false;
		while(!exit) {
			System.out.println("Option 1. Add student details, 2. Fetch Student details, 3. Display all, "
					+ "4. Cancel Admission, 5. Update GPA, 10.Exit");
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
				
			case 10:
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
	


	


