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
package org.citygml4j.builder.jaxb.unmarshal.citygml.underground;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import net.opengis.citygml.underground._2.AbstractBoundarySurfaceType;
import net.opengis.citygml.underground._2.AbstractUndergroundType;
import net.opengis.citygml.underground._2.BoundarySurfacePropertyType;
import net.opengis.citygml.underground._2.UndergroundPartPropertyType;
import net.opengis.citygml.underground._2.UndergroundPartType;
import net.opengis.citygml.underground._2.UndergroundType;
import net.opengis.citygml.underground._2.ClosureSurfaceType;
import net.opengis.citygml.underground._2.GroundSurfaceType;
import net.opengis.citygml.underground._2.RoofSurfaceType;
import net.opengis.citygml.underground._2.WallSurfaceType;
import net.opengis.gml.CodeType;

import org.citygml4j.builder.jaxb.unmarshal.JAXBUnmarshaller;
import org.citygml4j.builder.jaxb.unmarshal.citygml.CityGMLUnmarshaller;
import org.citygml4j.model.citygml.CityGML;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.underground.AbstractBoundarySurface;
import org.citygml4j.model.citygml.underground.AbstractUnderground;
import org.citygml4j.model.citygml.underground.BoundarySurfaceProperty;
import org.citygml4j.model.citygml.underground.Underground;
import org.citygml4j.model.citygml.underground.UndergroundPart;
import org.citygml4j.model.citygml.underground.UndergroundPartProperty;
import org.citygml4j.model.citygml.underground.ClosureSurface;
import org.citygml4j.model.citygml.underground.GroundSurface;
import org.citygml4j.model.citygml.underground.RoofSurface;
import org.citygml4j.model.citygml.underground.WallSurface;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.gml.xlink.XLinkActuate;
import org.citygml4j.model.gml.xlink.XLinkShow;
import org.citygml4j.model.gml.xlink.XLinkType;
import org.citygml4j.model.module.citygml.UndergroundModule;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

public class Underground200Unmarshaller {
	private final UndergroundModule module = UndergroundModule.v2_0_0;
	private final JAXBUnmarshaller jaxb;
	private final CityGMLUnmarshaller citygml;

	public Underground200Unmarshaller(CityGMLUnmarshaller citygml) {
		this.citygml = citygml;
		jaxb = citygml.getJAXBUnmarshaller();
	}

	public CityGML unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
		return unmarshal(src.getValue());
	}

	public CityGML unmarshal(Object src) throws MissingADESchemaException {
		if (src instanceof JAXBElement<?>)
			return unmarshal((JAXBElement<?>)src);
		
		CityGML dest = null;
		
		if (src instanceof BoundarySurfacePropertyType)
			dest = unmarshalBoundarySurfaceProperty((BoundarySurfacePropertyType)src);
		else if (src instanceof UndergroundType)
			dest = unmarshalUnderground((UndergroundType)src);		
		else if (src instanceof UndergroundPartType)
			dest = unmarshalUndergroundPart((UndergroundPartType)src);
		else if (src instanceof UndergroundPartPropertyType)
			dest = unmarshalUndergroundPartProperty((UndergroundPartPropertyType)src);
		else if (src instanceof ClosureSurfaceType)
			dest = unmarshalClosureSurface((ClosureSurfaceType)src);		
		else if (src instanceof GroundSurfaceType)
			dest = unmarshalGroundSurface((GroundSurfaceType)src);
		else if (src instanceof RoofSurfaceType)
			dest = unmarshalRoofSurface((RoofSurfaceType)src);	
		else if (src instanceof WallSurfaceType)
			dest = unmarshalWallSurface((WallSurfaceType)src);
		
		return dest;
	}

	public void unmarshalAbstractUnderground(AbstractUndergroundType src, AbstractUnderground dest) throws MissingADESchemaException {
		citygml.getCore200Unmarshaller().unmarshalAbstractSite(src, dest);
		
		if (src.isSetClazz())
			dest.setClazz(jaxb.getGMLUnmarshaller().unmarshalCode(src.getClazz()));

		if (src.isSetFunction()) {
			for (CodeType function : src.getFunction())
				dest.addFunction(jaxb.getGMLUnmarshaller().unmarshalCode(function));
		}

		if (src.isSetUsage()) {
			for (CodeType usage : src.getUsage())
				dest.addUsage(jaxb.getGMLUnmarshaller().unmarshalCode(usage));
		}
		
		if (src.isSetLevel()) {
			dest.setLevel(jaxb.getGMLUnmarshaller().unmarshalCode(src.getLevel()));
		}
		
		if (src.isSetStartHeight())
			dest.setStartHeight(jaxb.getGMLUnmarshaller().unmarshalLength(src.getStartHeight()));
		
		if (src.isSetCeilingHeight())
			dest.setCeilingHeight(jaxb.getGMLUnmarshaller().unmarshalLength(src.getCeilingHeight()));
		
		if (src.isSetArea())
			dest.setArea(jaxb.getGMLUnmarshaller().unmarshalLength(src.getArea()));
		
		if (src.isSetLod1Solid())
			dest.setLod1Solid(jaxb.getGMLUnmarshaller().unmarshalSolidProperty(src.getLod1Solid()));
		
		if (src.isSetLod2Solid())
			dest.setLod2Solid(jaxb.getGMLUnmarshaller().unmarshalSolidProperty(src.getLod2Solid()));
		
		if (src.isSetLod3Solid())
			dest.setLod3Solid(jaxb.getGMLUnmarshaller().unmarshalSolidProperty(src.getLod3Solid()));
		
		if (src.isSetLod4Solid())
			dest.setLod4Solid(jaxb.getGMLUnmarshaller().unmarshalSolidProperty(src.getLod4Solid()));
		
		if (src.isSetLod1MultiSurface())
			dest.setLod1MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod1MultiSurface()));
		
		if (src.isSetLod2MultiSurface())
			dest.setLod2MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod2MultiSurface()));
		
		if (src.isSetLod3MultiSurface())
			dest.setLod3MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod3MultiSurface()));
		
		if (src.isSetLod4MultiSurface())
			dest.setLod4MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod4MultiSurface()));
		
		if (src.isSetLod1TerrainIntersection())
			dest.setLod1TerrainIntersection(jaxb.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod1TerrainIntersection()));
		
		if (src.isSetLod2TerrainIntersection())
			dest.setLod2TerrainIntersection(jaxb.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod2TerrainIntersection()));
		
		if (src.isSetLod3TerrainIntersection())
			dest.setLod3TerrainIntersection(jaxb.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod3TerrainIntersection()));
		
		if (src.isSetLod4TerrainIntersection())
			dest.setLod4TerrainIntersection(jaxb.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod4TerrainIntersection()));
		
		if (src.isSetLod2MultiCurve())
			dest.setLod2MultiCurve(jaxb.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod2MultiCurve()));
		
		if (src.isSetLod3MultiCurve())
			dest.setLod3MultiCurve(jaxb.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod3MultiCurve()));
		
		if (src.isSetLod4MultiCurve())
			dest.setLod4MultiCurve(jaxb.getGMLUnmarshaller().unmarshalMultiCurveProperty(src.getLod4MultiCurve()));	
		
		if (src.isSetLod0FootPrint())
			dest.setLod0FootPrint(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod0FootPrint()));
		
		if (src.isSetLod0RoofEdge())
			dest.setLod0RoofEdge(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod0RoofEdge()));
		
		if (src.isSetBoundedBySurface()) {
			for (BoundarySurfacePropertyType boundarySurfaceProperty : src.getBoundedBySurface())
				dest.addBoundedBySurface(unmarshalBoundarySurfaceProperty(boundarySurfaceProperty));
		}
		
		if (src.isSetConsistsOfUndergroundPart()) {
			for (UndergroundPartPropertyType undergroundPartProperty : src.getConsistsOfUndergroundPart())
				dest.addConsistsOfUndergroundPart(unmarshalUndergroundPartProperty(undergroundPartProperty));
		}
		
	}
	
	public void unmarshalAbstractBoundarySurface(AbstractBoundarySurfaceType src, AbstractBoundarySurface dest) throws MissingADESchemaException {
		citygml.getCore200Unmarshaller().unmarshalAbstractCityObject(src, dest);

		if (src.isSetLod2MultiSurface())
			dest.setLod2MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod2MultiSurface()));

		if (src.isSetLod3MultiSurface())
			dest.setLod3MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod3MultiSurface()));

		if (src.isSetLod4MultiSurface())
			dest.setLod4MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod4MultiSurface()));

	}
	
	public BoundarySurfaceProperty unmarshalBoundarySurfaceProperty(BoundarySurfacePropertyType src) throws MissingADESchemaException {
		BoundarySurfaceProperty dest = new BoundarySurfaceProperty(module);

		if (src.isSet_BoundarySurface()) {
			ModelObject object = jaxb.unmarshal(src.get_BoundarySurface());
			if (object instanceof AbstractBoundarySurface)
				dest.setObject((AbstractBoundarySurface)object);
		}
		
		if (src.isSet_ADEComponent())
			dest.setGenericADEComponent(jaxb.getADEUnmarshaller().unmarshal(src.get_ADEComponent()));

		if (src.isSetRemoteSchema())
			dest.setRemoteSchema(src.getRemoteSchema());

		if (src.isSetType())
			dest.setType(XLinkType.fromValue(src.getType().value()));

		if (src.isSetHref())
			dest.setHref(src.getHref());

		if (src.isSetRole())
			dest.setRole(src.getRole());

		if (src.isSetArcrole())
			dest.setArcrole(src.getArcrole());

		if (src.isSetTitle())
			dest.setTitle(src.getTitle());

		if (src.isSetShow())
			dest.setShow(XLinkShow.fromValue(src.getShow().value()));

		if (src.isSetActuate())
			dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
		
		return dest;
	}

	public void unmarshalUnderground(UndergroundType src, Underground dest) throws MissingADESchemaException {
		unmarshalAbstractUnderground(src, dest);
	}

	public Underground unmarshalUnderground(UndergroundType src) throws MissingADESchemaException {
		Underground dest = new Underground(module);
		unmarshalUnderground(src, dest);

		return dest;
	}

	public void unmarshalUndergroundPart(UndergroundPartType src, UndergroundPart dest) throws MissingADESchemaException {
		unmarshalAbstractUnderground(src, dest);
	}

	public UndergroundPart unmarshalUndergroundPart(UndergroundPartType src) throws MissingADESchemaException {
		UndergroundPart dest = new UndergroundPart(module);
		unmarshalUndergroundPart(src, dest);

		return dest;
	}

	public UndergroundPartProperty unmarshalUndergroundPartProperty(UndergroundPartPropertyType src) throws MissingADESchemaException {
		UndergroundPartProperty dest = new UndergroundPartProperty(module);

		if (src.isSetUndergroundPart())
			dest.setUndergroundPart(unmarshalUndergroundPart(src.getUndergroundPart()));
		
		if (src.isSet_ADEComponent())
			dest.setGenericADEComponent(jaxb.getADEUnmarshaller().unmarshal(src.get_ADEComponent()));

		if (src.isSetRemoteSchema())
			dest.setRemoteSchema(src.getRemoteSchema());

		if (src.isSetType())
			dest.setType(XLinkType.fromValue(src.getType().value()));

		if (src.isSetHref())
			dest.setHref(src.getHref());

		if (src.isSetRole())
			dest.setRole(src.getRole());

		if (src.isSetArcrole())
			dest.setArcrole(src.getArcrole());

		if (src.isSetTitle())
			dest.setTitle(src.getTitle());

		if (src.isSetShow())
			dest.setShow(XLinkShow.fromValue(src.getShow().value()));

		if (src.isSetActuate())
			dest.setActuate(XLinkActuate.fromValue(src.getActuate().value()));
		
		return dest;
	}

	public void unmarshalClosureSurface(ClosureSurfaceType src, ClosureSurface dest) throws MissingADESchemaException {
		unmarshalAbstractBoundarySurface(src, dest);
	}

	public ClosureSurface unmarshalClosureSurface(ClosureSurfaceType src) throws MissingADESchemaException {
		ClosureSurface dest = new ClosureSurface(module);
		unmarshalClosureSurface(src, dest);

		return dest;
	}

	public void unmarshalGroundSurface(GroundSurfaceType src, GroundSurface dest) throws MissingADESchemaException {
		unmarshalAbstractBoundarySurface(src, dest);
	}

	public GroundSurface unmarshalGroundSurface(GroundSurfaceType src) throws MissingADESchemaException {
		GroundSurface dest = new GroundSurface(module);
		unmarshalGroundSurface(src, dest);

		return dest;
	}


	public void unmarshalRoofSurface(RoofSurfaceType src, RoofSurface dest) throws MissingADESchemaException {
		unmarshalAbstractBoundarySurface(src, dest);
	}

	public RoofSurface unmarshalRoofSurface(RoofSurfaceType src) throws MissingADESchemaException {
		RoofSurface dest = new RoofSurface(module);
		unmarshalRoofSurface(src, dest);

		return dest;
	}

	public void unmarshalWallSurface(WallSurfaceType src, WallSurface dest) throws MissingADESchemaException {
		unmarshalAbstractBoundarySurface(src, dest);
	}

	public WallSurface unmarshalWallSurface(WallSurfaceType src) throws MissingADESchemaException {
		WallSurface dest = new WallSurface(module);
		unmarshalWallSurface(src, dest);

		return dest;
	}
	
	public boolean assignGenericProperty(ADEComponent genericProperty, QName substitutionGroup, CityGML dest) {
		String name = substitutionGroup.getLocalPart();
		boolean success = true;
		
		if (dest instanceof AbstractUnderground && name.equals("_GenericApplicationPropertyOfAbstractUnderground"))
			((AbstractUnderground)dest).addGenericApplicationPropertyOfAbstractUnderground(genericProperty);
		else if (dest instanceof Underground && name.equals("_GenericApplicationPropertyOfUnderground"))
			((Underground)dest).addGenericApplicationPropertyOfUnderground(genericProperty);
		else if (dest instanceof UndergroundPart && name.equals("_GenericApplicationPropertyOfBuildingPart"))
			((UndergroundPart)dest).addGenericApplicationPropertyOfUndergroundPart(genericProperty);
		else if (dest instanceof AbstractBoundarySurface && name.equals("_GenericApplicationPropertyOfBoundarySurface"))
			((AbstractBoundarySurface)dest).addGenericApplicationPropertyOfBoundarySurface(genericProperty);
		else if (dest instanceof ClosureSurface && name.equals("_GenericApplicationPropertyOfClosureSurface"))
			((ClosureSurface)dest).addGenericApplicationPropertyOfClosureSurface(genericProperty);
		else if (dest instanceof GroundSurface && name.equals("_GenericApplicationPropertyOfGroundSurface"))
			((GroundSurface)dest).addGenericApplicationPropertyOfGroundSurface(genericProperty);
		else if (dest instanceof RoofSurface && name.equals("_GenericApplicationPropertyOfRoofSurface"))
			((RoofSurface)dest).addGenericApplicationPropertyOfRoofSurface(genericProperty);
		else if (dest instanceof WallSurface && name.equals("_GenericApplicationPropertyOfWallSurface"))
			((WallSurface)dest).addGenericApplicationPropertyOfWallSurface(genericProperty);
		else 
			success = false;
		
		return success;
	}
	
}
