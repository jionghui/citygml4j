
package net.opengis.citygml.underground._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndergroundPartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UndergroundPartType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/underground/2.0}AbstractUndergroundType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/citygml/underground/2.0}_GenericApplicationPropertyOfUndergroundPart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndergroundPartType", propOrder = {
    "_GenericApplicationPropertyOfUndergroundPart"
})
public class UndergroundPartType
    extends AbstractUndergroundType
{

    protected List<Object> _GenericApplicationPropertyOfUndergroundPart;

    /**
     * Gets the value of the genericApplicationPropertyOfUndergroundPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfUndergroundPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfUndergroundPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfUndergroundPart() {
        if (_GenericApplicationPropertyOfUndergroundPart == null) {
            _GenericApplicationPropertyOfUndergroundPart = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfUndergroundPart;
    }

    public boolean isSet_GenericApplicationPropertyOfUndergroundPart() {
        return ((this._GenericApplicationPropertyOfUndergroundPart!= null)&&(!this._GenericApplicationPropertyOfUndergroundPart.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfUndergroundPart() {
        this._GenericApplicationPropertyOfUndergroundPart = null;
    }

}
