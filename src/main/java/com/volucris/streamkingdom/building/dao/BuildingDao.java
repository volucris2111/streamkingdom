package com.volucris.streamkingdom.building.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.volucris.streamkingdom.building.model.Building;

public interface BuildingDao extends MongoRepository<Building, ObjectId> {

}
