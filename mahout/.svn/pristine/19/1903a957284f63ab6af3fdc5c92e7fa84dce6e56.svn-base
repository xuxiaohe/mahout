package demo.pojo;


import java.io.Serializable;

import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;

/**
 * @author Edwin Chen
 *
 */
public class redisuser extends JdkSerializationRedisSerializer implements Serializable {
	
	private static final long serialVersionUID = 522889572773714584L;
	
	private String id;
	private String name;
	private String password;
	
	public redisuser() {}
	
	public redisuser(String id,String name,String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

