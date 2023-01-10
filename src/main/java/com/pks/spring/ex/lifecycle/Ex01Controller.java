package com.pks.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 컨트롤러라고 하는 어노테이션
@Controller
public class Ex01Controller {

	
	// 리스폰스 바디 어노테이션을 하면 아래 리턴되는 값을 리스폰스에 담아준다
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/1")
	public String stringResponse() {
		return "예제 1번 문자열을 담는 response";
	}
	
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	public Map<String, Integer> mapResponse(){
		// 과일이름 : 가격
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("apple", 1500);
		fruitMap.put("banana", 3000);
		fruitMap.put("orange", 1000);
		
		return fruitMap;
	}

}
