//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.10 um 09:13:50 PM CEST 
//


package net.opengis.citygml.appearance._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Specialization for standard 2D textures. "target" provides the linking to surface geometry. Only
 * 				gml:MultiSurface and decendants of gml:AbstractSurfaceType are valid targets. As property of the link, a texture
 * 				parameterization either as set of texture coordinates or transformation matrix is given. 
 * 
 * <p>Java-Klasse für ParameterizedTextureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ParameterizedTextureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/appearance/2.0}AbstractTextureType">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://www.opengis.net/citygml/appearance/2.0}TextureAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/citygml/appearance/2.0}_GenericApplicationPropertyOfParameterizedTexture" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterizedTextureType", propOrder = {
    "target",
    "_GenericApplicationPropertyOfParameterizedTexture"
})
public class ParameterizedTextureType
    extends AbstractTextureType
{

    protected List<TextureAssociationType> target;
    @XmlElementRef(name = "_GenericApplicationPropertyOfParameterizedTexture", namespace = "http://www.opengis.net/citygml/appearance/2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> _GenericApplicationPropertyOfParameterizedTexture;

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextureAssociationType }
     * 
     * 
     */
    public List<TextureAssociationType> getTarget() {
        if (target == null) {
            target = new ArrayList<TextureAssociationType>();
        }
        return this.target;
    }

    public boolean isSetTarget() {
        return ((this.target!= null)&&(!this.target.isEmpty()));
    }

    public void unsetTarget() {
        this.target = null;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfParameterizedTexture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfParameterizedTexture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfParameterizedTexture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> get_GenericApplicationPropertyOfParameterizedTexture() {
        if (_GenericApplicationPropertyOfParameterizedTexture == null) {
            _GenericApplicationPropertyOfParameterizedTexture = new ArrayList<JAXBElement<Object>>();
        }
        return this._GenericApplicationPropertyOfParameterizedTexture;
    }

    public boolean isSet_GenericApplicationPropertyOfParameterizedTexture() {
        return ((this._GenericApplicationPropertyOfParameterizedTexture!= null)&&(!this._GenericApplicationPropertyOfParameterizedTexture.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfParameterizedTexture() {
        this._GenericApplicationPropertyOfParameterizedTexture = null;
    }

    public void setTarget(List<TextureAssociationType> value) {
        this.target = value;
    }

    public void set_GenericApplicationPropertyOfParameterizedTexture(List<JAXBElement<Object>> value) {
        this._GenericApplicationPropertyOfParameterizedTexture = value;
    }

}
