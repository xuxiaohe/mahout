package demo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="newGroupCourse")
public class NewGroupCourse   {

	@Id
	private String id;
	@Indexed
	private Object course;  //课程(数据库存储课程ID)
	@Indexed
	private Object group;//群组（数据库存储群组ID）
	private String groupName;
	private String logoUrl;
	private Object whoImport; //把课程分享至此小组课堂的人员列表
//	private List<String> whoFav;//小组课堂收藏人员列表
	private int favCount;//收藏人数统计
//	private List<String> whoStudy;//小组课堂学习人员列表
	private int studyCount;//学习人员统计
//	private List<String> whoShare;//小组课堂分享至别的群组或目的地址的人员列表
	private int shareCount;//分享人员统计
	private long ctime;//创建时间
	private long utime;//修改时间
	private int disPlay;//0：公开课，10：私有课 20：小组删除
	private String categoryId;
	private String childCategoryId;
	
	@Indexed
	private boolean review;//审核标示
	private int weightSort;//权重
	
	private int likeCount;//赞数量
	
	private NewCourse newCourse;
	private String feelgood;//一级分类id;
	private String type;//二级分类Id
	public int getWeightSort() {
		return weightSort;
	}

	public void setWeightSort(int weightSort) {
		this.weightSort = weightSort;
	}

	public NewGroupCourse(){
		super();
		
	}
	
	public NewGroupCourse(String groupId,String courseId,String userId){
		this.group=groupId;
		this.course=courseId;
		long time=System.currentTimeMillis();
		this.whoImport=userId;
		this.favCount=0;
		this.studyCount=0;
		this.shareCount=0;
		this.ctime=time;
		this.utime=time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getCourse() {
		return course;
	}

	public void setCourse(Object course) {
		this.course = course;
	}

	public Object getGroup() {
		return group;
	}

	public void setGroup(Object group) {
		this.group = group;
	}

	public Object getWhoImport() {
		return whoImport;
	}

	public void setWhoImport(Object whoImport) {
		this.whoImport = whoImport;
	}


	public int getFavCount() {
		return favCount;
	}

	public void setFavCount(int favCount) {
		this.favCount = favCount;
	}

	public int getStudyCount() {
		return studyCount;
	}

	public void setStudyCount(int studyCount) {
		this.studyCount = studyCount;
	}

	public int getShareCount() {
		return shareCount;
	}

	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}

	public long getCtime() {
		return ctime;
	}

	public void setCtime(long ctime) {
		this.ctime = ctime;
	}

	public long getUtime() {
		return utime;
	}

	public void setUtime(long utime) {
		this.utime = utime;
	}

	public int getDisPlay() {
		return disPlay;
	}

	public void setDisPlay(int disPlay) {
		this.disPlay = disPlay;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getChildCategoryId() {
		return childCategoryId;
	}

	public void setChildCategoryId(String childCategoryId) {
		this.childCategoryId = childCategoryId;
	}

	public boolean isReview() {
		return review;
	}

	public void setReview(boolean review) {
		this.review = review;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public NewCourse getNewCourse() {
		return newCourse;
	}

	public void setNewCourse(NewCourse newCourse) {
		this.newCourse = newCourse;
	}

	public String getFeelgood() {
		return feelgood;
	}

	public void setFeelgood(String feelgood) {
		this.feelgood = feelgood;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
