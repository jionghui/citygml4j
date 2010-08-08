package org.citygml4j.model.gml;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.Copyable;
import org.citygml4j.commons.child.Child;
import org.w3c.dom.Element;

public class GenericValueObject implements Child, Copyable {
	private Element content;
	private Object parent;
	
	public GenericValueObject() {
		
	}
	
	public GenericValueObject(Element content) {
		this.content = content;
	}
	
	public Element getContent() {
		return content;
	}
	
	public boolean isSetContent() {
		return content != null;
	}
	
	public void setContent(Element content) {
		this.content = content;
	}
	
	public void unsetContent() {
		content = null;
	}

	public String getLocalName() {
		return isSetContent() ? content.getLocalName() : null;
	}
	
	public String getPrefix() {
		return isSetContent() ? content.getPrefix() : null;
	}
	
	public String getNamespaceURI() {
		return isSetContent() ? content.getNamespaceURI() : null;
	}

	public Object getParent() {
		return parent;
	}

	public void setParent(Object parent) {
		this.parent = parent;
	}

	public boolean isSetParent() {
		return parent != null;
	}

	public void unsetParent() {
		parent = null;
	}

	public Object copy(CopyBuilder copyBuilder) {
		return copyTo(new GenericValueObject(), copyBuilder);
	}

	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		GenericValueObject copy = (target == null) ? new GenericValueObject() : (GenericValueObject)target;

		if (isSetContent())
			copy.setContent((Element)copyBuilder.copy(content));		
		
		copy.unsetParent();
		
		return copy;
	}

}