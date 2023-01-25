package udemy_java_eclipse_exercises;

public class Employee {
	
	private int id;
	private String first_name;
	private String last_name;
	private int salary;

	public Employee(int employee_id, String firstName, String lastName, int Salary) {
		this.id = employee_id;
		this.first_name = firstName;
		this.last_name = lastName;
		this.salary = Salary;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.first_name;
	}
	
	public String getLastName() {
		return this.last_name;
	}
	
	public String getName() {
		return " "+this.first_name+ " "+this.last_name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int Salary) {
		this.salary = Salary;
	}
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	
	public int raiseSalary(int percent) {
		float addSalary =  this.salary * (percent/100F);
		this.salary = (int) ((int) this.salary + addSalary);
		return this.salary;
	}
	
	public String toString() {
		return "Employee [id = " +this.id+ ", name = "+this.first_name+ " " +this.last_name+ ", salary = " +this.salary+"]";
	}

}







