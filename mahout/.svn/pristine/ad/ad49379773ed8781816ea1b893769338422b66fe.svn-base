package demo.pojo;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="newCourse")
public class NewCourse   {

	@Id
	private String id;
	@Indexed
	private String title;//课程名称

	private String intro;//课程描述
	
	private List<Object> chapters;//课程章节
	
	private List<Object> tags;//课程标签（预留）
	
	private Map<String,Long> whoFav;//收藏
	
	private int favCount;//收藏数量
	
	private Map<String,Long> whoShare;//分享
	
	private int shareCount;//分享数量
	
	private Map<String,Long> whoStudy;//学习
	
	private int studyCount;//学习数量
	
	private int favPostCount;  //好评人数
	
	private int postCount;//评论人数
	
	private String  favProp;//好评度
	
	private int buyCount;//购买数量
	
	private long ctime;//创建时间
	
	private long utime;//更新时间
	/**
	 * logoFile
	 */
	private String logoUrl;
	
	/**
	 * 创建用户
	 */
	private Object createUser;
	
	
	/**
	 * 更新用户
	 */
	private Object updateUser;
	/**
	 * 来源类别   1：内容中心 2：其他 3:运营后台
	 */
	private int sourceType;
	/**
	 * 来源为内容中心 则记录其原来主键Id
	 */
	@Indexed
	private String sourceId;
	
	/**
	 * 课程类型：点播课程OnlineCourse、线下课程OfflineCourse、直播课程MeetingCourse
	 */
	private String courseType;	
	
	/**
	 * 热门排序
	 */
	private String hotIndex;	
	
	/**
	 * 推荐排序  >0 就是推荐的
	 */
	private String recommendIndex;
	
	/**
	 * 精品排序
	 */
	private String bestIndex;
	
    //1.9添加
	
	/**
	 * 被赞数量
	 */
	private int praiseCount;
	
	private String tagNames;
	
	private long viewCount;
	
	private Object newchapter;
	
	private boolean checked;
	
	private String categoryId;
	
	private String childCategoryId;
	
	//15.2.27添加两个属性
	/**
	 * 0 公开 1 不公开
	 */
	private int isPublic; //是否公开
	//课程中未审核课时数量
	private int unPassedCount;
	//价格
	private String price;
	//付费模式 0 免费  1  付费   2 打赏
	private int pricemodel;
	
	private String createUserName;
	
	private String userLogo;
	//分成比例
	private String scale;
	
	//类型
	private String original;//1原创，2转载
	
	private String height;
	
	private String width;
	
	private String feelgood;//一级分类id;
	private String type;//二级分类Id
	
	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	
	
	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public int getPricemodel() {
		return pricemodel;
	}

	public void setPricemodel(int pricemodel) {
		this.pricemodel = pricemodel;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getUserLogo() {
		return userLogo;
	}

	public void setUserLogo(String userLogo) {
		this.userLogo = userLogo;
	}

	
    
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getPraiseCount() {
		return praiseCount;
	}

	public void setPraiseCount(int praiseCount) {
		this.praiseCount = praiseCount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}


	public List<Object> getChapters() {
		return chapters;
	}

	public void setChapters(List<Object> chapters) {
		this.chapters = chapters;
	}

	public List<Object> getTags() {
		return tags;
	}

	public void setTags(List<Object> tags) {
		this.tags = tags;
	}

	public Map<String, Long> getWhoFav() {
		return whoFav;
	}

	public void setWhoFav(Map<String, Long> whoFav) {
		this.whoFav = whoFav;
	}

	public int getFavCount() {
		return favCount;
	}

	public void setFavCount(int favCount) {
		this.favCount = favCount;
	}

	public Map<String, Long> getWhoShare() {
		return whoShare;
	}

	public void setWhoShare(Map<String, Long> whoShare) {
		this.whoShare = whoShare;
	}

	public int getShareCount() {
		return shareCount;
	}

	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}

	public Map<String, Long> getWhoStudy() {
		return whoStudy;
	}

	public void setWhoStudy(Map<String, Long> whoStudy) {
		this.whoStudy = whoStudy;
	}

	public int getStudyCount() {
		return studyCount;
	}

	public void setStudyCount(int studyCount) {
		this.studyCount = studyCount;
	}
	

	public int getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(int buyCount) {
		this.buyCount = buyCount;
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

	


	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Object getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Object createUser) {
		this.createUser = createUser;
	}

	public Object getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Object updateUser) {
		this.updateUser = updateUser;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getHotIndex() {
		return hotIndex;
	}

	public void setHotIndex(String hotIndex) {
		this.hotIndex = hotIndex;
	}

	public String getRecommendIndex() {
		return recommendIndex;
	}

	public void setRecommendIndex(String recommendIndex) {
		this.recommendIndex = recommendIndex;
	}

	public String getBestIndex() {
		return bestIndex;
	}

	public void setBestIndex(String bestIndex) {
		this.bestIndex = bestIndex;
	}



	public int getSourceType() {
		return sourceType;
	}

	public void setSourceType(int sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getTagNames() {
		return tagNames;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
	}

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	public Object getNewchapter() {
		return newchapter;
	}

	public void setNewchapter(Object newchapter) {
		this.newchapter = newchapter;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
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

	public int getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(int isPublic) {
		this.isPublic = isPublic;
	}

	public int getUnPassedCount() {
		return unPassedCount;
	}

	public void setUnPassedCount(int unPassedCount) {
		this.unPassedCount = unPassedCount;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getFavProp() {
		return favProp;
	}

	public void setFavProp(String favProp) {
		this.favProp = favProp;
	}

	public int getFavPostCount() {
		return favPostCount;
	}

	public void setFavPostCount(int favPostCount) {
		this.favPostCount = favPostCount;
	}

	public int getPostCount() {
		return postCount;
	}

	public void setPostCount(int postCount) {
		this.postCount = postCount;
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
