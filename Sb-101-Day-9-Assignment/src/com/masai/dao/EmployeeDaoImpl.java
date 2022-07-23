package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Employee;
import com.masai.exceptions.EmployeeException;
import com.masai.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	@Override
	public Employee getSalaryByEmployeeById(int empId) throws EmployeeException {

		Employee e = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select salary from employee where empId = ?");

			ps.setInt(1, empId);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				int s = rs.getInt("salary");

				System.out.println("salary is :" + s);
			} else
				throw new EmployeeException("Employee does not exist with this id" + empId);

		} catch (SQLException e2) {
			e2.printStackTrace();
			throw new EmployeeException(e2.getMessage());
		}

		return e;
	}

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {

		List<Employee> employees = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Employee");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int r = rs.getInt("empId");
				String n = rs.getNString("name");
				String a = rs.getString("address");
				int m = rs.getInt("salary");

				Employee employee = new Employee(r, n, a, m);
				employees.add(employee);
			}
			if (employees.size() <= 0)
				throw new EmployeeException("There is no any employee");

		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}

		return employees;

	}

	@Override
	public boolean provideBonus(int bonus) throws EmployeeException {
		boolean flag = false;
		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("ALTER TABLE employee ADD Bonus INT NOT NULL DEFAULT 500");

			boolean x = ps.execute();

			if (!x)
				flag = true;
			else
				flag = false;

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public String insertEmployeeDetails(Employee employee) {

		String msg = "Not saved";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");

			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());

			int x = ps.executeUpdate();

			if (x > 0)
				msg = "Saved succesfully";

		} catch (SQLException e) {
			msg = e.getMessage();
		}

		return msg;
	}

	@Override
	public Employee searchEmployeeById(int empId) throws EmployeeException {

		Employee e = null;
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from employee where empid=?");
			ps.setInt(1, empId);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int r = rs.getInt("empid");
				String n = rs.getString("name");
				String a = rs.getString("address");
				int m = rs.getInt("salary");

				e = new Employee(r, n, a, m);
			} else
				System.out.println("employee does not exit...");

		} catch (SQLException ee) {
			System.out.println(ee.getMessage());
		}

		return e;

	}

	@Override
	public List<Employee> getAllEmployeesBySalary(int salary) throws EmployeeException {
		List<Employee> employees = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Employee where salary < ?");
			ps.setInt(1, salary);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int r = rs.getInt("empId");
				String n = rs.getNString("name");
				String a = rs.getString("address");
				int m = rs.getInt("salary");

				Employee employee = new Employee(r, n, a, m);
				employees.add(employee);
			}
			if (employees.size() <= 0)
				throw new EmployeeException("There is no any employee");

		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}

		return employees;

	}

}
