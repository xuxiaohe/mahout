package demo.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import demo.pojo.NewGroupCourse;

public interface NewGroupCourseRepository extends MongoRepository<NewGroupCourse, String>{
	Page<NewGroupCourse> findByGroupAndDisPlayAndReview(String groupId,int disPlay,boolean review,Pageable pageable);
	
	//Page<NewGroupCourse> findByDisPlayAndReview(int disPlay,boolean review,Pageable pageable);
	NewGroupCourse findByGroupAndCourse(String groupId,String courseId);
	Page<NewGroupCourse> findByGroupInAndReview(List<Object> groupId,boolean review,Pageable pageable);
	Page<NewGroupCourse> findByCourseInAndReview(List<Object> courses,boolean review,Pageable pageable);
	Page<NewGroupCourse> findByCategoryIdAndReview(String categoryId,boolean review,Pageable pageable);
	int countByCategoryId(String categoryId);
	Page<NewGroupCourse> findByChildCategoryIdAndReview(String childCategoryId,boolean review,Pageable pageable);
	int countByChildCategoryId(String childCategoryId);
	int countByGroupAndDisPlay(String groupId,int disPlay);

	NewGroupCourse findOneByCourse(String courseId);

	List<NewGroupCourse> findByGroupAndReview(String groupId,boolean review);
	
	List<NewGroupCourse> findByGroup(String groupId);
	
	List<NewGroupCourse> findByCourse(String courseid);
	
	List<NewGroupCourse> findByChildCategoryIdAndReview(String childCategoryId,boolean review);

	List<NewGroupCourse> findByIdInAndReview(List<Object> ids,boolean review);

	Page<NewGroupCourse> findByIdInAndReview(List<Object> ids, boolean review,Pageable pageable);
	
	Page<NewGroupCourse> findByDisPlayAndReview(int disPlay,boolean review,Pageable pageable);
	
	List<NewGroupCourse> findByWhoImportAndReview(String userId,boolean review);
	
	Page<NewGroupCourse> findByCourseNotInAndReview(List<Object> courses,boolean review,Pageable pageable);

	List<NewGroupCourse> findByCourseAndDisPlayAndReview(String courseId,int disPlay,boolean review);

	Page<NewGroupCourse> findByChildCategoryIdAndIdNotIn(String category,
			List<Object> ids, Pageable pageable);

}
