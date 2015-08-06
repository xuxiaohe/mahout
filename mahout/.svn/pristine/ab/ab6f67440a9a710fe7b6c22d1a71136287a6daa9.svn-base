package demo.repo;



import java.util.List;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.NewCourse;

public interface NewCourseRepository extends  MongoRepository<NewCourse,String> {
		List<NewCourse> findBySourceId(String sourceId);
		
		Page<NewCourse> findByChecked(boolean checked,Pageable pageable);
		
		List<NewCourse> findByChaptersInAndChecked(String id,boolean checked);
		NewCourse findById(String id);
		Page<NewCourse> findByTitleRegexAndCheckedOrIntroRegexAndChecked(String keywords,boolean checked,String keywords2 ,boolean checked1,Pageable pageable);

		//List<NewCourse> findByIdIn(List<Object> courseIds);
		List<NewCourse> findByIdInAndChecked(List<String> courseIds,boolean checked);
		
		@Query("{'shareCount':{$gt:?0},'$or':[{'title':{'$regex':?1,$options:'i'}},{'tagNames':{'$regex':?1,$options:'i'}},{'intro':{'$regex':?1,$options:'i'}}]}")
		Page<NewCourse> findByShareCountGreaterThanAndTitleLikeAndCheckedOrIntroLikeAndCheckedOrTagNamesLikeAndChecked(int i,String keyWords,boolean checked,Pageable pageable);

		Page<NewCourse> findByIdInAndChecked(List<Object> courseIds,boolean checked,Pageable pageable);

		Page<NewCourse> findByIdNotInAndChecked(String courseId,boolean checked, Pageable pageable);
		
		Page<NewCourse> findByIdNotInAndChecked(List<Object> courseIds,boolean checked, Pageable pageable);
		
		@Query(fields = "{'title' : 1 }")
		List<NewCourse> findListByTitleRegexAndCheckedOrIntroRegexAndChecked(String keywords,boolean checked,String keywords2,boolean checked1);

		Page<NewCourse> findByShareCountGreaterThanAndChecked(int i,boolean checked, Pageable pageable);
		
		Page<NewCourse> findByCheckedAndCategoryId(boolean checked,String categoryId, Pageable pageable);
		
		List<NewCourse> findByCreateUser(String uid);
		Page<NewCourse> findByCreateUser(String createUser,Pageable pageable);
		
		Page<NewCourse> findByCheckedAndCategoryIdAndIdNotIn(boolean checked,String categoryId,List<Object> ids, Pageable pageable);
		
		int countByCheckedAndCategoryId(boolean checked,String categoryId);
		
		Page<NewCourse> findByCheckedAndChildCategoryId(boolean checked,String childCategoryId, Pageable pageable);
		
		Page<NewCourse> findByCheckedAndChildCategoryIdAndIdNotIn(boolean checked,String childCategoryId, List<Object> ids,Pageable pageable);
		
		int countByCheckedAndChildCategoryId(boolean checked,String childCategoryId);

		NewCourse findOneByChaptersIn(String id);
		
		Page<NewCourse> findByCheckedAndIdIn(boolean checked,List<Object> l, Pageable pageable);
		
		List<NewCourse> findByTitleRegexAndCheckedAndIdNotInOrIntroRegexAndCheckedAndIdNotIn(String keywords,boolean checked,List<Object> l,String keywords1,boolean checked1,List<Object> l1);
		
		@Query("{'checked':?0,'$or':[{'title':{$regex:?1,'$options':'i'}},{'tagNames':{$regex:?1,$options:'i'}},{'intro':{$regex:?1,$options:'i'}}],'_id':{$in:?2}}")
		Page<NewCourse> search(boolean b, String keyWords,List<Object> ids,Pageable pageable);
		
		@Query("{'$or':[{'title':{$regex:?0,'$options':'i'}},{'tagNames':{$regex:?0,$options:'i'}},{'intro':{$regex:?0,$options:'i'}}],'_id':{$in:?1}}")
		Page<NewCourse> searchAll(String keyWords,List<Object> ids,Pageable pageable);
		
		int countByCheckedAndChildCategoryIdAndIdNotIn(boolean b,String childCategoryId, List<Object> groupCourseIds);
}
