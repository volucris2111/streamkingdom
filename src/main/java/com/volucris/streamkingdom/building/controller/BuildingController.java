package com.volucris.streamkingdom.building.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.volucris.streamkingdom.building.service.BuildingService;

@Controller
public class BuildingController {

	@Autowired
	private BuildingService buildingService;

	@GetMapping("/buildingtypes")
	public String getGeneratedBuildingTypes() {
		this.buildingService.initBuildingTypes();
		return "index";
	}

}
