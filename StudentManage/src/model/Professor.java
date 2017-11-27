/**
 * 
 */
package model;

/**
 * @author User
 * @description:
 * @time: 10:52:57 AM
 * @date: Nov 27, 2017
 */
public class Professor {
	String fullName, faculty, academicDegree;
	double allowance, monthlyTeachingTime, salaryMultiplier;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getAcademicDegree() {
		return academicDegree;
	}
	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double getMonthlyTeachingTime() {
		return monthlyTeachingTime;
	}
	public void setMonthlyTeachingTime(double monthlyTeachingTime) {
		this.monthlyTeachingTime = monthlyTeachingTime;
	}
	public double getSalaryMultiplier() {
		return salaryMultiplier;
	}
	public void setSalaryMultiplier(double salaryMultiplier) {
		this.salaryMultiplier = salaryMultiplier;
	}
	/**
	 * @param fullName
	 * @param faculty
	 * @param academicDegree
	 * @param allowance
	 * @param monthlyTeachingTime
	 * @param salaryMultiplier
	 */
	public Professor(String fullName, String faculty, String academicDegree,
			double allowance, double monthlyTeachingTime,
			double salaryMultiplier) {
		super();
		this.fullName = fullName;
		this.faculty = faculty;
		this.academicDegree = academicDegree;
		this.allowance = allowance;
		this.monthlyTeachingTime = monthlyTeachingTime;
		this.salaryMultiplier = salaryMultiplier;
	}
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
}
