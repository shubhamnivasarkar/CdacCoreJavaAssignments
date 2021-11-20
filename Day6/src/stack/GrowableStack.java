package stack;
import java.util.*;

public class GrowableStack implements Stack {
	
	private Employee[] stack = new Employee[STACK_SIZE];
	private int top = -1;

	@Override
	public void push(Employee emp) {
		if (top!=STACK_SIZE-1) 
			stack[++top] = emp;
		else { // Upon stack full
			Employee[] temp = stack;
			stack = new Employee[stack.length*2];
			for (int i=0; i<=top; i++)
				stack[i] = temp[i];
			stack[++top] = emp;
		}
	}

	@Override
	public Employee pop() {
		if (top!=-1) {
			Employee emp = stack[top];
			stack[top--] = null;
			return emp;	
		}
		return null;
	}

}
