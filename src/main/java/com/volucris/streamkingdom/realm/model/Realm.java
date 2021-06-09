package com.volucris.streamkingdom.realm.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Realm {
	@Id
	private ObjectId id;
	private ObjectId ownerUserId;

	public ObjectId getId() {
		return this.id;
	}

	public ObjectId getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setId(final ObjectId id) {
		this.id = id;
	}

	public void setOwnerUserId(final ObjectId ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

}
