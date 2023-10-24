package azy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import azy.operation.UserOp;
import azy.table.User;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		UserOp uop = new UserOp();
		if (uop.selUserByName(username)) {// 查询，存在就更新
			if (uop.updUser(new User(username, pass)) != 0)
				request.setAttribute("result", "该数据已存在，插入失败！");
		} else {// 没有再插入
			if (uop.insUser(new User(username, pass)) != 0) {
				request.setAttribute("result", "User插入成功！");
			} else {
				request.setAttribute("result", "User插入失败！");
			}
		}
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
