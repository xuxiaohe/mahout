package demo;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;

@Configuration
public class MongoConfiguration {
	private static final Logger logger=Logger.getLogger(MongoConfiguration.class);

	@Inject Environment env;
	@SuppressWarnings("deprecation")
	public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		//logger.info("数据库服务地址："+env.getProperty("mongo.service")+"========数据库名"+ env.getProperty("mongo.database"));
		//UserCredentials uc = new UserCredentials("yxt","yunxuetang");
	//	return new SimpleMongoDbFactory(new Mongo("s1.of.yunxuetang.com"), "test");
		MongoClientOptions neMo = new MongoClientOptions.Builder().connectionsPerHost(300).build();
		ServerAddress address1 = new ServerAddress("192.168.100.3", 9000);
//		ServerAddress address1 = new ServerAddress("chat.yunxuetang.com", 27017);
	//	ServerAddress address2 = new ServerAddress("192.168.3.111", 28014);
		List<ServerAddress> addresses = new ArrayList<ServerAddress>();
		addresses.add(address1);
	//	addresses.add(address2);
		MongoClient mongoClient5 = new MongoClient(addresses,neMo);
		ReadPreference preference = ReadPreference.secondaryPreferred();
		mongoClient5.setReadPreference(preference); 
		return new SimpleMongoDbFactory(mongoClient5, "online");
	}
	public @Bean MongoTemplate mongoTemplate() throws Exception {
	    return new MongoTemplate(mongoDbFactory());
	}

}
