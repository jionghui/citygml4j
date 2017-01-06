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
package org.citygml4j.model.citygml.underground;

import java.util.GregorianCalendar;
import java.util.List;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.building.BuildingPartProperty;
import org.citygml4j.model.citygml.core.AbstractSite;
import org.citygml4j.model.citygml.core.AddressProperty;
import org.citygml4j.model.citygml.core.LodRepresentation;
import org.citygml4j.model.citygml.core.StandardObjectClassifier;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.gml.basicTypes.Code;
import org.citygml4j.model.gml.basicTypes.MeasureOrNullList;
import org.citygml4j.model.gml.feature.BoundingShape;
import org.citygml4j.model.gml.geometry.AbstractGeometry;
import org.citygml4j.model.gml.geometry.GeometryProperty;
import org.citygml4j.model.gml.geometry.aggregates.MultiCurveProperty;
import org.citygml4j.model.gml.geometry.aggregates.MultiSurfaceProperty;
import org.citygml4j.model.gml.geometry.primitives.SolidProperty;
import org.citygml4j.model.gml.measures.Length;
import org.citygml4j.model.module.citygml.UndergroundModule;

public abstract class AbstractUnderground extends AbstractSite implements UndergroundModuleComponent, StandardObjectClassifier {
	private Code clazz;
	private List<Code> function;
	private List<Code> usage;
	private Code level;
	private Length startHeight;
	private Length ceilingHeight;
	private Length area;
	private SolidProperty lod1Solid;
	private SolidProperty lod2Solid;
	private SolidProperty lod3Solid;
	private SolidProperty lod4Solid;
	private MultiCurveProperty lod1TerrainIntersection;
	private MultiCurveProperty lod2TerrainIntersection;
	private MultiCurveProperty lod3TerrainIntersection;
	private MultiCurveProperty lod4TerrainIntersection;
	private MultiCurveProperty lod2MultiCurve;
	private MultiCurveProperty lod3MultiCurve;
	private MultiCurveProperty lod4MultiCurve;
	private MultiSurfaceProperty lod0FootPrint;
	private MultiSurfaceProperty lod0RoofEdge;
	private MultiSurfaceProperty lod1MultiSurface;
	private MultiSurfaceProperty lod2MultiSurface;
	private MultiSurfaceProperty lod3MultiSurface;
	private MultiSurfaceProperty lod4MultiSurface;
	private List<BoundarySurfaceProperty> boundedBySurface;

	private List<UndergroundPartProperty> undergroundPart;
	
	private List<ADEComponent> ade;
	private UndergroundModule module;	
	
	public AbstractUnderground() {
		
	}
	
	public AbstractUnderground(UndergroundModule module) {
		this.module = module;
	}

	public void addBoundedBySurface(BoundarySurfaceProperty boundedBySurface) {
		if (this.boundedBySurface == null)
			this.boundedBySurface = new ChildList<BoundarySurfaceProperty>(this);

		this.boundedBySurface.add(boundedBySurface);
	}

	public void addConsistsOfUndergroundPart(UndergroundPartProperty undergroundPart) {
		if (this.undergroundPart == null)
			this.undergroundPart = new ChildList<UndergroundPartProperty>(this);

		this.undergroundPart.add(undergroundPart);
	}

	public void addFunction(Code function) {
		if (this.function == null)
			this.function = new ChildList<Code>(this);

		this.function.add(function);
	}
	
	public void addUsage(Code function) {
		if (this.usage == null)
			this.usage = new ChildList<Code>(this);

		this.usage.add(function);
	}

	public void addGenericApplicationPropertyOfAbstractUnderground(ADEComponent ade) {
		if (this.ade == null)
			this.ade = new ChildList<ADEComponent>(this);

		this.ade.add(ade);
	}


	public List<BoundarySurfaceProperty> getBoundedBySurface() {
		if (boundedBySurface == null)
			boundedBySurface = new ChildList<BoundarySurfaceProperty>(this);

		return boundedBySurface;
	}

	public Code getClazz() {
		return clazz;
	}

	public List<Code> getFunction() {
		if (function == null)
			function = new ChildList<Code>(this);

		return function;
	}
	
	public List<Code> getUsage() {
		if (usage == null)
			usage = new ChildList<Code>(this);

		return usage;
	}
	
	public Code getLevel() {
		return level;
	}
	
	public Length getStartHeight() {
		return startHeight;
	}
	
	public Length getArea() {
		return area;
	}
	
	public Length getCeilingHeight() {
		return ceilingHeight;
	}
	
	public List<UndergroundPartProperty> getConsistsOfUndergroundPart() {
		if (undergroundPart == null)
			undergroundPart = new ChildList<UndergroundPartProperty>(this);

		return undergroundPart;
	}

	public List<ADEComponent> getGenericApplicationPropertyOfAbstractUnderground() {
		if (ade == null)
			ade = new ChildList<ADEComponent>(this);

		return ade;
	}


	public MultiSurfaceProperty getLod1MultiSurface() {
		return lod1MultiSurface;
	}

	public SolidProperty getLod1Solid() {
		return lod1Solid;
	}

	public MultiCurveProperty getLod1TerrainIntersection() {
		return lod1TerrainIntersection;
	}

	public MultiCurveProperty getLod2MultiCurve() {
		return lod2MultiCurve;
	}

	public MultiSurfaceProperty getLod2MultiSurface() {
		return lod2MultiSurface;
	}

	public SolidProperty getLod2Solid() {
		return lod2Solid;
	}

	public MultiCurveProperty getLod2TerrainIntersection() {
		return lod2TerrainIntersection;
	}

	public MultiCurveProperty getLod3MultiCurve() {
		return lod3MultiCurve;
	}

	public MultiSurfaceProperty getLod3MultiSurface() {
		return lod3MultiSurface;
	}

	public SolidProperty getLod3Solid() {
		return lod3Solid;
	}

	public MultiCurveProperty getLod3TerrainIntersection() {
		return lod3TerrainIntersection;
	}

	public MultiCurveProperty getLod4MultiCurve() {
		return lod4MultiCurve;
	}

	public MultiSurfaceProperty getLod4MultiSurface() {
		return lod4MultiSurface;
	}

	public SolidProperty getLod4Solid() {
		return lod4Solid;
	}

	public MultiCurveProperty getLod4TerrainIntersection() {
		return lod4TerrainIntersection;
	}

	public boolean isSetBoundedBySurface() {
		return boundedBySurface != null && !boundedBySurface.isEmpty();
	}

	public boolean isSetClazz() {
		return clazz != null;
	}

	public boolean isSetConsistsOfUndergroundPart() {
		return undergroundPart != null && !undergroundPart.isEmpty();
	}

	public boolean isSetFunction() {
		return function != null && !function.isEmpty();
	}
	
	public boolean isSetLevel() {
		return level != null;
	}
	
	public boolean isSetStartHeight() {
		return startHeight != null;
	}
	
	public boolean isSetCeilingHeight() {
		return ceilingHeight != null;
	}
	
	public boolean isSetArea() {
		return area != null;
	}
	
	public boolean isSetGenericApplicationPropertyOfAbstractUnderground() {
		return ade != null && !ade.isEmpty();
	}

	public boolean isSetLod1MultiSurface() {
		return lod1MultiSurface != null;
	}

	public boolean isSetLod1Solid() {
		return lod1Solid != null;
	}

	public boolean isSetLod1TerrainIntersection() {
		return lod1TerrainIntersection != null;
	}

	public boolean isSetLod2MultiCurve() {
		return lod2MultiCurve != null;
	}

	public boolean isSetLod2MultiSurface() {
		return lod2MultiSurface != null;
	}

	public boolean isSetLod2Solid() {
		return lod2Solid != null;
	}

	public boolean isSetLod2TerrainIntersection() {
		return lod2TerrainIntersection != null;
	}

	public boolean isSetLod3MultiCurve() {
		return lod3MultiCurve != null;
	}

	public boolean isSetLod3MultiSurface() {
		return lod3MultiSurface != null;
	}

	public boolean isSetLod3Solid() {
		return lod3Solid != null;
	}

	public boolean isSetLod3TerrainIntersection() {
		return lod3TerrainIntersection != null;
	}

	public boolean isSetLod4MultiCurve() {
		return lod4MultiCurve != null;
	}

	public boolean isSetLod4MultiSurface() {
		return lod4MultiSurface != null;
	}

	public boolean isSetLod4Solid() {
		return lod4Solid != null;
	}

	public boolean isSetLod4TerrainIntersection() {
		return lod4TerrainIntersection != null;
	}


	public boolean isSetUsage() {
		return usage != null && !usage.isEmpty();
	}

	public void setBoundedBySurface(List<BoundarySurfaceProperty> boundedBySurface) {
		this.boundedBySurface = new ChildList<BoundarySurfaceProperty>(this, boundedBySurface);
	}

	public void setClazz(Code clazz) {
		this.clazz = clazz;
	}

	public void setFunction(List<Code> function) {
		this.function = new ChildList<Code>(this, function);
	}

	public void setUsage(List<Code> usage) {
		this.usage = new ChildList<Code>(this, usage);
	}
	
	public void setLevel(Code level) {
		this.level = level;
	}
	
	public void setStartHeight(Length startHeight) {
		if (startHeight != null)
			startHeight.setParent(this);
		
		this.startHeight = startHeight;
	}
	
	public void setCeilingHeight(Length ceilingHeight) {
		if (ceilingHeight != null)
			ceilingHeight.setParent(this);
		
		this.ceilingHeight = ceilingHeight;
	}
	
	public void setArea(Length area) {
		if (area != null)
			area.setParent(this);
		
		this.area = area;
	}
	
	public void setConsistsOfUndergroundPart(List<UndergroundPartProperty> undergroundPart) {
		this.undergroundPart = new ChildList<UndergroundPartProperty>(this, undergroundPart);
	}

	public void setGenericApplicationPropertyOfAbstractUnderground(List<ADEComponent> ade) {
		this.ade = new ChildList<ADEComponent>(this, ade);
	}


	public void setLod1MultiSurface(MultiSurfaceProperty lod1MultiSurface) {
		if (lod1MultiSurface != null)
			lod1MultiSurface.setParent(this);
		
		this.lod1MultiSurface = lod1MultiSurface;
	}

	public void setLod1Solid(SolidProperty lod1Solid) {
		if (lod1Solid != null)
			lod1Solid.setParent(this);
		
		this.lod1Solid = lod1Solid;
	}

	public void setLod1TerrainIntersection(MultiCurveProperty lod1TerrainIntersection) {
		if (lod1TerrainIntersection != null)
			lod1TerrainIntersection.setParent(this);
		
		this.lod1TerrainIntersection = lod1TerrainIntersection;
	}

	public void setLod2MultiCurve(MultiCurveProperty lod2MultiCurve) {
		if (lod2MultiCurve != null)
			lod2MultiCurve.setParent(this);
		
		this.lod2MultiCurve = lod2MultiCurve;
	}

	public void setLod2MultiSurface(MultiSurfaceProperty lod2MultiSurface) {
		if (lod2MultiSurface != null)
			lod2MultiSurface.setParent(this);
		
		this.lod2MultiSurface = lod2MultiSurface;
	}

	public void setLod2Solid(SolidProperty lod2Solid) {
		if (lod2Solid != null)
			lod2Solid.setParent(this);
		
		this.lod2Solid = lod2Solid;
	}

	public void setLod2TerrainIntersection(MultiCurveProperty lod2TerrainIntersection) {
		if (lod2TerrainIntersection != null)
			lod2TerrainIntersection.setParent(this);
		
		this.lod2TerrainIntersection = lod2TerrainIntersection;
	}

	public void setLod3MultiCurve(MultiCurveProperty lod3MultiCurve) {
		if (lod3MultiCurve != null)
			lod3MultiCurve.setParent(this);
		
		this.lod3MultiCurve = lod3MultiCurve;
	}

	public void setLod3MultiSurface(MultiSurfaceProperty lod3MultiSurface) {
		if (lod3MultiSurface != null)
			lod3MultiSurface.setParent(this);
		
		this.lod3MultiSurface = lod3MultiSurface;
	}

	public void setLod3Solid(SolidProperty lod3Solid) {
		if (lod3Solid != null)
			lod3Solid.setParent(this);
		
		this.lod3Solid = lod3Solid;
	}

	public void setLod3TerrainIntersection(MultiCurveProperty lod3TerrainIntersection) {
		if (lod3TerrainIntersection != null)
			lod3TerrainIntersection.setParent(this);
		
		this.lod3TerrainIntersection = lod3TerrainIntersection;
	}

	public void setLod4MultiCurve(MultiCurveProperty lod4MultiCurve) {
		if (lod4MultiCurve != null)
			lod4MultiCurve.setParent(this);
		
		this.lod4MultiCurve = lod4MultiCurve;
	}

	public void setLod4MultiSurface(MultiSurfaceProperty lod4MultiSurface) {
		if (lod4MultiSurface != null)
			lod4MultiSurface.setParent(this);
		
		this.lod4MultiSurface = lod4MultiSurface;
	}

	public void setLod4Solid(SolidProperty lod4Solid) {
		if (lod4Solid != null)
			lod4Solid.setParent(this);
		
		this.lod4Solid = lod4Solid;
	}

	public void setLod4TerrainIntersection(MultiCurveProperty lod4TerrainIntersection) {
		if (lod4TerrainIntersection != null)
			lod4TerrainIntersection.setParent(this);
		
		this.lod4TerrainIntersection = lod4TerrainIntersection;
	}


	public void unsetBoundedBySurface() {
		if (isSetBoundedBySurface())
			boundedBySurface.clear();

		boundedBySurface = null;
	}

	public boolean unsetBoundedBySurface(BoundarySurfaceProperty boundedBySurface) {
		return isSetBoundedBySurface() ? this.boundedBySurface.remove(boundedBySurface) : false;
	}

	public void unsetClazz() {
		clazz = null;
	}

	public void unsetConsistsOfUndergroundPart() {
		if (isSetConsistsOfUndergroundPart())
			undergroundPart.clear();

		undergroundPart = null;
	}

	public boolean unsetConsistsOfUndergroundPart(UndergroundPartProperty undergroundPart) {
		return isSetConsistsOfUndergroundPart() ? this.undergroundPart.remove(undergroundPart) : false;
	}

	public void unsetFunction() {
		function = null;
	}

	public boolean unsetFunction(Code function) {
		return isSetFunction() ? this.function.remove(function) : false;
	}
	
	public void unsetUsage() {
		usage = null;
	}

	public boolean unsetUsage(Code usage) {
		return isSetUsage() ? this.usage.remove(usage) : false;
	}
	
	public void unsetLevel() {
		level = null;
	}
	
	public void unsetStartHeight() {
		if (isSetStartHeight())
			startHeight.unsetParent();
		
		startHeight = null;
	}
	
	public void unsetCeilingHeight() {
		if (isSetCeilingHeight())
			ceilingHeight.unsetParent();
		
		ceilingHeight = null;
	}
	
	public void unsetArea() {
		if (isSetArea())
			area.unsetParent();
		
		area = null;
	}
	
	public void unsetGenericApplicationPropertyOfAbstractUnderground() {
		if (isSetGenericApplicationPropertyOfAbstractUnderground())
			ade.clear();

		ade = null;
	}

	public boolean unsetGenericApplicationPropertyOfAbstractUnderground(ADEComponent ade) {
		return isSetGenericApplicationPropertyOfAbstractUnderground() ? this.ade.remove(ade) : false;	}



	public void unsetLod1MultiSurface() {
		if (isSetLod1MultiSurface())
			lod1MultiSurface.unsetParent();
		
		lod1MultiSurface = null;
	}

	public void unsetLod1Solid() {
		if (isSetLod1Solid())
			lod1Solid.unsetParent();
		
		lod1Solid = null;
	}

	public void unsetLod1TerrainIntersection() {
		if (isSetLod1TerrainIntersection())
			lod1TerrainIntersection.unsetParent();
		
		lod1TerrainIntersection = null;
	}

	public void unsetLod2MultiCurve() {
		if (isSetLod2MultiCurve())
			lod2MultiCurve.unsetParent();
		
		lod2MultiCurve = null;
	}

	public void unsetLod2MultiSurface() {
		if (isSetLod2MultiSurface())
			lod2MultiSurface.unsetParent();
		
		lod2MultiSurface = null;
	}

	public void unsetLod2Solid() {
		if (isSetLod2Solid())
			lod2Solid.unsetParent();
		
		lod2Solid = null;
	}

	public void unsetLod2TerrainIntersection() {
		if (isSetLod2TerrainIntersection())
			lod2TerrainIntersection.unsetParent();
		
		lod2TerrainIntersection = null;
	}

	public void unsetLod3MultiCurve() {
		if (isSetLod3MultiCurve())
			lod3MultiCurve.unsetParent();
		
		lod3MultiCurve = null;
	}

	public void unsetLod3MultiSurface() {
		if (isSetLod3MultiSurface())
			lod3MultiSurface.unsetParent();
		
		lod3MultiSurface = null;
	}

	public void unsetLod3Solid() {
		if (isSetLod3Solid())
			lod3Solid.unsetParent();
		
		lod3Solid = null;
	}

	public void unsetLod3TerrainIntersection() {
		if (isSetLod3TerrainIntersection())
			lod3TerrainIntersection.unsetParent();
		
		lod3TerrainIntersection = null;
	}

	public void unsetLod4MultiCurve() {
		if (isSetLod4MultiCurve())
			lod4MultiCurve.unsetParent();
		
		lod4MultiCurve = null;
	}

	public void unsetLod4MultiSurface() {
		if (isSetLod4MultiSurface())
			lod4MultiSurface.unsetParent();
		
		lod4MultiSurface = null;
	}

	public void unsetLod4Solid() {
		if (isSetLod4Solid())
			lod4Solid.unsetParent();
		
		lod4Solid = null;
	}

	public void unsetLod4TerrainIntersection() {
		if (isSetLod4TerrainIntersection())
			lod4TerrainIntersection.unsetParent();
		
		lod4TerrainIntersection = null;
	}


	public MultiSurfaceProperty getLod0FootPrint() {
		return lod0FootPrint;
	}

	public MultiSurfaceProperty getLod0RoofEdge() {
		return lod0RoofEdge;
	}

	public boolean isSetLod0FootPrint() {
		return lod0FootPrint != null;
	}

	public boolean isSetLod0RoofEdge() {
		return lod0RoofEdge != null;
	}

	public void setLod0FootPrint(MultiSurfaceProperty lod0FootPrint) {
		if (lod0FootPrint != null)
			lod0FootPrint.setParent(this);
		
		this.lod0FootPrint = lod0FootPrint;
	}

	public void setLod0RoofEdge(MultiSurfaceProperty lod0RoofEgde) {
		if (lod0RoofEgde != null)
			lod0RoofEgde.setParent(this);
		
		this.lod0RoofEdge = lod0RoofEgde;
	}

	public void unsetLod0FootPrint() {
		if (lod0FootPrint != null)
			lod0FootPrint.unsetParent();
		
		lod0FootPrint = null;
	}

	public void unsetLod0RoofEdge() {
		if (lod0RoofEdge != null)
			lod0RoofEdge.unsetParent();
		
		lod0RoofEdge = null;
	}

	public final UndergroundModule getCityGMLModule() {
		return module;
	}

	public boolean isSetCityGMLModule() {
		return module != null;
	}

	@Override
	public BoundingShape calcBoundedBy(boolean setBoundedBy) {
		BoundingShape boundedBy = new BoundingShape();
		
		if (lod0FootPrint != null) {
			if (lod0FootPrint.isSetMultiSurface()) {
				calcBoundedBy(boundedBy, lod0FootPrint.getMultiSurface());
			} else {
				// xlink
			}
		}
		
		if (lod0RoofEdge != null) {
			if (lod0RoofEdge.isSetMultiSurface()) {
				calcBoundedBy(boundedBy, lod0RoofEdge.getMultiSurface());
			} else {
				// xlink
			}
		}
		
		SolidProperty solidProperty = null;
		for (int lod = 1; lod < 5; lod++) {
			switch (lod) {
			case 1:
				solidProperty = lod1Solid;
				break;
			case 2:
				solidProperty = lod2Solid;
				break;
			case 3:
				solidProperty = lod3Solid;
				break;
			case 4:
				solidProperty = lod4Solid;
				break;
			}
			
			if (solidProperty != null) {
				if (solidProperty.isSetSolid()) {
					calcBoundedBy(boundedBy, solidProperty.getSolid());
				} else {
					// xlink
				}
			}
		}
		
		MultiSurfaceProperty multiSurfaceProperty = null;
		for (int lod = 1; lod < 5; lod++) {
			switch (lod) {
			case 1:
				multiSurfaceProperty = lod1MultiSurface;
				break;
			case 2:
				multiSurfaceProperty = lod2MultiSurface;
				break;
			case 3:
				multiSurfaceProperty = lod3MultiSurface;
				break;
			case 4:
				multiSurfaceProperty = lod4MultiSurface;
				break;
			}
			
			if (multiSurfaceProperty != null) {
				if (multiSurfaceProperty.isSetMultiSurface()) {
					calcBoundedBy(boundedBy, multiSurfaceProperty.getMultiSurface());
				} else {
					// xlink
				}
			}
		}
		
		MultiCurveProperty multiCurveProperty = null;
		for (int lod = 2; lod < 5; lod++) {
			switch (lod) {
			case 2:
				multiCurveProperty = lod2MultiCurve;
				break;
			case 3:
				multiCurveProperty = lod3MultiCurve;
				break;
			case 4:
				multiCurveProperty = lod4MultiCurve;
				break;
			}
			
			if (multiCurveProperty != null) {
				if (multiCurveProperty.isSetMultiCurve()) {
					calcBoundedBy(boundedBy, multiCurveProperty.getMultiCurve());
				} else {
					// xlink
				}
			}
		}
		
		if (isSetBoundedBySurface()) {
			for (BoundarySurfaceProperty boundarySurfaceProperty : getBoundedBySurface()) {
				if (boundarySurfaceProperty.isSetObject()) {
					calcBoundedBy(boundedBy, boundarySurfaceProperty.getObject(), setBoundedBy);
				} else {
					// xlink?
				}
			}
		}

		if (isSetConsistsOfUndergroundPart()) {
			for (UndergroundPartProperty undergroundPartProperty : getConsistsOfUndergroundPart()) {
				if (undergroundPartProperty.isSetObject()) {
					calcBoundedBy(boundedBy, undergroundPartProperty.getObject(), setBoundedBy);
				} else {
					// xlink?
				}
			}
		}
		
		if (boundedBy.isSetEnvelope()) {
			if (setBoundedBy)
				setBoundedBy(boundedBy);

			return boundedBy;
		} else
			return null;
	}
	
	@Override
	public LodRepresentation getLodRepresentation() {
		LodRepresentation lodRepresentation = new LodRepresentation();
		
		if (lod0FootPrint != null)
			lodRepresentation.getLod0Geometry().add(lod0FootPrint);
		
		if (lod0RoofEdge != null)
			lodRepresentation.getLod0Geometry().add(lod0RoofEdge);
		
		GeometryProperty<? extends AbstractGeometry> property = null;		
		for (int lod = 1; lod < 5; lod++) {
			switch (lod) {
			case 1:
				property = lod1Solid;
				break;
			case 2:
				property = lod2Solid;
				break;
			case 3:
				property = lod3Solid;
				break;
			case 4:
				property = lod4Solid;
				break;
			}
			
			if (property != null)
				lodRepresentation.getLodGeometry(lod).add(property);
		}
		
		property = null;
		for (int lod = 1; lod < 5; lod++) {
			switch (lod) {
			case 1:
				property = lod1MultiSurface;
				break;
			case 2:
				property = lod2MultiSurface;
				break;
			case 3:
				property = lod3MultiSurface;
				break;
			case 4:
				property = lod4MultiSurface;
				break;
			}
			
			if (property != null)
				lodRepresentation.getLodGeometry(lod).add(property);
		}
		
		property = null;
		for (int lod = 2; lod < 5; lod++) {
			switch (lod) {
			case 2:
				property = lod2MultiCurve;
				break;
			case 3:
				property = lod3MultiCurve;
				break;
			case 4:
				property = lod3MultiCurve;
				break;
			}
			
			if (property != null)
				lodRepresentation.getLodGeometry(lod).add(property);
		}
		
		return lodRepresentation;
	}

	@Override
	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		if (target == null)
			throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");

		AbstractUnderground copy = (AbstractUnderground)target;		
		super.copyTo(copy, copyBuilder);
		
		if (isSetClazz())
			copy.setClazz((Code)copyBuilder.copy(clazz));

		if (isSetFunction()) {
			for (Code part : function) {
				Code copyPart = (Code)copyBuilder.copy(part);
				copy.addFunction(copyPart);

				if (part != null && copyPart == part)
					part.setParent(this);
			}
		}
		
		if (isSetUsage()) {
			for (Code part : usage) {
				Code copyPart = (Code)copyBuilder.copy(part);
				copy.addUsage(copyPart);

				if (part != null && copyPart == part)
					part.setParent(this);
			}
		}
		
		if (isSetLevel()) {
			copy.setLevel((Code)copyBuilder.copy(level));
			if (copy.getLevel() == level)
				lod1Solid.setParent(this);
		}
		
		if (isSetStartHeight()) {
			copy.setStartHeight((Length)copyBuilder.copy(startHeight));
			if (copy.getStartHeight() == startHeight)
				startHeight.setParent(this);
		}
		
		if (isSetCeilingHeight()) {
			copy.setCeilingHeight((Length)copyBuilder.copy(ceilingHeight));
			if (copy.getCeilingHeight() == ceilingHeight)
				ceilingHeight.setParent(this);
		}
		
		if (isSetArea()) {
			copy.setArea((Length)copyBuilder.copy(area));
			if (copy.getArea() == area)
				area.setParent(this);
		}
		
		if (isSetLod1Solid()) {
			copy.setLod1Solid((SolidProperty)copyBuilder.copy(lod1Solid));
			if (copy.getLod1Solid() == lod1Solid)
				lod1Solid.setParent(this);
		}
		
		if (isSetLod2Solid()) {
			copy.setLod2Solid((SolidProperty)copyBuilder.copy(lod2Solid));
			if (copy.getLod2Solid() == lod2Solid)
				lod2Solid.setParent(this);
		}
		
		if (isSetLod3Solid()) {
			copy.setLod3Solid((SolidProperty)copyBuilder.copy(lod3Solid));
			if (copy.getLod3Solid() == lod3Solid)
				lod3Solid.setParent(this);
		}
		
		if (isSetLod4Solid()) {
			copy.setLod4Solid((SolidProperty)copyBuilder.copy(lod4Solid));
			if (copy.getLod4Solid() == lod4Solid)
				lod4Solid.setParent(this);
		}
		
		if (isSetLod1TerrainIntersection()) {
			copy.setLod1TerrainIntersection((MultiCurveProperty)copyBuilder.copy(lod1TerrainIntersection));
			if (copy.getLod1TerrainIntersection() == lod1TerrainIntersection)
				lod1TerrainIntersection.setParent(this);
		}
		
		if (isSetLod2TerrainIntersection()) {
			copy.setLod2TerrainIntersection((MultiCurveProperty)copyBuilder.copy(lod2TerrainIntersection));
			if (copy.getLod2TerrainIntersection() == lod2TerrainIntersection)
				lod2TerrainIntersection.setParent(this);
		}
		
		if (isSetLod3TerrainIntersection()) {
			copy.setLod3TerrainIntersection((MultiCurveProperty)copyBuilder.copy(lod3TerrainIntersection));
			if (copy.getLod3TerrainIntersection() == lod3TerrainIntersection)
				lod3TerrainIntersection.setParent(this);
		}
		
		if (isSetLod4TerrainIntersection()) {
			copy.setLod4TerrainIntersection((MultiCurveProperty)copyBuilder.copy(lod4TerrainIntersection));
			if (copy.getLod4TerrainIntersection() == lod4TerrainIntersection)
				lod4TerrainIntersection.setParent(this);
		}
		
		if (isSetLod2MultiCurve()) {
			copy.setLod2MultiCurve((MultiCurveProperty)copyBuilder.copy(lod2MultiCurve));
			if (copy.getLod2MultiCurve() == lod2MultiCurve)
				lod2MultiCurve.setParent(this);
		}
		
		if (isSetLod3MultiCurve()) {
			copy.setLod3MultiCurve((MultiCurveProperty)copyBuilder.copy(lod3MultiCurve));
			if (copy.getLod3MultiCurve() == lod3MultiCurve)
				lod3MultiCurve.setParent(this);
		}
		
		if (isSetLod4MultiCurve()) {
			copy.setLod4MultiCurve((MultiCurveProperty)copyBuilder.copy(lod4MultiCurve));
			if (copy.getLod4MultiCurve() == lod4MultiCurve)
				lod4MultiCurve.setParent(this);
		}
		
		if (isSetLod0FootPrint()) {
			copy.setLod1MultiSurface((MultiSurfaceProperty)copyBuilder.copy(lod0FootPrint));
			if (copy.getLod1MultiSurface() == lod0FootPrint)
				lod0FootPrint.setParent(this);
		}
		
		if (isSetLod0RoofEdge()) {
			copy.setLod1MultiSurface((MultiSurfaceProperty)copyBuilder.copy(lod0RoofEdge));
			if (copy.getLod1MultiSurface() == lod0RoofEdge)
				lod0RoofEdge.setParent(this);
		}
		
		if (isSetLod1MultiSurface()) {
			copy.setLod1MultiSurface((MultiSurfaceProperty)copyBuilder.copy(lod1MultiSurface));
			if (copy.getLod1MultiSurface() == lod1MultiSurface)
				lod1MultiSurface.setParent(this);
		}
		
		if (isSetLod2MultiSurface()) {
			copy.setLod2MultiSurface((MultiSurfaceProperty)copyBuilder.copy(lod2MultiSurface));
			if (copy.getLod2MultiSurface() == lod2MultiSurface)
				lod2MultiSurface.setParent(this);
		}
		
		if (isSetLod3MultiSurface()) {
			copy.setLod3MultiSurface((MultiSurfaceProperty)copyBuilder.copy(lod3MultiSurface));
			if (copy.getLod3MultiSurface() == lod3MultiSurface)
				lod3MultiSurface.setParent(this);
		}
		
		if (isSetLod4MultiSurface()) {
			copy.setLod4MultiSurface((MultiSurfaceProperty)copyBuilder.copy(lod4MultiSurface));
			if (copy.getLod4MultiSurface() == lod4MultiSurface)
				lod4MultiSurface.setParent(this);
		}

		
		if (isSetBoundedBySurface()) {
			for (BoundarySurfaceProperty part : boundedBySurface) {
				BoundarySurfaceProperty copyPart = (BoundarySurfaceProperty)copyBuilder.copy(part);
				copy.addBoundedBySurface(copyPart);
				
				if (part != null && copyPart == part)
					part.setParent(this);
			}
		}
		
		
		if (isSetGenericApplicationPropertyOfAbstractUnderground()) {
			for (ADEComponent part : ade) {
				ADEComponent copyPart = (ADEComponent)copyBuilder.copy(part);
				copy.addGenericApplicationPropertyOfAbstractUnderground(copyPart);

				if (part != null && copyPart == part)
					part.setParent(this);
			}
		}
				
		return copy;
	}

}
