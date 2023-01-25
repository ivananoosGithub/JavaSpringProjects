package com.ivankimanoos.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ivankimanoos.springdemo.mvc.validation.CourseCode;

public class Student {
	
	private String firstName;
	
	@CourseCode(value="KIMOY", message="Must Start with KIMOY")
	private String courseCode;
	
	@NotNull(message="is required hahah!")
	@Size(min=5, message="to short idiot!")
	private String lastName;
	
	@NotNull(message="is required hahah!")
	@Min(value=1, message="must be greater than or equal to 1.0")
	@Max(value=5, message="must be less than or equal to 5.0")
	private Float grade;
	
	@NotNull(message="is required again!")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 char/digits")
	private String postalCode;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLang;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String[] operatingSys;
	

	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("PH", "Philippines");
		countryOptions.put("US", "United States");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		
        // populate favorite language options
//        favoriteLanguageOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        //
//        favoriteLanguageOptions.put("Java", "Java");
//        favoriteLanguageOptions.put("C#", "C#");
//        favoriteLanguageOptions.put("PHP", "PHP");
//        favoriteLanguageOptions.put("Ruby", "Ruby"); 
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLang() {
		return favoriteLang;
	}

	public void setFavoriteLang(String favoriteLang) {
		this.favoriteLang = favoriteLang;
	}
	
	
    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }
    
    public String[] getOperatingSys() {
    	
    	return this.operatingSys;
    }
    
    public void setOperatingSys(String[] operatingSys) {
    	
    	this.operatingSys = operatingSys;
    }
	
    public Float getGrade() {
    	return this.grade;
    }
	
	public void setGrade(Float grade) {
		this.grade = grade;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	
	
}
