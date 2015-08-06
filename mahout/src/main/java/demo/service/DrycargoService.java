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
import demo.repo.DrycargoRepository;


@Service
@Component
public class DrycargoService {
	private static final Logger logger = Logger.getLogger(DrycargoService.class);
	
	 
	
	@Autowired
	public DrycargoRepository drycargoRepository;
	

	public DrycargoService(){
		super();
	}
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public List<Drycargo> all() {
		 
		List<Drycargo>  dryCargo = drycargoRepository.findAll();
		return dryCargo;
	}
	public Drycargo findByid(String id) {
		 
		Drycargo  dryCargo = drycargoRepository.findById(id);
		return dryCargo;
	}
	
	
	public List<Drycargo> findByDryFlag() {
		 
		List<Drycargo>  dryCargo = drycargoRepository.findByDryFlag(0);
		return dryCargo;
	}
	
		
}	

