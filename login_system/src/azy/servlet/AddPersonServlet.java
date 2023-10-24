package azy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import azy.operation.PersonOp;
import azy.operation.UserOp;
import azy.table.Person;
import azy.table.User;

@WebServlet("/addPerson")
public class AddPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		int age = 0;
		if(request.getParameter("age")!="")
			age = Integer.parseInt(request.getParameter("age"));
		String teleno = request.getParameter("teleno");
		PersonOp pop = new PersonOp();
		UserOp uop = new UserOp();

		if (pop.selPersonByName(username, name)) {// 查询,存在就更新
			if (pop.updPerson(new Person(username, name, age, teleno)) != 0)
				request.setAttribute("result", "该数据已存在，更新成功！");
		} else {// 没有
			if (!uop.selUserByName(username)) {// 查一下User，User里面没有就插入
				uop.insUser(new User(username, "888888"));
			}
			//然后再插入Person
			int result = pop.insPerson(new Person(username, name, age, teleno));
			if (result != 0) {
				request.setAttribute("result", "Person表插入成功！");
			} else {
				request.setAttribute("result", "Person表插入失败！");
			}
		}
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}
}
