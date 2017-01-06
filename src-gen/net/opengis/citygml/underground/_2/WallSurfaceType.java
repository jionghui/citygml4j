
package net.opengis.citygml.underground._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WallSurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WallSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/underground/2.0}AbstractBoundarySurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/citygml/underground/2.0}_GenericApplicationPropertyOfWallSurface" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WallSurfaceType", propOrder = {
    "_GenericApplicationPropertyOfWallSurface"
})
public class WallSurfaceType
    extends AbstractBoundarySurfaceType
{

    protected List<Object> _GenericApplicationPropertyOfWallSurface;

    /**
     * Gets the value of the genericApplicationPropertyOfWallSurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfWallSurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfWallSurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfWallSurface() {
        if (_GenericApplicationPropertyOfWallSurface == null) {
            _GenericApplicationPropertyOfWallSurface = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfWallSurface;
    }

    public boolean isSet_GenericApplicationPropertyOfWallSurface() {
        return ((this._GenericApplicationPropertyOfWallSurface!= null)&&(!this._GenericApplicationPropertyOfWallSurface.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfWallSurface() {
        this._GenericApplicationPropertyOfWallSurface = null;
    }

}
