package com.subhasishMishra;

public class Employee {
	
	private String name;
	private String job;
	private String[] skills;
	
	
	public Employee(String name, String job, String[] skills) {
		this.name=name;
		this.job=job;
		this.skills= skills;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	

}
