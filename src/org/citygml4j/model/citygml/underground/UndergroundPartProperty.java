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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.common.base.ModelType;
import org.citygml4j.model.gml.feature.FeatureProperty;
import org.citygml4j.model.module.citygml.UndergroundModule;

public class UndergroundPartProperty extends FeatureProperty<UndergroundPart> implements UndergroundModuleComponent {
	private UndergroundModule module;
	
	public UndergroundPartProperty() {
		
	}
	
	public UndergroundPartProperty(UndergroundPart undergroundPart) {
		super(undergroundPart);
	}
	
	public UndergroundPartProperty(String href) {
		super(href);
	}
	
	public UndergroundPartProperty(UndergroundModule module) {
		this.module = module;
	}
	
	public UndergroundPart getUndergroundPart() {
		return super.getObject();
	}

	public boolean isSetUndergroundPart() {
		return super.isSetObject();
	}

	public void setUndergroundPart(UndergroundPart undergroundPart) {
		super.setObject(undergroundPart);
	}

	public void unsetUndergroundPart() {
		super.unsetObject();
	}

	@Override
	public ModelType getModelType() {
		return ModelType.CITYGML;
	}

	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.UNDERGROUND_PART_PROPERTY;
	}

	public final UndergroundModule getCityGMLModule() {
		return module;
	}

	public boolean isSetCityGMLModule() {
		return module != null;
	}

	@Override
	public Class<UndergroundPart> getAssociableClass() {
		return UndergroundPart.class;
	}

	public Object copy(CopyBuilder copyBuilder) {
		return copyTo(new UndergroundPartProperty(), copyBuilder);
	}

	@Override
	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		UndergroundPartProperty copy = (target == null) ? new UndergroundPartProperty() : (UndergroundPartProperty)target;
		return super.copyTo(copy, copyBuilder);
	}

}
