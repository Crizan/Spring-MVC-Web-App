package com.krijan.springapp.responsebody;

import com.fasterxml.jackson.annotation.JsonProperty;

import net.sf.json.JSONArray;

public class ZoneResponseBody {

	@JsonProperty("zone")
	JSONArray jsonArray;

	public JSONArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}
	

}
