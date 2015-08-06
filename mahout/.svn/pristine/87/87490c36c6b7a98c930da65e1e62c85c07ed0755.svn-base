package demo.service;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;






import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.pojo.Drycargo;
import demo.pojo.MahoutOfType;
import demo.repo.DrycargoRepository;
import demo.repo.MahoutOfTypeRepository;


@Service
@Component
public class mahoutOftypeService {
	private static final Logger logger = Logger.getLogger(mahoutOftypeService.class);
	
	 
	
	@Autowired
	public MahoutOfTypeRepository mahoutOfTypeRepository;
	

	public mahoutOftypeService(){
		super();
	}
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public void save(MahoutOfType m) {
		 
		 mahoutOfTypeRepository.save(m);
		 
	}
	
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public void delete() {
		 
		 mahoutOfTypeRepository.deleteAll();
		 
	}
	 
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public MahoutOfType findone(String id) {
		 
		MahoutOfType m= mahoutOfTypeRepository.findOneBySourceid(id);
		 return m;
	}
	
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public long count() {
		 
		long m= mahoutOfTypeRepository.count();
		 return m;
	}
	
	
	
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public MahoutOfType findoneByindex(String index) {
		 
		MahoutOfType m= mahoutOfTypeRepository.findOneByIndex(index);
		 return m;
	}
	
	
		
}	

