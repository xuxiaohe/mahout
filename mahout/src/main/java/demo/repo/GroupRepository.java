package demo.repo;

import java.util.List;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.XueWenGroup;

public interface GroupRepository extends MongoRepository<XueWenGroup, String> {
	XueWenGroup findOneByGroupName(String groupName);
	XueWenGroup findOneById(String id);
	XueWenGroup findOneByGroupNumber(long groupNumber);
	List<XueWenGroup> findAll(Sort sort);
	Page<XueWenGroup> findAllByGroupNameOrIntro(String groupName,String intro,Pageable page);
	
	Page<XueWenGroup> findAllByGroupNameRegexOrIntroRegex(String groupName,String intro,Pageable page);
	
	Page<XueWenGroup> findByIdNotInAndGroupNameRegexAndPositionNear( List<String> myGroups,String groupName,Point p,Pageable page);
	Page<XueWenGroup> findByIdNotIn(List<String> myGroups,Pageable page);
	@Query("{'$or':[{'groupName':{'$regex':?0,$options:'i'}},{'tagNames':{'$regex':?1,$options:'i'}}]}")
	Page<XueWenGroup> searchByGroupNameLikeOrTagNamesLike(String keywords1,String keywords2,Pageable page);
	Page<XueWenGroup> findByTagNames(String keywords1,Pageable page);

	Page<XueWenGroup> findAll(Pageable page);
	
	Page<XueWenGroup> findByPositionNear(Point p, Pageable page);
	
	List<XueWenGroup> findByIdNotIn(List<String> myGroups,Sort sort);
	
	List<XueWenGroup> findByChildCategoryId(String myGroups);
	
	
	List<XueWenGroup> findByPositionNearAndIsGeoOpen(Point p,boolean isGeoOpen,Distance distance);
	
	Page<XueWenGroup> findByIdNotInAndGroupNameRegex( List<String> myGroups,String groupName,Pageable page);
	
	//List<XueWenGroup> findByIdNotInAndTagRegex( List<String> myGroups,String tag,Sort sort);
	
	Page<XueWenGroup> findByIdIn(List<Object> myGroups,Pageable page);
	//根据标签查所有小组 云学堂V3
	List<XueWenGroup> findByIdIn(List<Object> idList);
	
	Page<XueWenGroup> findByIdNotInAndIsOpenRegex(List<String> myGroups,String isOpen,Pageable page);
	Page<XueWenGroup> findByIdNotInAndIsOpen(List<String> myGroups,String isOpen,Pageable page);
	//@Query(value="{'_id':?0,'isOpen':?1}",fields="{'_id':1}")
	List<XueWenGroup> findByIdNotInAndIsOpen(List<String> myGroups,String isOpen);
	
	@Query(value="{'isOpen':?0}",fields="{'_id':1}")
	List<XueWenGroup> findAllAndIsOpen(String isOpen);
	
	List<XueWenGroup> findByOwner(String userId);
	List<XueWenGroup> findByMemberAndOwnerIsNot(String userId,String ownerUserId);
	XueWenGroup findByIdAndMember(String groupId,String userId);
	List<XueWenGroup> findByAdminAndOwnerIsNot(String userId,String ownerUserId);
	List<XueWenGroup> findByMemberAndOwnerIsNotAndAdminIsNot(String userId,String ownerUserId,String adminUserId);
	Page<XueWenGroup> findByMemberAndOwnerIsNotAndAdminIsNot(String userId,String ownerUserId,String adminUserId,Pageable pageable);

	
	XueWenGroup findOneByIdAndAdminIn(String id,String userId);
	XueWenGroup findOneByIdAndOwnerIn(String id,String userId);
	//XueWenGroup findOneBygroupn(String id,String userId);
	
	XueWenGroup findOneByIdAndMemberIn(String id,String userId);
	Page<XueWenGroup> findByGroupNameRegex(String groupName, Pageable pageable);
	List<XueWenGroup> findByAdmin(String userId);
	Page<XueWenGroup> findByAdmin(String userId,Pageable pageable);
	Page<XueWenGroup> findByMemberIn(String id,Pageable pageable);
	XueWenGroup findByGroupNumber(long number);
	Page<XueWenGroup> findByOwner(String userId, Pageable pageable);
	Page<XueWenGroup> findByTagNamesLike(String tagName, Pageable pageable);
	int countByTagNamesLike(String tagNames);
	
	int countByCategoryId(String categoryId);
	int countByChildCategoryId(String childCategoryId);
	
	Page<XueWenGroup> findByIsOpenAndIdNotIn(String a,List<Object> l, Pageable pageable);
	
	List<XueWenGroup> findByGroupNameRegexAndIsOpenAndIdNotInOrIntroRegexAndIsOpenAndIdNotIn(String name,String a,List<Object> l,String intro,String a1,List<Object> l1);
	Page<XueWenGroup> findByChildCategoryId(String categoryId, Pageable pageable);
	Page<XueWenGroup> findByCategoryId(String categoryId, Pageable pageable);
	List<XueWenGroup> findByMemberIn(String userId, Sort st);
	List<XueWenGroup> findByOwner(String userId, Sort st);
	List<XueWenGroup> findByAdminAndOwnerIsNot(String userId,String ownerUserId,Sort st);
	List<XueWenGroup> findByMemberAndOwnerIsNotAndAdminIsNot(String userId,String ownerUserId,String adminUserId,Sort st);
	List<XueWenGroup> findByIdIn(List<Object> myGroups,Sort st);
}
