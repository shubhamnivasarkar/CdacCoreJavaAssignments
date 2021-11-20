package com.app.org.tester;
import com.app.org.Emp;
import com.app.org.Manager;
import com.app.org.Worker;

import java.util.*;

public class TestOrganization {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employee to add");
		int n=sc.nextInt();
		Emp[] e= new Emp [n];
		boolean flag = false;
		int counter = 0;
		while(!flag)
		{
			System.out.println("1. Add Manager , 2. Add Worker , 3. Display information of all employees , 4. Update performance bonus or hourly rate , 10. Exit");
			System.out.println("Enter your choice ");
			switch(sc.nextInt())
			{
			case 1:
				if (counter<e.length)
				{
					System.out.println("Enter manager's detail : Id, name, deptId, basic, performancebonus");
					e[counter++]= new Manager(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
				}
				else
					System.out.println("No space");
				break;
			case 2:
				if(counter<e.length)
				{
					System.out.println("Enter the Details of Worker :id, name, deptId,basicSalary,hoursWorked,hourlyRate");
	    			   e[counter++]=new Worker(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

				}else
					System.out.println("No space");
				break;
			case 3:
				for (Emp e1: e)
				{
					if(e1==null)
					{
						
					}else
					{
						System.out.println(e1.toString());
						if(e1 instanceof Manager)
						{
							System.out.println("Performance bonus"+((Manager)e1).getperfmonceBonus());
						
						}else
							if(e1 instanceof Worker)
							{
								System.out.println("Hourly rate"+((Worker)e1).gethourlyRate());
							}
					}
				}break;
			case 4:
	    		  System.out.println("Enter i'd");
	    		 
	    		  int ID=sc.nextInt();
	    		  for(Emp e1:e)
	    		  {
	    			  if(e1.getId()==ID)
	    			  {
	    				  if(e1 instanceof Manager)
	    				  {
	    					  System.out.println("Enter the increment bonus:");
	    					  ((Manager) e1).setperfmonceBonus(sc.nextDouble());
	    					  System.out.println(e1.toString());
	    				  }
	    				  else
	    				  {
	    					  System.out.println("Enter hourly rate increment");
	    					  ((Worker)e1).sethourlyRate(sc.nextDouble()); 
	    					  System.out.println(e1.toString());
	    				  }
	    			  }
	    		  }
	    		  break;
				case 5:
					flag = true;
			
					break;
					
					
			}sc.close();
		}
	}

}
