package demo.service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;








import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.index.GeospatialIndex;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;








import com.mongodb.Mongo;
import com.mongodb.MongoException;

import demo.pojo.IndexOfGroup;
import demo.pojo.MahoutOfGroup;
import demo.pojo.XueWenGroup;
import demo.repo.GroupRepository;
import demo.repo.IndexOfGroupRepository;
import demo.repo.MahoutOfGroupRepository;

@Service
@Component
@Configuration
/**
 * 群组service层，用于接受controller传递的参数
 * 与repo进行数据库操作
 * @author nes
 *
 */
public class GroupService {
	private static final Logger logger = Logger.getLogger(GroupService.class);
	@Autowired
	private GroupRepository groupRepo;
	@Autowired
	private MahoutOfGroupRepository mahoutOfGroupRepository;
	@Autowired
	private IndexOfGroupRepository indexOfGroupRepository;

	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public List<XueWenGroup> findGroup()throws  Exception {
		List<XueWenGroup> one = groupRepo.findAll();
		return one;

	}
	
	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public List<MahoutOfGroup> findByMahoutGroup(String usernumber)throws  Exception {
		List<MahoutOfGroup> one = mahoutOfGroupRepository.findByUsernumber(usernumber);
		return one;

	}
	
	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public MahoutOfGroup save(MahoutOfGroup m)throws  Exception {
		return mahoutOfGroupRepository.save(m);

	}
	
	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
//	public void findBygroupNumber(String groupnumber)throws  Exception {
//		groupRepo.findByAdmin(userId)
//
//	}

	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public long count()throws  Exception {
		return indexOfGroupRepository.count();

	}
	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public IndexOfGroup findbyindex(String index)throws  Exception {
		return indexOfGroupRepository.findByIndex(index);

	}
	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public XueWenGroup findbyid(String id)throws  Exception {
		return groupRepo.findOne(id);

	}
	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public XueWenGroup findbygroupnumber(String number)throws  Exception {
		return groupRepo.findByGroupNumber(Long.parseLong(number));

	}
	
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public void saveindexofgroup(IndexOfGroup i)throws  Exception {
		 indexOfGroupRepository.save(i);

	}
	/**
	 * 根据群组ID 获得群组信息
	 * 
	 * @return
	 */
	public void delete()throws  Exception {
		 indexOfGroupRepository.deleteAll();

	}
	
	public void delete2()throws  Exception {
		mahoutOfGroupRepository.deleteAll();

	}
	
	
}
