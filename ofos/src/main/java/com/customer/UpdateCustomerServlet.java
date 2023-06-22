package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id  = request.getParameter("cusid");
		String name  = request.getParameter("name");
		String address  = request.getParameter("address");
		String phone  = request.getParameter("phone");
		String username  = request.getParameter("username");
		String password  = request.getParameter("password");
	
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.updateCustomer(id, name, address, phone, username, password);
		
		if (isTrue == true)
		{
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			RequestDispatcher dis1 = request.getRequestDispatcher("userprofile.jsp");
			dis1.forward(request, response);
		}
		else
		{
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
