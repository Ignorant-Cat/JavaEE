package azy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import azy.operation.PersonOp;
import azy.table.Person;

@WebServlet("/delPerson")
public class DelPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		PersonOp pop = new PersonOp();
		if(pop.selPersonByName(username,null)) {//查询，有的话删除
			int result=pop.delPerson(username);
			if(result!=0) {
				request.setAttribute("result", "Person表删除成功！");
			}else {
				request.setAttribute("result", "Person表删除失败！");
			}
		}else {//没有
			request.setAttribute("result", "没有该条数据，删除失败！");
		}
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
