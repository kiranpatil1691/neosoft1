package com.ims.supplierDaoImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ims.supplierDao.SupplierDao;
import com.ims.supplierbean.Supplier;

public class SupplierDaoImp implements SupplierDao{

		@Override
	public String insertSupplier(Supplier s) {
		System.out.println("insert dao method call");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/neosoft","root","root");
			PreparedStatement ps=conn.prepareStatement("insert into supplier values (?,?,?,?,?,?,?)");
			ps.setInt(1,s.getId());
			ps.setString(2, s.getFname());
			ps.setString(3, s.getLname());
			ps.setString(4, s.getEmail());
			ps.setString(5, s.getAddress());
			ps.setInt(6, s.getMobileNumber());
			ps.setInt(7, s.getOfficeNumber());
			ps.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "insert sucessfully";
		
	}

	@Override
	public String deletesupplier(Supplier s) {
		System.out.println("delete dao method call");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/neosoft","root","root");
			PreparedStatement ps=conn.prepareStatement("delete from supplier where id=?");
					ps.setInt(1, s.getId());
					int i= ps.executeUpdate();
					System.out.println("delete status "+i);
					conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "delete row successfully";	
		}

	@Override
	public Supplier updateSupplier(Supplier s) {
		System.out.println("update dao method call");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/neosoft","root","root");
			PreparedStatement ps=conn.prepareStatement("update supplier set fname=?,lname=?,email=?,address=?,mobileNumber=?,officeNumber=? where id=?");
			ps.setString(1,s.getFname());
			ps.setString(2, s.getLname());
			ps.setString(3,s.getEmail());
			ps.setString(4, s.getAddress());
			ps.setInt(5, s.getMobileNumber());
			ps.setInt(6, s.getOfficeNumber());
			ps.setInt(7, s.getId());
			int result = ps.executeUpdate();
			
			System.out.println(result);
			conn.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(s.getFname());
		System.out.println(s.getId());
		return s;
	}

	@Override
	public  List<Supplier> viewSupplier() {
		System.out.println("view dao method call");
		List<Supplier>supplierList=new ArrayList<Supplier>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/neosoft","root","root");
			PreparedStatement ps=conn.prepareStatement("select * from supplier");
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				Supplier supplier= new Supplier();
				supplier.setId(rs.getInt(1));
				supplier.setFname(rs.getString(2));
				supplier.setLname(rs.getString(3));
				supplier.setEmail(rs.getString(4));
				supplier.setAddress(rs.getString(5));
				supplier.setMobileNumber(rs.getInt(6));
				supplier.setOfficeNumber(rs.getInt(7));
				supplierList.add(supplier);
			}
			conn.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return supplierList;
	}
}
