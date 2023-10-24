package azy.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import azy.operation.PersonOp;
import azy.operation.UserOp;

@WebServlet("/getAllData")
public class GetAllDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonOp pop =new PersonOp();
		UserOp uop =new UserOp();
		List<azy.table.Person>list1= pop.getAllPerson();
		List<azy.table.User>list2= uop.getAllUser();
		request.setAttribute("personList",list1);
		request.setAttribute("userList",list2);
		request.getRequestDispatcher("/list.jsp").forward(request, response);
	}

}
