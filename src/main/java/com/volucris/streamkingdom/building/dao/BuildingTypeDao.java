package com.volucris.streamkingdom.building.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.volucris.streamkingdom.building.model.BuildingType;

public interface BuildingTypeDao extends MongoRepository<BuildingType, ObjectId> {

}
