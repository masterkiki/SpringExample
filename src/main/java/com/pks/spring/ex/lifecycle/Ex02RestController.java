package com.pks.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pks.spring.ex.lifecycle.model.Person;

@RestController // @Controller 어노테이션과 같은 역할을 하는건데  컨트롤러에 추가로 + @ResponseBody  가 포함된것

@RequestMapping("/lifecycle/ex01") // 여기다 지정해주면 아래 리퀘스트 맵핑 주소엔 앞에 내용 안적어도 됨
public class Ex02RestController {
	
	@RequestMapping("/3")
	public String stringResponse() {
		return "안녕하세요 <br> RestController 입니다. <br><hr> @RestController 은 @Controller 어노테이션과 같은 역할을 하는건데  컨트롤러에 추가로 + @ResponseBody  가 포함된것입니다.";
	}
	
	
	// 직접만든 클래스의 객체 리턴
	@RequestMapping("/4")
	public Person objectResponse() {
		Person person = new Person();
		person.setName("김인규");
		person.setAge(28);
		
		return person;
	}
	
	// status code를 포함한 response
	@RequestMapping("/5")
	public ResponseEntity<Person> entinyResponse(){
		Person person = new Person();
		person.setName("김인규");
		person.setAge(28);
		
		// http status code
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
}
