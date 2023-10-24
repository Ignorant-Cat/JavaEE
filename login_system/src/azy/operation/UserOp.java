package azy.operation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import azy.table.User;
import azy.table.User;
import azy.util.BaseOp;
import azy.util.Connutil;

public class UserOp extends BaseOp{

	public int insUser(User u){
		String sql = "insert into users(username,pass) values(?, ?)";
        int result=setData(sql,u.getUsername(),u.getPass());
        return result;
	}
	
	public int delUser(String username){
		String sql = "delete from users where username like ?";
        int result=setData(sql,username);
        return result;
	}
	

	public int updUser(User u){
		String sql = "update users set pass=? where username=?";
		int result=setData(sql,u.getPass(),u.getUsername());
		return result;
	}
	

	public List<User> getAllUser() {
		String sql ="select * from users";
		ResultSet rs = getData(sql);
		List<User> list = new ArrayList<User>();	
		try {
			while(rs.next()) {
				User p =new User();
				p.setUsername(rs.getString(1));
				p.setPass(rs.getString(2));
				list.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public boolean selUserByName(String username) {
		String sql ="select * from users where username=?";
		ResultSet rs = getData(sql,username);
		try {
			while(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
