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
import demo.pojo.MahoutOfCourse;
import demo.pojo.MahoutOfType;
import demo.repo.DrycargoRepository;
import demo.repo.MahoutOfCourseRepository;
import demo.repo.MahoutOfTypeRepository;


@Service
@Component
public class mahoutOfCourseService {
	private static final Logger logger = Logger.getLogger(mahoutOfCourseService.class);
	
	 
	
	@Autowired
	public MahoutOfCourseRepository mahoutOfCourseRepository;
	

	public mahoutOfCourseService(){
		super();
	}
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public void save(MahoutOfCourse m) {
		 
		mahoutOfCourseRepository.save(m);
		 
	}
	
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public void delete() {
		 
		mahoutOfCourseRepository.deleteAll();
		 
	}
	 
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public MahoutOfCourse findone(String id) {
		 
		MahoutOfCourse m= mahoutOfCourseRepository.findOneBySourceid(id);
		 return m;
	}
	
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public long count() {
		 
		long m= mahoutOfCourseRepository.count();
		 return m;
	}
	
	
	
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public MahoutOfCourse findoneByindex(String index) {
		 
		MahoutOfCourse m= mahoutOfCourseRepository.findOneByIndex(index);
		 return m;
	}
	
	
		
}	

