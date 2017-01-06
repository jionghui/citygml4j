
package net.opengis.citygml.underground._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosureSurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClosureSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/underground/2.0}AbstractBoundarySurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/citygml/underground/2.0}_GenericApplicationPropertyOfClosureSurface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosureSurfaceType", propOrder = {
    "_GenericApplicationPropertyOfClosureSurface"
})
public class ClosureSurfaceType
    extends AbstractBoundarySurfaceType
{

    protected List<Object> _GenericApplicationPropertyOfClosureSurface;

    /**
     * Gets the value of the genericApplicationPropertyOfClosureSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfClosureSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfClosureSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfClosureSurface() {
        if (_GenericApplicationPropertyOfClosureSurface == null) {
            _GenericApplicationPropertyOfClosureSurface = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfClosureSurface;
    }

    public boolean isSet_GenericApplicationPropertyOfClosureSurface() {
        return ((this._GenericApplicationPropertyOfClosureSurface!= null)&&(!this._GenericApplicationPropertyOfClosureSurface.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfClosureSurface() {
        this._GenericApplicationPropertyOfClosureSurface = null;
    }

}
