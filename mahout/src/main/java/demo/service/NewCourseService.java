 package demo.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.pojo.NewCourse;
import demo.repo.NewCourseRepository;


/**
 * 
 * @ClassName: CourseService
 * @Description: 课时Service
 * @author JackTang
 * @date 2014年12月19日 上午9:05:02
 *
 */
@Component
@EnableScheduling
@Service
public class NewCourseService {
	
	
	@Autowired
	private NewCourseRepository courseRepository;
	

	/**
	 * 
	 * @Title: save
	 * @Description:插入一个课程
	 * @param course
	 *            void
	 * @throws
	 */
	public List<NewCourse> findall() {
		return courseRepository.findAll();
	}
	
	public NewCourse findByid(String id) {
		return courseRepository.findById(id);
	}


}
