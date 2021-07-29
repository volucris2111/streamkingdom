package com.volucris.streamkingdom.building.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class BuildingType {

	@Id
	private ObjectId id;

	private String name;

	public ObjectId getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(final ObjectId id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}
}
