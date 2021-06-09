package com.volucris.streamkingdom.character.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.volucris.streamkingdom.character.model.Character;

public interface CharacterDao extends MongoRepository<Character, ObjectId> {

}
