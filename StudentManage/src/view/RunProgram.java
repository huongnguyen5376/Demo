package view;

import java.sql.SQLException;
import java.util.List;
import bussiness.StaffBus;
import model.Professor;

/**
 * @author User
 * @description:
 * @time: 11:41:20 AM
 * @date: Nov 27, 2017
 */
public class RunProgram {

	/**
	 * @author User
	 * @description:
	 * @time: 11:41:20 AM
	 * @date: Nov 27, 2017
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException, 
										SQLException {
		List<Professor> professors = new StaffBus().getAllProfessor();
		System.out.println("\tDanh sách các Professor");
		for (Professor professor : professors) {
			System.out.print(professor.getFullName() + "\t\t");
			System.out.print(professor.getFaculty() + "\t\t");
			System.out.print(professor.getAcademicDegree() + "\t\t");
			System.out.print(professor.getAllowance() + "\t\t");
			System.out.print(professor.getMonthlyTeachingTime() + "\t\t");
			System.out.println(professor.getSalaryMultiplier());
		}
	}
}
