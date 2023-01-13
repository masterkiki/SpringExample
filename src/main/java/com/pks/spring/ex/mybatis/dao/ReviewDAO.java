package com.pks.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.pks.spring.ex.mybatis.model.Review;

public interface ReviewDAO {
	
	
	// id가 3인 데이터 조회
	public Review selectReview(@Param("id")int id);
	
	public int insertReview(   // 인서트는 인서트된 행의 갯수가 리턴 될꺼라 인트
			@Param("storeId")int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review
			);
	
	
	public int insertReviewByObject(Review review);
}
