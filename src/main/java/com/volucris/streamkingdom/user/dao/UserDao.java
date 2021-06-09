package com.volucris.streamkingdom.user.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.volucris.streamkingdom.user.model.User;

public interface UserDao extends MongoRepository<User, ObjectId> {

	User findByTwitchId(String twitchId);
}
