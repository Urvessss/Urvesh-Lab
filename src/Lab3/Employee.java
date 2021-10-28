package Lab3;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

class Employee {
    String name;
    int salary;

    Employee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class EmployeeInfo {

    enum SortMethod {
        BYNAME,BYSALARY;
    	
         
    };
	
public static boolean main(String[] args) {
	

   
        //What I have to Write here?
    	List<Employee> emps = new ArrayList<>();
    	emps.add(new Employee("Mickey", 100000));
    	emps.add(new Employee("Timmy", 50000));
    	emps.add(new Employee("Annny", 40000));
		return false;
    }
}
    


	