
package net.opengis.citygml.underground._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndergroundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndergroundType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/underground/2.0}AbstractUndergroundType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/citygml/underground/2.0}_GenericApplicationPropertyOfUnderground" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndergroundType", propOrder = {
    "_GenericApplicationPropertyOfUnderground"
})
public class UndergroundType
    extends AbstractUndergroundType
{

    protected List<Object> _GenericApplicationPropertyOfUnderground;

    /**
     * Gets the value of the genericApplicationPropertyOfUnderground property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfUnderground property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfUnderground().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfUnderground() {
        if (_GenericApplicationPropertyOfUnderground == null) {
            _GenericApplicationPropertyOfUnderground = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfUnderground;
    }

    public boolean isSet_GenericApplicationPropertyOfUnderground() {
        return ((this._GenericApplicationPropertyOfUnderground!= null)&&(!this._GenericApplicationPropertyOfUnderground.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfUnderground() {
        this._GenericApplicationPropertyOfUnderground = null;
    }

}
