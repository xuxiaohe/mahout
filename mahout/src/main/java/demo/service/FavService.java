package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.pojo.Drycargo;
import demo.pojo.Fav;
import demo.repo.FavRepository;


@Service
@Component
public class FavService {

	@Autowired
	private FavRepository favRepository;

	public FavService() {

	}
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public List<Fav> findBytype(String type) {
		 
		List<Fav>  fav = favRepository.findByFavType(type);
		return fav;
	}
	
	
	public List<Fav> findBytypes(List<Object> types) {
		 
		List<Fav>  fav = favRepository.findByFavTypeIn(types);
		return fav;
	}
	
	
	public boolean findByuseridandsourceid(String uid,String sid) {
		boolean t;
		Fav  fav = favRepository.findByUserIdAndSourceId(uid,sid);
		if(fav!=null){
			t=true;
		}
		else {
			t=false;
			
		}
		return t;
	}
	
}
