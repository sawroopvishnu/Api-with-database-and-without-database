package com.RestApi3.App;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.RestApi3.App.entity.ApiEntity;

@Service
public class FakeServiceDB {

	private static List<ApiEntity> list= new ArrayList<>();
	
	static{
		list.add(new ApiEntity(1,"vishnu", "java developer"));
		list.add(new ApiEntity(2, "vishnu sawroop", "Api developer"));
		
		
	}
	
	public List<ApiEntity> getalldata(){
		return list;
	}
	
	public ApiEntity getbyid(int id){
		ApiEntity apiEntity = null;
		apiEntity=list.stream().filter(e -> e.getId() == id).findFirst().get();
		return apiEntity;
	}
}
