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
package org.citygml4j.model.gml.base;

import java.util.List;

import org.citygml4j.model.gml.GML;
import org.citygml4j.model.gml.basicTypes.Code;

public interface StandardObjectProperties extends GML {
	public List<Code> getName();
	public StringOrRef getDescription();
	public List<MetaDataProperty> getMetaDataProperty();
	public boolean isSetName();
	public boolean isSetDescription();
	public boolean isSetMetaDataProperty();

	public void addName(Code name);
	public void setName(List<Code> name);
	public void setDescription(StringOrRef description);
	public void addMetaDataProperty(MetaDataProperty metaDataProperty);
	public void setMetaDataProperty(List<MetaDataProperty> metaDataProperty);
	public void unsetName();
	public boolean unsetName(Code name);
	public void unsetDescription();
	public void unsetMetaDataProperty();
	public boolean unsetMetaDataProperty(MetaDataProperty metaDataProperty);
}
