import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example {
	
	public static void main(String arg[]) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, 500));
		empList.add(new Employee(2, 1000));
		empList.add(new Employee(3, 1500));
		empList.add(new Employee(4, 2000));
		empList.add(new Employee(5, 2500));
		empList.add(new Employee(6, 3000));
		empList.add(new Employee(7, 3500));

// Given an Employee list, sort employees based on their salaries in desc order?
//Fetch top 3 highest salaried employee details?
//Fetch all employees having salary less than 3rd highest salary?		
		
		
//		List<Employee> empSortedList=empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
//		
//		System.out.println(empSortedList);
		
		/*
		 * Fetch top 3 highest salaried employee details?
		 */
		
//		List<Employee> empSortedList=empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
//				.limit(3)
//				.collect(Collectors.toList());
//		
//		System.out.println(empSortedList);
//	}

		/*
		 * Fetch all employees having salary less than 3rd highest salary?	
		 */
//		List<Employee> empSortedList=empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
//		.skip(3)
//		.collect(Collectors.toList());
//
//       System.out.println(empSortedList);
		
		
}
}
