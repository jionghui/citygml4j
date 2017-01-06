/*
 * citygml4j - The Open Source Java API for CityGML
 * https://github.com/citygml4j
 * 
 * Copyright 2013-2016 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.citygml4j.model.module.citygml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.citygml4j.model.citygml.CityGML;
import org.citygml4j.model.citygml.underground.Underground;
import org.citygml4j.model.citygml.building.BuildingFurniture;
import org.citygml4j.model.citygml.building.BuildingInstallation;
import org.citygml4j.model.citygml.building.BuildingPart;
import org.citygml4j.model.citygml.building.CeilingSurface;
import org.citygml4j.model.citygml.building.ClosureSurface;
import org.citygml4j.model.citygml.building.Door;
import org.citygml4j.model.citygml.building.FloorSurface;
import org.citygml4j.model.citygml.building.GroundSurface;
import org.citygml4j.model.citygml.building.IntBuildingInstallation;
import org.citygml4j.model.citygml.building.InteriorWallSurface;
import org.citygml4j.model.citygml.building.OuterCeilingSurface;
import org.citygml4j.model.citygml.building.OuterFloorSurface;
import org.citygml4j.model.citygml.building.RoofSurface;
import org.citygml4j.model.citygml.building.Room;
import org.citygml4j.model.citygml.building.WallSurface;
import org.citygml4j.model.citygml.building.Window;
import org.citygml4j.model.module.Module;

public class UndergroundModule extends AbstractCityGMLModule {
	private static final List<UndergroundModule> instances = new ArrayList<UndergroundModule>();

	public static final UndergroundModule v2_0_0;
	public static final UndergroundModule v1_0_0;

	private UndergroundModule (
			CityGMLModuleType type, 
			CityGMLModuleVersion version,
			String namespaceURI, 
			String namespacePrefix, 
			String schemaLocation,
			Module... dependencies) {
		super(type, version, namespaceURI, namespacePrefix, schemaLocation, dependencies);		
		instances.add(this);
	}

	static {
		v2_0_0 = new UndergroundModule (
				CityGMLModuleType.UNDERGROUND,
				CityGMLModuleVersion.v2_0_0,
				"http://www.opengis.net/citygml/underground/2.0",
				"ug",
				"http://schemas.opengis.net/citygml/underground/2.0/underground.xsd",			
				CoreModule.v2_0_0);
		
		v1_0_0 = new UndergroundModule (
				CityGMLModuleType.UNDERGROUND,
				CityGMLModuleVersion.v1_0_0,
				"http://www.opengis.net/citygml/underground/1.0",
				"ug",
				"http://schemas.opengis.net/citygml/underground/1.0/underground.xsd",			
				CoreModule.v1_0_0);

		v2_0_0.elementMap = new HashMap<String, Class<? extends CityGML>>();
		v2_0_0.elementMap.put("Underground", Underground.class);
		v2_0_0.elementMap.put("BuildingPart", BuildingPart.class);
		v2_0_0.elementMap.put("Room", Room.class);
		v2_0_0.elementMap.put("IntBuildingInstallation", IntBuildingInstallation.class);
		v2_0_0.elementMap.put("BuildingInstallation", BuildingInstallation.class);
		v2_0_0.elementMap.put("BuildingFurniture", BuildingFurniture.class);
		v2_0_0.elementMap.put("InteriorWallSurface", InteriorWallSurface.class);
		v2_0_0.elementMap.put("RoofSurface", RoofSurface.class);
		v2_0_0.elementMap.put("ClosureSurface", ClosureSurface.class);
		v2_0_0.elementMap.put("WallSurface", WallSurface.class);
		v2_0_0.elementMap.put("FloorSurface", FloorSurface.class);
		v2_0_0.elementMap.put("CeilingSurface", CeilingSurface.class);
		v2_0_0.elementMap.put("GroundSurface", GroundSurface.class);
		v2_0_0.elementMap.put("Window", Window.class);
		v2_0_0.elementMap.put("Door", Door.class);
		v1_0_0.elementMap = v2_0_0.elementMap;
		
		v2_0_0.elementMap.put("OuterFloorSurface", OuterFloorSurface.class);
		v2_0_0.elementMap.put("OuterCeilingSurface", OuterCeilingSurface.class);
		
		v2_0_0.propertySet = new HashSet<String>();
		v2_0_0.propertySet.add("address");
		v2_0_0.propertySet.add("boundedBy");
		v2_0_0.propertySet.add("opening");
		v2_0_0.propertySet.add("outerBuildingInstallation");
		v2_0_0.propertySet.add("interiorBuildingInstallation");
		v2_0_0.propertySet.add("interiorRoom");
		v2_0_0.propertySet.add("consistsOfBuildingPart");
		v2_0_0.propertySet.add("interiorFurniture");
		v2_0_0.propertySet.add("roomInstallation");
		v1_0_0.propertySet = v2_0_0.propertySet;
	}
	
	public static List<UndergroundModule> getInstances() {
		return instances;
	}
	
	public static UndergroundModule getInstance(CityGMLModuleVersion version) {
		switch (version) {
		case v2_0_0:
			return v2_0_0;
		case v1_0_0:
			return v1_0_0;
		default:
			return null;
		}
	}
	
}
