package demo.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author yangquanliang
 * 主题
 */
@Document(collection="topic")
public class Topic  {

	@Id
	private String topicId; // 主题tid
	@Indexed
	private String sourceId; // 来源编号 群组id
	private String sourceName; // 来源名称
	private String sourceLogoUrl;//群名称
	@Indexed
	private String appKey;//域ID
	private String type;//类型
	@Indexed
	private String courseId;//课程ID

	private String authorId; // 创建人id
	private String authorName; // 创建人名称
	private String authorLogoUrl;//创建者图片

	private String title; // 标题
	private String content;//内容
	
	
	private long ctime; // 创建时间
	private long utime; //更新时间

	private int viewCount; // 查看数
	private int replyCount; // 回复数
	private int newReplyCount;//主题的新回复数
	
	private List<Object> whoLiked;//谁赞过存赞过的用户id 使用LinkedList并判断长度 只保留7个左右的用户名
	private int likesCount; // 被点赞的次数
	
	private List<Object> whounLiked;//谁不赞
	private int unLikeCount;//不赞数量
	
	private List<Object> whoShared;//谁分享 只保留7个左右的用户名
	private int shareCount;
	
	
	private int favoritesCount; // 被收藏的次数 TODO 是否保留

	private int displayOrder; // 1 置顶 0 取消置顶
	
	private long displayTime; // 置顶时间

	private int digestLevel; // 精华级别,1~3
	
	private boolean hasImage = false; // 是否有图片
	
	
	private boolean isDeleted = false; //是否删除
	
	private String picUrl; //图片
	
	private float picWidth;//图片宽度
	private float picHeight;//图片高度

	private double lat;// 纬度
	private double [] position;//位置
	private double lng;// 经度
	
	private String localName;//地理位置名称
	
	private String picLocal; //图片存储地
	
	private boolean anonymous;//匿名
	
	private boolean isGeoOpen;//地理坐标是否打开
	
	private String barCode;//二维码图片
	
	private String tagNames;//标签
	
	private String categoryId;//一级分类id;
	private String childCategoryId;//二级分类Id
	
	private List<Images> images;
	 
	@Indexed
	private boolean review;//审核标示
	
	private int weightSort;//权重
	
	private String feelgood;//一级分类id;
	 
	
	public int getWeightSort() {
		return weightSort;
	}
	public void setWeightSort(int weightSort) {
		this.weightSort = weightSort;
	}
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public int getNewReplyCount() {
		return newReplyCount;
	}
	public void setNewReplyCount(int newReplyCount) {
		this.newReplyCount = newReplyCount;
	}
	public List<Object> getWhoLiked() {
		return whoLiked;
	}
	public void setWhoLiked(List<Object> whoLiked) {
		this.whoLiked = whoLiked;
	}
	public int getLikesCount() {
		return likesCount;
	}
	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}
	public List<Object> getWhounLiked() {
		return whounLiked;
	}
	public void setWhounLiked(List<Object> whounLiked) {
		this.whounLiked = whounLiked;
	}
	public int getUnLikeCount() {
		return unLikeCount;
	}
	public void setUnLikeCount(int unLikeCount) {
		this.unLikeCount = unLikeCount;
	}
	public List<Object> getWhoShared() {
		return whoShared;
	}
	public void setWhoShared(List<Object> whoShared) {
		this.whoShared = whoShared;
	}
	public int getShareCount() {
		return shareCount;
	}
	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
	public int getFavoritesCount() {
		return favoritesCount;
	}
	public void setFavoritesCount(int favoritesCount) {
		this.favoritesCount = favoritesCount;
	}
	public int getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}
	public int getDigestLevel() {
		return digestLevel;
	}
	public void setDigestLevel(int digestLevel) {
		this.digestLevel = digestLevel;
	}
	public boolean isHasImage() {
		return hasImage;
	}
	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double[] getPosition() {
		return position;
	}
	public void setPosition(double[] position) {
		this.position = position;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getAuthorLogoUrl() {
		return authorLogoUrl;
	}
	public void setAuthorLogoUrl(String authorLogoUrl) {
		this.authorLogoUrl = authorLogoUrl;
	}
	public String getPicLocal() {
		return picLocal;
	}
	public void setPicLocal(String picLocal) {
		this.picLocal = picLocal;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	public boolean isAnonymous() {
		return anonymous;
	}
	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}
	public float getPicWidth() {
		return picWidth;
	}
	public void setPicWidth(float picWidth) {
		this.picWidth = picWidth;
	}
	public float getPicHeight() {
		return picHeight;
	}
	public void setPicHeight(float picHeight) {
		this.picHeight = picHeight;
	}
	public boolean isGeoOpen() {
		return isGeoOpen;
	}
	public void setGeoOpen(boolean isGeoOpen) {
		this.isGeoOpen = isGeoOpen;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getTagNames() {
		return tagNames;
	}
	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
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
	public long getDisplayTime() {
		return displayTime;
	}
	public void setDisplayTime(long displayTime) {
		this.displayTime = displayTime;
	}
	public String getFeelgood() {
		return feelgood;
	}
	public void setFeelgood(String feelgood) {
		this.feelgood = feelgood;
	}
	public String getSourceLogoUrl() {
		return sourceLogoUrl;
	}
	public void setSourceLogoUrl(String sourceLogoUrl) {
		this.sourceLogoUrl = sourceLogoUrl;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
	
	
	
	
}
