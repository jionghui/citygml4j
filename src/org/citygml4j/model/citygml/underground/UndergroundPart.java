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

import java.util.List;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.common.child.ChildList;
import org.citygml4j.model.common.visitor.FeatureFunctor;
import org.citygml4j.model.common.visitor.FeatureVisitor;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.module.citygml.UndergroundModule;

public class UndergroundPart extends AbstractUnderground {
	private List<ADEComponent> ade;

	public UndergroundPart() {

	}

	public UndergroundPart(UndergroundModule module) {
		super(module);
	}

	public void addGenericApplicationPropertyOfUndergroundPart(ADEComponent ade) {
		if (this.ade == null)
			this.ade = new ChildList<ADEComponent>(this);

		this.ade.add(ade);
	}

	public List<ADEComponent> getGenericApplicationPropertyOfUndergroundPart() {
		if (ade == null)
			ade = new ChildList<ADEComponent>(this);

		return ade;
	}

	public boolean isSetGenericApplicationPropertyOfUndergroundPart() {
		return ade != null && !ade.isEmpty();
	}

	public void setGenericApplicationPropertyOfUndergroundPart(List<ADEComponent> ade) {
		this.ade = new ChildList<ADEComponent>(this, ade);
	}

	public void unsetGenericApplicationPropertyOfUndergroundPart() {
		if (isSetGenericApplicationPropertyOfUndergroundPart())
			ade.clear();

		ade = null;
	}

	public boolean unsetGenericApplicationPropertyOfUndergroundPart(ADEComponent ade) {
		return isSetGenericApplicationPropertyOfUndergroundPart() ? this.ade.remove(ade) : false;
	}

	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.UNDERGROUND_PART;
	}

	public Object copy(CopyBuilder copyBuilder) {
		return copyTo(new UndergroundPart(), copyBuilder);
	}

	@Override
	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		AbstractUnderground copy = (target == null) ? new UndergroundPart() : (AbstractUnderground)target;
		super.copyTo(copy, copyBuilder);

		if (copy.getCityGMLClass() == CityGMLClass.UNDERGROUND_PART) {
			if (isSetGenericApplicationPropertyOfUndergroundPart()) {
				for (ADEComponent part : ade) {
					ADEComponent copyPart = (ADEComponent)copyBuilder.copy(part);
					((UndergroundPart)copy).addGenericApplicationPropertyOfUndergroundPart(copyPart);

					if (part != null && copyPart == part)
						part.setParent(this);
				}
			}
		}

		return copy;
	}

	public void accept(FeatureVisitor visitor) {
		visitor.visit(this);
	}

	public <T> T accept(FeatureFunctor<T> visitor) {
		return visitor.apply(this);
	}

	public void accept(GMLVisitor visitor) {
		visitor.visit(this);
	}

	public <T> T accept(GMLFunctor<T> visitor) {
		return visitor.apply(this);
	}

}
