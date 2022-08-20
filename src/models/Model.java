package models;

import java.util.UUID;

public class Model {
	private String id;

	public Model() {
		UUID uuid = UUID.randomUUID();
		id = uuid.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
