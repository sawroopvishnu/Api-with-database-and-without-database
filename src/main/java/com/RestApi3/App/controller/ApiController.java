package com.RestApi3.App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi3.App.FakeServiceDB;
import com.RestApi3.App.entity.ApiEntity;

@RestController
public class ApiController {

//	@RequestMapping(value = "/getdata", method = RequestMethod.GET) // this handler method work using controller annotation
//	@ResponseBody
//	public ApiEntity home() {
//		
//		ApiEntity ap= new ApiEntity();
//		ap.setId(12);
//		ap.setName("vishnu");
//		ap.setAbout("hiiii how are you");
//		return ap;
//	}

	
//	 @GetMapping("/getdata") // this handler method work using rest controller annotation
//	 
//	 public ApiEntity getdata() {
//	  
//	 ApiEntity api = new ApiEntity();
//	 api.setId(123);
//	 api.setName("vishnu sawroop"); api.setAbout("i am java developer");
//	 
//	 api.setId(1234); int i=api.getId();
//	 System.out.println(i); String
//	 str=api.getAbout(); System.out.println(str); return api;
//	 }

	@Autowired
	private FakeServiceDB fsdb;
	
	// get all data from service class
	@GetMapping("/getalldata")
	public List<ApiEntity> getall(){
		return fsdb.getalldata();
	}
	
	@GetMapping("/get/{id}")
	public ApiEntity delbyid(@PathVariable (" id") int id){
		return  fsdb.getbyid(id);
	}
}
