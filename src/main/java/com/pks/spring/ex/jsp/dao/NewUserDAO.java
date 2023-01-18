package com.pks.spring.ex.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pks.spring.ex.jsp.model.NewUser;

@Repository
public interface NewUserDAO {
	
	public NewUser selectLastUser();

	public int insertUser(
			@Param("name") String name
			, @Param("birthday") String birthday
			, @Param("email") String email
			, @Param("introduce") String introduce
			);
	
	public int inserUserByObject(NewUser user);
	
}
