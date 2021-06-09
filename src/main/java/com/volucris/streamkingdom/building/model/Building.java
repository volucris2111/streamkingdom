package com.volucris.streamkingdom.building.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Building {
	private BuildingType buildingType;
	@Id
	private ObjectId id;

	private ObjectId ownerUserId;

	public BuildingType getBuildingType() {
		return this.buildingType;
	}

	public ObjectId getId() {
		return this.id;
	}

	public ObjectId getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setBuildingType(final BuildingType buildingType) {
		this.buildingType = buildingType;
	}

	public void setId(final ObjectId id) {
		this.id = id;
	}

	public void setOwnerUserId(final ObjectId ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

}
