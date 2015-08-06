package demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.pojo.Fav;
import demo.pojo.Praise;
import demo.repo.PraiseRepository;


@Service
@Component
public class PraiseService {

	@Autowired
	private PraiseRepository praiseRepository;

	public PraiseService() {

	}
	
	public List<Praise> findBytypes(List<Object> types) {
		 
		List<Praise>  Praise = praiseRepository.findByTypeIn(types);
		return Praise;
	}
	
	public boolean findByuseridandsourceid(String uid,String sid) {
		boolean t;
		Praise fav = praiseRepository.findOneByUserIdAndSourceId(uid,sid);
		if(fav!=null){
			t=true;
		}
		else {
			t=false;
			
		}
		return t;
	}
	
}
