package com.ims.suppliercontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ims.supplierDao.SupplierDao;
import com.ims.supplierDaoImplementation.SupplierDaoImp;
import com.ims.supplierbean.Supplier;

public class SupplierController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		SupplierDaoImp supplierDao=new SupplierDaoImp();
		String action=req.getParameter("action");
		
		System.out.println("doGet action "+ action);
	
		
		//view supplier
		if(action != null && action.equals("view"))
		{
			List<Supplier> sList=supplierDao.viewSupplier();
			HttpSession hs=req.getSession();
			hs.setAttribute("viewSupplier",sList);
			req.getRequestDispatcher("supplierMain.jsp").forward(req, resp);
		}
		
		
		//update supplier
		if(action!=null && action.equals("update"))
		{
		Supplier s =new Supplier();
		
		String i=req.getParameter("id");
		int id=Integer.parseInt(i);
		s.setId(id);
		String ufname=req.getParameter("fname");
			s.setFname(ufname);
		String ulname=req.getParameter("lname");
			s.setLname(ulname);
		String uemail=req.getParameter("email");
			s.setEmail(uemail);
		String uaddress=req.getParameter("address");
			s.setAddress(uaddress);
		String uMobil=req.getParameter("mobileNumber");
			int mobileNumber=Integer.parseInt(uMobil);
			s.setMobileNumber(mobileNumber);
			String uoffic=req.getParameter("officeNumber");
			int officeNumber=Integer.parseInt(uoffic);
			s.setOfficeNumber(officeNumber);
			
			Supplier umsg=supplierDao.updateSupplier(s);
			HttpSession hs=req.getSession();
			hs.setAttribute("updateMessage", umsg);
			req.getRequestDispatcher("supplierUpdate.jsp").forward(req, resp);
			}
		
		
		//updated supplier
		if(action.equals("updateView"))
		{
			Supplier s =new Supplier();
			
			String i=req.getParameter("id");
			int id=Integer.parseInt(i);
			s.setId(id);
			String ufname=req.getParameter("fname");
				s.setFname(ufname);
			String ulname=req.getParameter("lname");
				s.setLname(ulname);
			String uemail=req.getParameter("email");
				s.setEmail(uemail);
			String uaddress=req.getParameter("address");
				s.setAddress(uaddress);
			String uMobil=req.getParameter("mobileNumber");
				int mobileNumber=Integer.parseInt(uMobil);
				s.setMobileNumber(mobileNumber);
				String uoffic=req.getParameter("officeNumber");
				int officeNumber=Integer.parseInt(uoffic);
				s.setOfficeNumber(officeNumber);
				Supplier umsg=supplierDao.updateSupplier(s);
		List<Supplier> sList=supplierDao.viewSupplier();
			HttpSession hs=req.getSession();
			hs.setAttribute("viewSupplier",sList);
			resp.sendRedirect("supplierMain.jsp");
		}
		
		//delete supplier
		if(action.equals("delete"))
		{
			Supplier s=new Supplier();
			String i=req.getParameter("id");
			int id=Integer.parseInt(i);
			s.setId(id);
			String dM=supplierDao.deletesupplier(s);
			List<Supplier> sList=supplierDao.viewSupplier();
			HttpSession hs=req.getSession();
			hs.setAttribute("viewSupplier",sList);
			resp.sendRedirect("supplierMain.jsp");
			
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		Supplier s=new Supplier();
		SupplierDaoImp supplierDao=new SupplierDaoImp();
		HttpSession hs=req.getSession();
		
		String action=req.getParameter("action");
		System.out.println(action);
		// insert data
		 if(action.equals("insert")){
			String i=req.getParameter("id");
			int id=Integer.parseInt(i);
			s.setId(id);
			String fname=req.getParameter("fname");
			s.setFname(fname);
			String lname=req.getParameter("lname");
			s.setLname(lname);
			String email=req.getParameter("email");
			s.setEmail(email);
			String address=req.getParameter("address");
			s.setAddress(address);
			
			String m=req.getParameter("mobile");
			int mobile=Integer.parseInt(m);
			s.setMobileNumber(mobile);
			
			String o=req.getParameter("office");
			int office=Integer.parseInt(o);
			s.setOfficeNumber(office);
			
			String msg=  supplierDao.insertSupplier(s);
			List<Supplier> sList=supplierDao.viewSupplier();
			HttpSession h=req.getSession();
			h.setAttribute("viewSupplier",sList);
			resp.sendRedirect("supplierMain.jsp");
			}
	
		
	}
	

}
