package com.pks.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pks.spring.ex.mybatis.bo.ReviewBO;
import com.pks.spring.ex.mybatis.model.Review;

@Controller
public class ReviewController {
	
	// id가 3인 데이터 조회
	
	@Autowired
	private ReviewBO reviewBO;
	
	@ResponseBody
	@RequestMapping("/mybatis/ex01")
	public Review review() {
		
		Review review = reviewBO.getReview();
		
		return review;
	}
	
}
