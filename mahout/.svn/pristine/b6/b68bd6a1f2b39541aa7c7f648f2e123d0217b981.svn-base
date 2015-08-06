package demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.GeospatialIndex;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import demo.pojo.Drycargo;
import demo.pojo.Topic;
import demo.repo.TopicRepository;


@Service
@Component
public class TopicService {
	private static final Logger logger = Logger.getLogger(TopicService.class);
	@Autowired
	private TopicRepository topicRepository;
	

	public TopicService() {

	}
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public List<Topic> all() {
		 
		List<Topic>  dryCargo = topicRepository.findAll();
		return dryCargo;
	}
	
	public Topic findByid(String id) {
		 
		Topic  dryCargo = topicRepository.findByTopicId(id);
		return dryCargo;
	}


}
