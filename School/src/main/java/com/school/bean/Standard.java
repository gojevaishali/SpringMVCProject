package com.school.bean;

import javax.validation.constraints.NotBlank;

public class Standard {
	@NotBlank(message = "Name is required")
	private String name;
	private Integer count;
	private String faculty;

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Standard [name=" + name + ", count=" + count + ", faculty=" + faculty + "]";
	}

}
