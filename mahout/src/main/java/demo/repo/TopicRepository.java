package demo.repo;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.Topic;

public interface TopicRepository extends MongoRepository<Topic, String>{
	//通过主题的Ids查找所有主题
	List<Topic> findByTopicIdIn(List<Object> topicIds);
	//查询所有话题
	Page<Topic> findAll(Pageable pageable);
	//通过群Id查询该群下的话题
//	Page<Topic> findBySourceIdAndIsDeleted(String sourceId,boolean isDeleted,Pageable pageable);
	//通过课程ID查询该课程下得话题
	Page<Topic> findByCourseIdAndIsDeletedAndReview(String courseId,boolean isDeleted,boolean review,Pageable pageable);
	//通过课程ID查询该课程下得话题
	Page<Topic> findByCourseIdAndIsDeleted(String courseId,boolean isDeleted,Pageable pageable);
	//通过主题ID查询主题详情
	Topic findByTopicIdAndIsDeleted(String topicId,boolean isDeleted);
	//通过主题ID查询主题详情
	//Page<Topic>	 findByChildCategoryIdAndIsDeleted(String topicId,boolean isDeleted);
	List<Topic>	 findByChildCategoryIdAndIsDeleted(String topicId,boolean isDeleted);
	//通过群组ID查询话题数量
	int countBySourceIdAndIsDeleted(String sourceId,boolean isDeleted);
	//查询不需要管理审核的群的话题
	Page<Topic> findBySourceIdInAndIsDeleted(List<Object> groupId,boolean isDeleted,Pageable pageable);
	Page<Topic> findByAuthorIdAndIsDeleted(String authorId,boolean isDeleted,Pageable pageable);
	//根据字符串搜索标题或者内容匹配并未删除的话题
	Page<Topic> findBySourceIdInAndIsDeletedAndTitleLikeOrContentLike(List<Object> groupId,boolean isDeleted,String title,String Content,Pageable pageable);
	
	//根据字符串搜索标题或者内容匹配并未删除的话题
	Page<Topic> findBySourceIdInAndIsDeletedAndTitleRegexOrSourceIdInAndIsDeletedAndContentRegex(List<Object> groupId,boolean isDeleted,String title,List<Object> groupId1,boolean isDeleted1,String Content,Pageable pageable);
	
	//根据字符串搜索标题或者内容匹配并未删除的话题 包含没有关联课程的
		Page<Topic> findByTitleRegexOrContentRegex(String title,String Content,Pageable pageable);
		
	Page<Topic> findByIsDeleted(String type,boolean isDeleted,Pageable pageable);
	List<Topic> findByPositionNearAndIsDeletedAndIsGeoOpen(Point p,  boolean isDeleted,  boolean isGeoOpen,Distance dis);
	//根据字符串搜索标题或者内容匹配并未删除的话题
		Page<Topic> findBySourceIdAndIsDeletedAndTitleRegexOrSourceIdInAndIsDeletedAndContentRegex(String groupId,boolean isDeleted,String title,List<Object> groupId1,boolean isDeleted1,String Content,Pageable pageable);
	long countByIsDeleted(boolean isDeleted);
	
	List<Topic> findBySourceIdAndIsDeleted(String sourceId,boolean isDeleted);
	Page<Topic> findByAuthorId(String userId, Pageable pageable);
	
	Page<Topic> findBySourceIdAndIsDeletedAndReview(String sourceId,boolean isDeleted,boolean review,Pageable pageable);
	Page<Topic> findBySourceIdAndIsDeleted(String sourceId,boolean isDeleted,Pageable pageable);
	Page<Topic> findByIsDeletedAndTitleLikeOrContentLike(boolean b,
			String keyWords, String keyWords2, Pageable pageable);
	Page<Topic> findByIsDeletedAndTitleLikeOrContentLikeOrTagNamesLike(
			boolean b, String keyWords, String keyWords2, String keyWords3,
			Pageable pageable);
	
	@Query("{'isDeleted':?0,'$or':[{'title':{$regex:?1,'$options':'i'}},{'tagNames':{$regex:?1,$options:'i'}},{'content':{$regex:?1,$options:'i'}}]}")
	Page<Topic> search(boolean b, String keyWords, Pageable pageable);
	@Query("{'isDeleted':?0,'$or':[{'title':{$regex:?1,'$options':'i'}},{'tagNames':{$regex:?1,$options:'i'}},{'content':{$regex:?1,$options:'i'}}],'sourceId':?2}")
	Page<Topic> searchBySourceId(boolean b, String keyWords, String sourceId,Pageable pageable);
	
	Page<Topic> findByIsDeleted(boolean isDeleted,Pageable pageable);
	Page<Topic> findByTitleRegexAndIsDeletedAndReviewOrContentRegexAndIsDeletedAndReview(String title,boolean isDeleted,boolean review, String Content,boolean isDeleted1,boolean review2, Pageable pageable);
	
	
	Page<Topic> findByTitleRegexAndIsDeletedOrContentRegexAndIsDeleted(String title,boolean isDeleted, String Content,boolean isDeleted1, Pageable pageable);
	//根据字符串搜索标题或者内容匹配并未删除的话题
	Page<Topic> findBySourceIdAndIsDeletedAndTitleRegexOrSourceIdAndIsDeletedAndContentRegex(String groupId,boolean isDeleted,String title,String groupId1,boolean isDeleted1,String Content,Pageable pageable);
	Page<Topic> findByIsDeletedAndCategoryId(boolean isDeleted,String categoryId,Pageable pageable);
	
	Page<Topic> findByIsDeletedAndChildCategoryId(boolean isDeleted,String childCategoryId,Pageable pageable);
	
	int countByIsDeletedAndCategoryId(boolean isDeleted,String categoryId);
	
	int countByIsDeletedAndChildCategoryId(boolean isDeleted,String childCategoryId);
	
	Page<Topic> findByIsDeletedAndTopicIdNotIn(boolean isdeleted,List<Object> topicIds,Pageable pageable);
	
	List<Topic> findByTitleRegexAndIsDeletedAndTopicIdNotInOrContentRegexAndIsDeletedAndTopicIdNotIn(String title,boolean isDeleted,List<Object> topicIds ,String Content,boolean isDeleted1,List<Object> topicIds1  );
	
	Page<Topic> findByTopicIdIn(List<Object> ids, Pageable pageable);
	Topic findByTopicId(String id);
	
	Page<Topic> findByIsDeletedAndReview(boolean isDeleted,boolean review,Pageable pageable);
	int countByAuthorId(String userId);
	Page<Topic> findByIsDeletedAndTitleRegexOrIsDeletedAndContentRegex( boolean b,  String titleOrContent, boolean c, String titleOrContent2, Pageable pageable);
	int countByDisplayOrderAndIsDeletedAndSourceId(int displayOrder,boolean isDeleted,String groupId);//计算某一群话题置顶的数量
	}
