package com.pks.spring.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pks.spring.ex.mybatis.dao.ReviewDAO;
import com.pks.spring.ex.mybatis.model.Review;

@Service
public class ReviewBO {
	
	// id가 3인 데이터 조회
	@Autowired
	private ReviewDAO reviewDAO;
	
	public Review getReview() {
		Review review = reviewDAO.selectReview();
		return review;
	}
	
}
