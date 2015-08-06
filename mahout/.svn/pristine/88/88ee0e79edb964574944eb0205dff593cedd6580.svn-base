package demo.pojo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="praise")
public class Praise  {
	@Id
	private String id;
	@Indexed
	private String userId;  //用户Id
	@Indexed
	private String domain;//域即产品线  
	@Indexed
	private String appKey;  //来源 ，如 ios，android，pc,oss
	@Indexed
	private String sourceId;  //类型ID(话题Id，课程Id等)
	@Indexed
	private String type; //类型  (查看配置文件Config，type类型)
	@Indexed
	private long ctime;
	
	private long utime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	
}
