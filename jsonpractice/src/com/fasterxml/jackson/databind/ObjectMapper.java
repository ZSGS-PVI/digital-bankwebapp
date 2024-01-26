package com.fasterxml.jackson.databind;

public class ObjectMapper {
public static void main(String[] args) {
	ObjectMapper mapper=new ObjectMapper();
	Employee e1=new Employee(101,"kalpana devi");

}
}

class Employee{
	
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	private int emp_id;
	private String emp_name;
	
}
