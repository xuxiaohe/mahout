package demo.repo;

import java.util.List;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.Drycargo;
import java.lang.String;

public interface DrycargoRepository extends MongoRepository<Drycargo, String>{

	Page<Drycargo> findByGroup(String keywords,Pageable page);
	
	Page<Drycargo> findByGroupIn(List<Object> groupId,Pageable pageable);
	List<Drycargo> findByIdIn(List<Object> dryids);
	Page<Drycargo> findByIdIn(List<Object> dryids,Pageable pageable);

	int countByGroup(String group);
	
	List<Drycargo> findOneByUrl(String url);
	
	Drycargo findOneByUrlAndGroup(String url,String group);

	Drycargo findOneById(String dryCargoId);
	
	Drycargo findByIdAndGroup(String drycargoId,String group);
//	
//	Drycargo findOneByDrycargoId(String dryCargoId);
	
	Page<Drycargo> findByMessageRegex(String keywords,Pageable pageable);
	
	
	List<Drycargo> findByDryFlagAndMessageRegexAndIdNotIn(int dryType,String keywords,List<Object> ids);

	Page<Drycargo> findByAuthorId(String shareId,Pageable pageable);
	
	List<Drycargo> findByGroup(String groupId);
	Page<Drycargo> findByDryFlagAndReviewAndIdNotIn(int dryflag,boolean b,List<Object> ids,Pageable pageable);
	Page<Drycargo> findByDryFlagAndGroupNotNull(int dryType,Pageable pageable);
	Page<Drycargo> findByDryFlagAndGroupNotIn(int dryType,List<Object> ids,Pageable pageable);
	Page<Drycargo> findByDryFlagAndGroupIn(int dryType,List<Object> ids,Pageable pageable);
	Page<Drycargo> findByGroupNotNull(Pageable pageable);
	Page<Drycargo> findByReviewAndGroupNotNull(boolean review,Pageable pageable);
	Page<Drycargo> findByGroupAndDryFlag(String keywords,int dryType,Pageable page);
	
	//Page<Drycargo> findByDryFlagAndMessageRegexAndGroupNotNullOrDryFlagAndDescriptionRegexAndGroupNotNull(int dryType,String keywords,int dryType1,String keywords1,Pageable pageable);
	
	Page<Drycargo> findByMessageRegexAndGroupNotNullOrDescriptionRegexAndGroupNotNull(String keywords,String keywords1,Pageable pageable);
	
	Page<Drycargo> findByAuthorIdAndDryFlag(String shareId,int dryType,Pageable pageable);
	
	//int countByGroupAndDryFlag(String group,int dryType);
	
	@Query("{'dryFlag':?0,'$or':[{'message':{'$regex':?1,$options:'i'}},{'description':{'$regex':?1,$options:'i'}},{'drycargoTagName':{'$regex':?1,$options:'i'}}]}")
 	Page<Drycargo> findByOthers(int i, String keywords, Pageable pageable);
	
	@Query("{'dryFlag':?0,'$or':[{'message':{'$regex':?1,$options:'i'}},{'description':{'$regex':?1,$options:'i'}},{'drycargoTagName':{'$regex':?1,$options:'i'}}],'review':?2}")
 	Page<Drycargo> findByOthers(int i, String keywords,Boolean b, Pageable pageable);
	
	Page<Drycargo> findByCtimeBetween(long t2, long t1, Pageable pageable);
	
	@Query("{'$or':[{'message':{'$regex':?0,$options:'i'}},{'drycargoTagName':{'$regex':?0,$options:'i'}}]}")
	Page<Drycargo> findByOther(String keywords, Pageable pageable);
	
	@Query("{'dryFlag':0,'$or':[{'message':{'$regex':?1,$options:'i'}},{'description':{'$regex':?1,$options:'i'}}],'group':?2}")
 	Page<Drycargo> findByOthers(int i, String keywords,String groupId, Pageable pageable);
	Page<Drycargo> findByDryFlagAndIdNotIn(int dryType,List<Object> ids,Pageable pageable);
	
	//Page<Drycargo> findByDryFlagAndCategoryId(int dryType,String categoryId ,Pageable pageable);
	Page<Drycargo> findByCategoryId(String categoryId ,Pageable pageable);
	//Page<Drycargo> findByDryFlagAndChildCategoryId(int dryType,String childCategoryId,Pageable pageable);
	Page<Drycargo> findByChildCategoryId(String childCategoryId,Pageable pageable);
	//List<Drycargo> findByDryFlagAndChildCategoryId(int dryType,String childCategoryId);
	List<Drycargo> findByDryFlagAndChildCategoryId(int dryType,String childCategoryId);
	//int countByDryFlagAndCategoryId(int dryType,String categoryId);
	int countByCategoryId(String categoryId);
	//int countByDryFlagAndChildCategoryId(int dryType,String childCategoryId);
	int countByChildCategoryId(String childCategoryId);
	Page<Drycargo> findByDryFlagAndReview(int dryType,boolean review,Pageable pageable);
	//Page<Drycargo> findByReview(boolean review,Pageable pageable);
	int countByAuthorId(String userId);
    Drycargo findById(String id);
	List<Drycargo> findByDryFlag(int dryType);
}
