package demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.pojo.NewGroupCourse;
import demo.repo.NewGroupCourseRepository;

/**
 * 按照最新群组课程业务需求，重写的groupCourseService
 * @author hjn
 * 
 *
 */
@Service
@Component
public class NewGroupCourseService {
	private static final Logger logger=Logger.getLogger(NewGroupCourseService.class);
	@Autowired
	private NewGroupCourseRepository newGroupCourseRepository;

	
	
	/**
	 * 获得分享数最高的课程
	 * @param pageable
	 * @return
	 * @throws XueWenServiceException
	 */
	public NewGroupCourse findGroupCourse(String id)throws Exception{
		return newGroupCourseRepository.findOne(id);
	}
	/**
	 * 获得分享数最高的课程
	 * @param pageable
	 * @return
	 * @throws XueWenServiceException
	 */
	public List<NewGroupCourse> findAllGroupCourse()throws Exception{
		return newGroupCourseRepository.findAll();
	}
	
	
}
