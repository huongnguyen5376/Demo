/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Professor;
import sqlserver.ConnectDB;

/**
 * @author User
 * @description:
 * @time: 11:08:38 AM
 * @date: Nov 27, 2017
 */
public class StaffDAO {
	public boolean insert(Professor professor) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectDB.connectToDB();
		String sql = "insert into Professor values (?, ?, ?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		connection.setAutoCommit(false);
		statement.setString(1, professor.getFullName());
		statement.setString(2, professor.getFaculty());
		statement.setString(3, professor.getAcademicDegree());
		statement.setDouble(4, professor.getAllowance());
		statement.setDouble(5, professor.getMonthlyTeachingTime());
		statement.setDouble(6, professor.getSalaryMultiplier());
		connection.setAutoCommit(true);
		try {
			statement.executeUpdate();
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			connection.close();
		}
		return true;
	}
	
	public List<Professor> getListProfessor(String sql) throws SQLException {
		Connection connection;
		try {
			connection = ConnectDB.connectToDB();
			List<Professor> professors = new ArrayList<Professor>();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				Professor professor = new Professor();
				professor.setFullName(resultSet.getString("fullName"));
				professor.setFaculty(resultSet.getString("faculty"));
				professor.setAcademicDegree(resultSet.getString("academicDegree"));
				professor.setAllowance(resultSet.getDouble("allowance"));
				professor.setMonthlyTeachingTime(resultSet.getDouble("monthlyTeachingTime"));
				professor.setSalaryMultiplier(resultSet.getDouble("salaryMultiplier"));
				professors.add(professor);
			}
			connection.close();
			return professors;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
