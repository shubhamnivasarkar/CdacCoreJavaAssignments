package tester;

import static utils.ValidationUtils.*;
import static utils.CollectionUtils.populatedData;
import static utils.CollectionUtils.populateMap;


import java.util.HashMap;
import java.util.Scanner;


import com.app.core.Book;

import custom_exception.BookHandlingException;



public class Test {
	

	public static void main(String[] args) {

	try (Scanner sc = new Scanner(System.in)) {
		HashMap<String,Book> acctMap = populateMap(populatedData());
		boolean exit = false;
		while (!exit) {
				System.out.println("Options 1. Add book, 2. Display all books in library, 3 Issue out a book, 4 Return a book, 5. Remove book, 100. Exit");
			try {
				switch (sc.nextInt()) {
				
				case 1: //add
					System.out.println("Enter the details : Title, type, price, publishdate, authorname, quantity");
					System.out.println("Enter title");
					String acctNo = sc.next();
					if (acctMap.containsKey(acctNo)) 
						throw new BookHandlingException("Duplicate title");
					System.out.println(acctMap.put(acctNo, new Book(sc.next(), convertType(sc.next()), sc.nextDouble(), convertDate(sc.next()), sc.next(), sc.nextInt())));
					break;
				case 2://display
					System.out.println(acctMap);// Map's toString {k1:v1,k2:v2....}
					for (Book a: acctMap.values())
						System.out.println(a);
					break;
				case 3://issue
					System.out.println("enter a title of a book");
					String title2 = sc.next();
					if(acctMap.containsKey(title2)) {
						System.out.println("Quantities available");
						System.out.println(acctMap.get(title2).getQuantity());
						acctMap.get(title2).setQuantity(sc.nextInt());
						System.out.println("remaining quantites"+acctMap.get(title2));
					
					}else System.out.println("Sorry, book not found");
					break;
				case 4://return
					System.out.println("Enter title of a book");
					String title3 = sc.nextLine();
					Book stdbook= acctMap.get(title3);
					if(acctMap.containsKey(stdbook)) {
						System.out.println("Enter returned book");
						int d = sc.nextInt();
						stdbook.setQuantity(d);
						System.out.println("book returned");
						
				
				}break;
				case 5://remove
					System.out.println("Enter book to remove");
					String remvBook=sc.next();
					if(acctMap.containsKey(remvBook)) {
						acctMap.remove(remvBook);
					}else throw new BookHandlingException("no such book");
					break;
					
				case 100 :
					exit = true;
					break;
					
					
					
					
			}
						
						
						
						
						
						
						
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
					
			}
		}
	}
}
