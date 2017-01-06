
package net.opengis.citygml.underground._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.citygml._2.AbstractSiteType;
import net.opengis.gml.CodeType;
import net.opengis.gml.LengthType;
import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.SolidPropertyType;


/**
 * Type describing the thematic and geometric attributes and the associations of buildings. It is an abstract
 * 				type, only its subclasses Building and BuildingPart can be instantiated. An _AbstractBuilding may consist of
 * 				BuildingParts, which are again _AbstractBuildings by inheritance. Thus an aggregation hierarchy between _AbstractBuildings
 * 				of arbitrary depth may be specified. In such an hierarchy, top elements are Buildings, while all other elements are
 * 				BuildingParts. Each element of such a hierarchy may have all attributes and geometries of _AbstractBuildings. It must,
 * 				however, be assured than no inconsistencies occur (for example, if the geometry of a Building does not correspond to the
 * 				geometries of its parts, or if the roof type of a Building is saddle roof, while its parts have an hip roof). As subclass
 * 				of _CityObject, an _AbstractBuilding inherits all attributes and relations, in particular an id, names, external
 * 				references, and generalization relations. 
 * 
 * <p>Java class for AbstractUndergroundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractUndergroundType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/citygml/2.0}AbstractSiteType">
 *       &lt;sequence>
 *         &lt;element name="class" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="function" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.opengis.net/gml}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="yearOfConstruction" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="yearOfDemolition" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.opengis.net/gml}CodeType" minOccurs="0"/>
 *         &lt;element name="startHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/>
 *         &lt;element name="ceilingHeight" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/>
 *         &lt;element name="area" type="{http://www.opengis.net/gml}LengthType" minOccurs="0"/>
 *         &lt;element name="lod0FootPrint" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod0RoofEdge" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod1Solid" type="{http://www.opengis.net/gml}SolidPropertyType" minOccurs="0"/>
 *         &lt;element name="lod1MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod1TerrainIntersection" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/>
 *         &lt;element name="lod2Solid" type="{http://www.opengis.net/gml}SolidPropertyType" minOccurs="0"/>
 *         &lt;element name="lod2MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod2MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/>
 *         &lt;element name="lod2TerrainIntersection" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/>
 *         &lt;element name="boundedBy" type="{http://www.opengis.net/citygml/underground/2.0}BoundarySurfacePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lod3Solid" type="{http://www.opengis.net/gml}SolidPropertyType" minOccurs="0"/>
 *         &lt;element name="lod3MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod3MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/>
 *         &lt;element name="lod3TerrainIntersection" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/>
 *         &lt;element name="lod4Solid" type="{http://www.opengis.net/gml}SolidPropertyType" minOccurs="0"/>
 *         &lt;element name="lod4MultiSurface" type="{http://www.opengis.net/gml}MultiSurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="lod4MultiCurve" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/>
 *         &lt;element name="lod4TerrainIntersection" type="{http://www.opengis.net/gml}MultiCurvePropertyType" minOccurs="0"/>
 *         &lt;element name="consistsOfUndergroundPart" type="{http://www.opengis.net/citygml/underground/2.0}UndergroundPartPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/citygml/underground/2.0}_GenericApplicationPropertyOfAbstractUnderground" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractUndergroundType", propOrder = {
    "clazz",
    "function",
    "usage",
    "yearOfConstruction",
    "yearOfDemolition",
    "level",
    "startHeight",
    "ceilingHeight",
    "area",
    "lod0FootPrint",
    "lod0RoofEdge",
    "lod1Solid",
    "lod1MultiSurface",
    "lod1TerrainIntersection",
    "lod2Solid",
    "lod2MultiSurface",
    "lod2MultiCurve",
    "lod2TerrainIntersection",
    "boundedBySurface",
    "lod3Solid",
    "lod3MultiSurface",
    "lod3MultiCurve",
    "lod3TerrainIntersection",
    "lod4Solid",
    "lod4MultiSurface",
    "lod4MultiCurve",
    "lod4TerrainIntersection",
    "consistsOfUndergroundPart",
    "_GenericApplicationPropertyOfAbstractUnderground"
})
@XmlSeeAlso({
    UndergroundType.class,
    UndergroundPartType.class
})
public abstract class AbstractUndergroundType
    extends AbstractSiteType
{

    @XmlElement(name = "class")
    protected CodeType clazz;
    protected List<CodeType> function;
    protected List<CodeType> usage;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfConstruction;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar yearOfDemolition;
    protected CodeType level;
    protected LengthType startHeight;
    protected LengthType ceilingHeight;
    protected LengthType area;
    protected MultiSurfacePropertyType lod0FootPrint;
    protected MultiSurfacePropertyType lod0RoofEdge;
    protected SolidPropertyType lod1Solid;
    protected MultiSurfacePropertyType lod1MultiSurface;
    protected MultiCurvePropertyType lod1TerrainIntersection;
    protected SolidPropertyType lod2Solid;
    protected MultiSurfacePropertyType lod2MultiSurface;
    protected MultiCurvePropertyType lod2MultiCurve;
    protected MultiCurvePropertyType lod2TerrainIntersection;
    @XmlElement(name = "boundedBy")
    protected List<BoundarySurfacePropertyType> boundedBySurface;
    protected SolidPropertyType lod3Solid;
    protected MultiSurfacePropertyType lod3MultiSurface;
    protected MultiCurvePropertyType lod3MultiCurve;
    protected MultiCurvePropertyType lod3TerrainIntersection;
    protected SolidPropertyType lod4Solid;
    protected MultiSurfacePropertyType lod4MultiSurface;
    protected MultiCurvePropertyType lod4MultiCurve;
    protected MultiCurvePropertyType lod4TerrainIntersection;
    protected List<UndergroundPartPropertyType> consistsOfUndergroundPart;
    protected List<Object> _GenericApplicationPropertyOfAbstractUnderground;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClazz(CodeType value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
    }

    /**
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFunction() {
        if (function == null) {
            function = new ArrayList<CodeType>();
        }
        return this.function;
    }

    public boolean isSetFunction() {
        return ((this.function!= null)&&(!this.function.isEmpty()));
    }

    public void unsetFunction() {
        this.function = null;
    }

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<CodeType>();
        }
        return this.usage;
    }

    public boolean isSetUsage() {
        return ((this.usage!= null)&&(!this.usage.isEmpty()));
    }

    public void unsetUsage() {
        this.usage = null;
    }

    /**
     * Gets the value of the yearOfConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfConstruction() {
        return yearOfConstruction;
    }

    /**
     * Sets the value of the yearOfConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfConstruction(XMLGregorianCalendar value) {
        this.yearOfConstruction = value;
    }

    public boolean isSetYearOfConstruction() {
        return (this.yearOfConstruction!= null);
    }

    /**
     * Gets the value of the yearOfDemolition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYearOfDemolition() {
        return yearOfDemolition;
    }

    /**
     * Sets the value of the yearOfDemolition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYearOfDemolition(XMLGregorianCalendar value) {
        this.yearOfDemolition = value;
    }

    public boolean isSetYearOfDemolition() {
        return (this.yearOfDemolition!= null);
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLevel(CodeType value) {
        this.level = value;
    }

    public boolean isSetLevel() {
        return (this.level!= null);
    }

    /**
     * Gets the value of the startHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getStartHeight() {
        return startHeight;
    }

    /**
     * Sets the value of the startHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setStartHeight(LengthType value) {
        this.startHeight = value;
    }

    public boolean isSetStartHeight() {
        return (this.startHeight!= null);
    }

    /**
     * Gets the value of the ceilingHeight property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getCeilingHeight() {
        return ceilingHeight;
    }

    /**
     * Sets the value of the ceilingHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setCeilingHeight(LengthType value) {
        this.ceilingHeight = value;
    }

    public boolean isSetCeilingHeight() {
        return (this.ceilingHeight!= null);
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setArea(LengthType value) {
        this.area = value;
    }

    public boolean isSetArea() {
        return (this.area!= null);
    }

    /**
     * Gets the value of the lod0FootPrint property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod0FootPrint() {
        return lod0FootPrint;
    }

    /**
     * Sets the value of the lod0FootPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod0FootPrint(MultiSurfacePropertyType value) {
        this.lod0FootPrint = value;
    }

    public boolean isSetLod0FootPrint() {
        return (this.lod0FootPrint!= null);
    }

    /**
     * Gets the value of the lod0RoofEdge property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod0RoofEdge() {
        return lod0RoofEdge;
    }

    /**
     * Sets the value of the lod0RoofEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod0RoofEdge(MultiSurfacePropertyType value) {
        this.lod0RoofEdge = value;
    }

    public boolean isSetLod0RoofEdge() {
        return (this.lod0RoofEdge!= null);
    }

    /**
     * Gets the value of the lod1Solid property.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getLod1Solid() {
        return lod1Solid;
    }

    /**
     * Sets the value of the lod1Solid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setLod1Solid(SolidPropertyType value) {
        this.lod1Solid = value;
    }

    public boolean isSetLod1Solid() {
        return (this.lod1Solid!= null);
    }

    /**
     * Gets the value of the lod1MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod1MultiSurface() {
        return lod1MultiSurface;
    }

    /**
     * Sets the value of the lod1MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod1MultiSurface(MultiSurfacePropertyType value) {
        this.lod1MultiSurface = value;
    }

    public boolean isSetLod1MultiSurface() {
        return (this.lod1MultiSurface!= null);
    }

    /**
     * Gets the value of the lod1TerrainIntersection property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod1TerrainIntersection() {
        return lod1TerrainIntersection;
    }

    /**
     * Sets the value of the lod1TerrainIntersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod1TerrainIntersection(MultiCurvePropertyType value) {
        this.lod1TerrainIntersection = value;
    }

    public boolean isSetLod1TerrainIntersection() {
        return (this.lod1TerrainIntersection!= null);
    }

    /**
     * Gets the value of the lod2Solid property.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getLod2Solid() {
        return lod2Solid;
    }

    /**
     * Sets the value of the lod2Solid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setLod2Solid(SolidPropertyType value) {
        this.lod2Solid = value;
    }

    public boolean isSetLod2Solid() {
        return (this.lod2Solid!= null);
    }

    /**
     * Gets the value of the lod2MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod2MultiSurface() {
        return lod2MultiSurface;
    }

    /**
     * Sets the value of the lod2MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod2MultiSurface(MultiSurfacePropertyType value) {
        this.lod2MultiSurface = value;
    }

    public boolean isSetLod2MultiSurface() {
        return (this.lod2MultiSurface!= null);
    }

    /**
     * Gets the value of the lod2MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod2MultiCurve() {
        return lod2MultiCurve;
    }

    /**
     * Sets the value of the lod2MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod2MultiCurve(MultiCurvePropertyType value) {
        this.lod2MultiCurve = value;
    }

    public boolean isSetLod2MultiCurve() {
        return (this.lod2MultiCurve!= null);
    }

    /**
     * Gets the value of the lod2TerrainIntersection property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod2TerrainIntersection() {
        return lod2TerrainIntersection;
    }

    /**
     * Sets the value of the lod2TerrainIntersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod2TerrainIntersection(MultiCurvePropertyType value) {
        this.lod2TerrainIntersection = value;
    }

    public boolean isSetLod2TerrainIntersection() {
        return (this.lod2TerrainIntersection!= null);
    }

    /**
     * Gets the value of the boundedBySurface property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundedBySurface property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundedBySurface().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoundarySurfacePropertyType }
     * 
     * 
     */
    public List<BoundarySurfacePropertyType> getBoundedBySurface() {
        if (boundedBySurface == null) {
            boundedBySurface = new ArrayList<BoundarySurfacePropertyType>();
        }
        return this.boundedBySurface;
    }

    public boolean isSetBoundedBySurface() {
        return ((this.boundedBySurface!= null)&&(!this.boundedBySurface.isEmpty()));
    }

    public void unsetBoundedBySurface() {
        this.boundedBySurface = null;
    }

    /**
     * Gets the value of the lod3Solid property.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getLod3Solid() {
        return lod3Solid;
    }

    /**
     * Sets the value of the lod3Solid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setLod3Solid(SolidPropertyType value) {
        this.lod3Solid = value;
    }

    public boolean isSetLod3Solid() {
        return (this.lod3Solid!= null);
    }

    /**
     * Gets the value of the lod3MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod3MultiSurface() {
        return lod3MultiSurface;
    }

    /**
     * Sets the value of the lod3MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod3MultiSurface(MultiSurfacePropertyType value) {
        this.lod3MultiSurface = value;
    }

    public boolean isSetLod3MultiSurface() {
        return (this.lod3MultiSurface!= null);
    }

    /**
     * Gets the value of the lod3MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod3MultiCurve() {
        return lod3MultiCurve;
    }

    /**
     * Sets the value of the lod3MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod3MultiCurve(MultiCurvePropertyType value) {
        this.lod3MultiCurve = value;
    }

    public boolean isSetLod3MultiCurve() {
        return (this.lod3MultiCurve!= null);
    }

    /**
     * Gets the value of the lod3TerrainIntersection property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod3TerrainIntersection() {
        return lod3TerrainIntersection;
    }

    /**
     * Sets the value of the lod3TerrainIntersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod3TerrainIntersection(MultiCurvePropertyType value) {
        this.lod3TerrainIntersection = value;
    }

    public boolean isSetLod3TerrainIntersection() {
        return (this.lod3TerrainIntersection!= null);
    }

    /**
     * Gets the value of the lod4Solid property.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getLod4Solid() {
        return lod4Solid;
    }

    /**
     * Sets the value of the lod4Solid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setLod4Solid(SolidPropertyType value) {
        this.lod4Solid = value;
    }

    public boolean isSetLod4Solid() {
        return (this.lod4Solid!= null);
    }

    /**
     * Gets the value of the lod4MultiSurface property.
     * 
     * @return
     *     possible object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public MultiSurfacePropertyType getLod4MultiSurface() {
        return lod4MultiSurface;
    }

    /**
     * Sets the value of the lod4MultiSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiSurfacePropertyType }
     *     
     */
    public void setLod4MultiSurface(MultiSurfacePropertyType value) {
        this.lod4MultiSurface = value;
    }

    public boolean isSetLod4MultiSurface() {
        return (this.lod4MultiSurface!= null);
    }

    /**
     * Gets the value of the lod4MultiCurve property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod4MultiCurve() {
        return lod4MultiCurve;
    }

    /**
     * Sets the value of the lod4MultiCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod4MultiCurve(MultiCurvePropertyType value) {
        this.lod4MultiCurve = value;
    }

    public boolean isSetLod4MultiCurve() {
        return (this.lod4MultiCurve!= null);
    }

    /**
     * Gets the value of the lod4TerrainIntersection property.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public MultiCurvePropertyType getLod4TerrainIntersection() {
        return lod4TerrainIntersection;
    }

    /**
     * Sets the value of the lod4TerrainIntersection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurvePropertyType }
     *     
     */
    public void setLod4TerrainIntersection(MultiCurvePropertyType value) {
        this.lod4TerrainIntersection = value;
    }

    public boolean isSetLod4TerrainIntersection() {
        return (this.lod4TerrainIntersection!= null);
    }

    /**
     * Gets the value of the consistsOfUndergroundPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consistsOfUndergroundPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsistsOfUndergroundPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndergroundPartPropertyType }
     * 
     * 
     */
    public List<UndergroundPartPropertyType> getConsistsOfUndergroundPart() {
        if (consistsOfUndergroundPart == null) {
            consistsOfUndergroundPart = new ArrayList<UndergroundPartPropertyType>();
        }
        return this.consistsOfUndergroundPart;
    }

    public boolean isSetConsistsOfUndergroundPart() {
        return ((this.consistsOfUndergroundPart!= null)&&(!this.consistsOfUndergroundPart.isEmpty()));
    }

    public void unsetConsistsOfUndergroundPart() {
        this.consistsOfUndergroundPart = null;
    }

    /**
     * Gets the value of the genericApplicationPropertyOfAbstractUnderground property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genericApplicationPropertyOfAbstractUnderground property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get_GenericApplicationPropertyOfAbstractUnderground().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> get_GenericApplicationPropertyOfAbstractUnderground() {
        if (_GenericApplicationPropertyOfAbstractUnderground == null) {
            _GenericApplicationPropertyOfAbstractUnderground = new ArrayList<Object>();
        }
        return this._GenericApplicationPropertyOfAbstractUnderground;
    }

    public boolean isSet_GenericApplicationPropertyOfAbstractUnderground() {
        return ((this._GenericApplicationPropertyOfAbstractUnderground!= null)&&(!this._GenericApplicationPropertyOfAbstractUnderground.isEmpty()));
    }

    public void unset_GenericApplicationPropertyOfAbstractUnderground() {
        this._GenericApplicationPropertyOfAbstractUnderground = null;
    }

}
