package com.pks.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pks.spring.ex.database.dao.UsedGoodsDAO;
import com.pks.spring.ex.database.model.UsedGoods;



@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedgoodsDAO;
	
	// used_goods 테이블을 전체 데이터 조회기능
	public List<UsedGoods>  getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedgoodsDAO.selectUsedGoodsList();
		
		return usedGoodsList;
	}
	
}
