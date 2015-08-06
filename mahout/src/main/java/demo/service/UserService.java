package demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.GeospatialIndex;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.pojo.User;
import demo.repo.UserRepository;


@Service
@Component
@EnableScheduling
/**
 * 用户service层，用于接受controller传递的参数
 * 与repo进行数据库操作
 * @author nes
 *
 */
public class UserService {

	@Autowired
	public UserRepository userRepo;
	

	@Autowired
	MongoTemplate template;

	/**
	 * 
	 * @Title: findByIdIn
	 * @Description: 根据ids找用户list
	 * @param userIds
	 * @return List<User>
	 * @throws
	 */
	public List<User> findAll() {
		return userRepo.findAll();
	}

	public User findById(String id) {
		return userRepo.findOne(id);
	}
	
	public User findBynumber(String number) {
		return userRepo.findByuserNumber(Long.parseLong(number));
	}

}
