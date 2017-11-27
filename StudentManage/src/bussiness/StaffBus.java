/**
 * 
 */
package bussiness;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.StaffDAO;
import model.Professor;

/**
 * @author User
 * @description:
 * @time: 11:39:42 AM
 * @date: Nov 27, 2017
 */
public class StaffBus {
	public List<Professor> getAllProfessor() {
		List<Professor> professors = new ArrayList<Professor>();
		StaffDAO staffDAO = new StaffDAO();
		try {
			professors = staffDAO.getListProfessor("select * from Professor");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return professors;
	}
	public boolean insert(Professor professor) throws ClassNotFoundException, 
									SQLException {
		return new StaffDAO().insert(professor);
	}
}
