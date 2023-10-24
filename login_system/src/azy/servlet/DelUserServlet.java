package azy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import azy.operation.PersonOp;
import azy.operation.UserOp;

@WebServlet("/delUser")
public class DelUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		UserOp uop = new UserOp();
		PersonOp pop = new PersonOp();
		if(uop.selUserByName(username)) {//查询，有的话删除
			if(pop.selPersonByName(username, null)) {//删除User前要删除Person
				pop.delPerson(username);
			}
			int result=uop.delUser(username);
			if(result!=0) {
				request.setAttribute("result", "User表删除成功！");
			}else {
				request.setAttribute("result", "User表删除失败！");
			}
		}else {//没有
			request.setAttribute("result", "没有该条数据，删除失败！");
		}
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
