package azy.operation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import azy.table.Person;
import azy.util.BaseOp;
import azy.util.Connutil;

public class PersonOp extends BaseOp{
	public int insPerson(Person p) {
		String sql = "insert into person(username,name,age,teleno) values(?, ?, ?, ?)";
		int result = setData(sql, p.getUsername(), p.getName(), p.getAge(), p.getTeleno());
		return result;
	}

	public int delPerson(String username) {
		String sql = "delete from person where username like ?";
		int result = setData(sql, username);
		return result;
	}
	
	public int updPerson(Person p) {
		String sql = "update person set username=?,age=?,teleno=? where name=?";
		int result = setData(sql, p.getUsername(), p.getAge(), p.getTeleno(), p.getName());
		return result;
	}

	public List<Person> getAllPerson() {
		String sql ="select * from person";
		ResultSet rs = getData(sql);
		List<Person> list = new ArrayList<Person>();	
		try {
			while(rs.next()) {
				Person p =new Person();
				p.setUsername(rs.getString(1));
				p.setName(rs.getString(2));
				p.setAge(rs.getInt(3));
				p.setTeleno(rs.getString(4));
				list.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public boolean selPersonByName(String username,String name) {
		ResultSet rs = null;
		if(name!=null) {
			String sql ="select * from person where username=? and name=?";
			rs=getData(sql,username,name);
		}else {
			String sql ="select * from person where username=?";
			rs=getData(sql,username);
		}
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
