package com.volucris.streamkingdom.realm.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.volucris.streamkingdom.realm.model.Realm;

public interface RealmDao extends MongoRepository<Realm, ObjectId> {

}
