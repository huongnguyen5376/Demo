/**
 * 
 */
package model;

/**
 * @author User
 * @description:
 * @time: 10:55:37 AM
 * @date: Nov 27, 2017
 */
public class Officer {
	String fullName, department, workingTime, position;
	double allowance, salaryMultiplier;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getWorkingTime() {
		return workingTime;
	}
	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double getSalaryMultiplier() {
		return salaryMultiplier;
	}
	public void setSalaryMultiplier(double salaryMultiplier) {
		this.salaryMultiplier = salaryMultiplier;
	}
	/**
	 * @param fullName
	 * @param department
	 * @param workingTime
	 * @param position
	 * @param allowance
	 * @param salaryMultiplier
	 */
	public Officer(String fullName, String department, String workingTime,
			String position, double allowance, double salaryMultiplier) {
		super();
		this.fullName = fullName;
		this.department = department;
		this.workingTime = workingTime;
		this.position = position;
		this.allowance = allowance;
		this.salaryMultiplier = salaryMultiplier;
	}
}
