package com.volucris.streamkingdom.building.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.volucris.streamkingdom.building.dao.BuildingTypeDao;
import com.volucris.streamkingdom.building.model.BuildingType;
import com.volucris.streamkingdom.utilities.JsonImporter;

@Service
public class BuildingService {

	@Autowired
	private BuildingTypeDao buildingTypeDao;

	@Autowired
	private JsonImporter jsonImporter;

	public void initBuildingTypes() {
		final String jsonFile = "/json/buildingTypes.json";
		final Type listType = new TypeToken<ArrayList<BuildingType>>() {
		}.getType();
		final ArrayList<BuildingType> buildingTypes = new Gson().fromJson(this.jsonImporter.getJsonFromFile(jsonFile),
				listType);
		final List<BuildingType> saveBuildingTypes = this.buildingTypeDao.saveAll(buildingTypes);
		System.out.println(new Gson().toJson(saveBuildingTypes));
	}
}
