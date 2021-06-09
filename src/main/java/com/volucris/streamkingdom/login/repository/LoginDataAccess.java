package com.volucris.streamkingdom.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.volucris.streamkingdom.login.model.TwitchUser;

public interface LoginDataAccess extends MongoRepository<TwitchUser, String> {

}
