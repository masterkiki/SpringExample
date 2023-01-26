package com.pks.spring.ex.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pks.spring.ex.ajax.dao.UserDAO;
import com.pks.spring.ex.jsp.model.NewUser;

@Service
public class UserBO {
	
	
	@Autowired
	private UserDAO userDAO;
	
	
	public List<NewUser> getUserList(){
		return userDAO.selectUserList();
	}
	
	
	public int addUser(
			String name
			, String yyyyymmdd
			, String email
			) {
		return userDAO.insertUser(name, yyyyymmdd, email);
	}
	
	
}