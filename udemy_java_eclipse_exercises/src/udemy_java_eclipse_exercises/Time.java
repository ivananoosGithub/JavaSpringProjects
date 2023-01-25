package udemy_java_eclipse_exercises;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hr, int min, int sec) {
		this.hour = hr;
		this.minute = min;
		this.second = sec;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setHour(int hr) {
		this.hour = hr;
	}
	
	public void setMinute(int min) {
		this.minute = min;
	}
	
	public void setSecond(int sec) {
		this.second = sec;
	}
	
	public void setTime(int hr, int min, int sec) {
		this.hour = hr;
		this.minute = min;
		this.second = sec;
	}
	
	public String toString() {
		
		String add_zero_hour = "";
		String add_zero_min = "";
		String add_zero_sec = "";
		
		if (this.hour<10)
			add_zero_hour = "0" + this.hour;
		else
			add_zero_hour = add_zero_hour + this.hour;
		
		if(this.minute < 10)
			add_zero_min = "0" + this.minute;
		else
			add_zero_min = add_zero_min + this.minute;
		
		if(this.second < 10)
			add_zero_sec = "0" + this.second;
		else
			add_zero_sec = add_zero_sec + this.second;

		return "" +add_zero_hour+ ":"+add_zero_min+ ":"+add_zero_sec;
	}
	
	public Time nextSecond() {
		
		this.second++;
		
		if(this.second==60) {
			this.minute++;
			this.second = 0;
		}
		
		if(this.minute==60) {
			this.hour++;
			this.minute = 0;
		}
		
		if(this.hour==24) {
			this.hour = 0;
		}
		
		return this;
		
	}
	
	public Time previousSecond() {
		
		this.second--;
		
		if(this.second==0) {
			this.second = 0;
			this.minute = 0;
			this.hour = 0;
		}
		
		if(this.second < 0) {
			this.hour = 23;
			this.minute = 59;
			this.second = 59;
		}
		
		return this;
		
	}

}
