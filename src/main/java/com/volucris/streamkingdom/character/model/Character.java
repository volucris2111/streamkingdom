package com.volucris.streamkingdom.character.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Character {

	private CharacterType characterType;

	@Id
	private ObjectId id;

	private ObjectId ownerUserId;

	private ObjectId realmId;

	public CharacterType getCharacterType() {
		return this.characterType;
	}

	public ObjectId getId() {
		return this.id;
	}

	public ObjectId getOwnerUserId() {
		return this.ownerUserId;
	}

	public ObjectId getRealmId() {
		return this.realmId;
	}

	public void setCharacterType(final CharacterType characterType) {
		this.characterType = characterType;
	}

	public void setId(final ObjectId id) {
		this.id = id;
	}

	public void setOwnerUserId(final ObjectId ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public void setRealmId(final ObjectId realmId) {
		this.realmId = realmId;
	}
}
