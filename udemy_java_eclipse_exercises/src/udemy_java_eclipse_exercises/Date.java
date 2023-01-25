package udemy_java_eclipse_exercises;

public class Date{
	
	private int day;
	private int month;
	private int year;

	public Date(int day, int  month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		
		String add_zero_day = "";
		String add_zero_month = "";
		String add_zero_year = "";
		
		if(this.day < 10)
			add_zero_day = "0" + this.day;
		else
			add_zero_day = add_zero_day + this.day;
		
		if(this.month < 10)
			add_zero_month = "0" + this.month;
		else
			add_zero_month = add_zero_month + this.month;
		
		if(this.year < 1000)
			add_zero_year = "0" + this.year;
		else
			add_zero_year = add_zero_year + this.year;
		
	
		return "" +add_zero_day+ "/"+add_zero_month+ "/"+add_zero_year;
	}
	
	
	

}
