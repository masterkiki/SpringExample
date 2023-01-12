package com.pks.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.pks.spring.ex.mybatis.model.Review;

public interface ReviewDAO {
	
	
	// id가 3인 데이터 조회
	public Review selectReview(@Param("id")int id);

}
