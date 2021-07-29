package com.volucris.streamkingdom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class MongoDBConfig {
	@Bean
	public MongoClient mongoClient() {
		final MongoClient mongoClient = MongoClients.create(
				"mongodb+srv://realmkingdom:Cnk8M2Kdwi6nW3fw@realmcluster.p4ajn.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
		mongoClient.getDatabase("realmkingdom");
		return mongoClient;
	}
}
