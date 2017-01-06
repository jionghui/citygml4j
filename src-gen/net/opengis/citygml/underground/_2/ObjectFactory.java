
package net.opengis.citygml.underground._2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UndergroundPart_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "UndergroundPart");
    private final static QName __GenericApplicationPropertyOfClosureSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfClosureSurface");
    private final static QName _WallSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "WallSurface");
    private final static QName __GenericApplicationPropertyOfUnderground_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfUnderground");
    private final static QName _ClosureSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "ClosureSurface");
    private final static QName __GenericApplicationPropertyOfRoofSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfRoofSurface");
    private final static QName __GenericApplicationPropertyOfBoundarySurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfBoundarySurface");
    private final static QName __GenericApplicationPropertyOfUndergroundPart_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfUndergroundPart");
    private final static QName _Underground_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "Underground");
    private final static QName __GenericApplicationPropertyOfWallSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfWallSurface");
    private final static QName __GenericApplicationPropertyOfGroundSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfGroundSurface");
    private final static QName __AbstractUnderground_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_AbstractUnderground");
    private final static QName _RoofSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "RoofSurface");
    private final static QName __BoundarySurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_BoundarySurface");
    private final static QName __GenericApplicationPropertyOfAbstractUnderground_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "_GenericApplicationPropertyOfAbstractUnderground");
    private final static QName _GroundSurface_QNAME = new QName("http://www.opengis.net/citygml/underground/2.0", "GroundSurface");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoofSurfaceType }
     * 
     */
    public RoofSurfaceType createRoofSurfaceType() {
        return new RoofSurfaceType();
    }

    /**
     * Create an instance of {@link GroundSurfaceType }
     * 
     */
    public GroundSurfaceType createGroundSurfaceType() {
        return new GroundSurfaceType();
    }

    /**
     * Create an instance of {@link ClosureSurfaceType }
     * 
     */
    public ClosureSurfaceType createClosureSurfaceType() {
        return new ClosureSurfaceType();
    }

    /**
     * Create an instance of {@link UndergroundType }
     * 
     */
    public UndergroundType createUndergroundType() {
        return new UndergroundType();
    }

    /**
     * Create an instance of {@link WallSurfaceType }
     * 
     */
    public WallSurfaceType createWallSurfaceType() {
        return new WallSurfaceType();
    }

    /**
     * Create an instance of {@link UndergroundPartType }
     * 
     */
    public UndergroundPartType createUndergroundPartType() {
        return new UndergroundPartType();
    }

    /**
     * Create an instance of {@link BoundarySurfacePropertyType }
     * 
     */
    public BoundarySurfacePropertyType createBoundarySurfacePropertyType() {
        return new BoundarySurfacePropertyType();
    }

    /**
     * Create an instance of {@link UndergroundPartPropertyType }
     * 
     */
    public UndergroundPartPropertyType createUndergroundPartPropertyType() {
        return new UndergroundPartPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndergroundPartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "UndergroundPart", substitutionHeadNamespace = "http://www.opengis.net/citygml/underground/2.0", substitutionHeadName = "_AbstractUnderground")
    public JAXBElement<UndergroundPartType> createUndergroundPart(UndergroundPartType value) {
        return new JAXBElement<UndergroundPartType>(_UndergroundPart_QNAME, UndergroundPartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfClosureSurface")
    public JAXBElement<Object> create_GenericApplicationPropertyOfClosureSurface(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfClosureSurface_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WallSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "WallSurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/underground/2.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<WallSurfaceType> createWallSurface(WallSurfaceType value) {
        return new JAXBElement<WallSurfaceType>(_WallSurface_QNAME, WallSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfUnderground")
    public JAXBElement<Object> create_GenericApplicationPropertyOfUnderground(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfUnderground_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosureSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "ClosureSurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/underground/2.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<ClosureSurfaceType> createClosureSurface(ClosureSurfaceType value) {
        return new JAXBElement<ClosureSurfaceType>(_ClosureSurface_QNAME, ClosureSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfRoofSurface")
    public JAXBElement<Object> create_GenericApplicationPropertyOfRoofSurface(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfRoofSurface_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfBoundarySurface")
    public JAXBElement<Object> create_GenericApplicationPropertyOfBoundarySurface(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfBoundarySurface_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfUndergroundPart")
    public JAXBElement<Object> create_GenericApplicationPropertyOfUndergroundPart(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfUndergroundPart_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndergroundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "Underground", substitutionHeadNamespace = "http://www.opengis.net/citygml/underground/2.0", substitutionHeadName = "_AbstractUnderground")
    public JAXBElement<UndergroundType> createUnderground(UndergroundType value) {
        return new JAXBElement<UndergroundType>(_Underground_QNAME, UndergroundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfWallSurface")
    public JAXBElement<Object> create_GenericApplicationPropertyOfWallSurface(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfWallSurface_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfGroundSurface")
    public JAXBElement<Object> create_GenericApplicationPropertyOfGroundSurface(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfGroundSurface_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractUndergroundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_AbstractUnderground", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_Site")
    public JAXBElement<AbstractUndergroundType> create_AbstractUnderground(AbstractUndergroundType value) {
        return new JAXBElement<AbstractUndergroundType>(__AbstractUnderground_QNAME, AbstractUndergroundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoofSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "RoofSurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/underground/2.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<RoofSurfaceType> createRoofSurface(RoofSurfaceType value) {
        return new JAXBElement<RoofSurfaceType>(_RoofSurface_QNAME, RoofSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractBoundarySurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_BoundarySurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/2.0", substitutionHeadName = "_CityObject")
    public JAXBElement<AbstractBoundarySurfaceType> create_BoundarySurface(AbstractBoundarySurfaceType value) {
        return new JAXBElement<AbstractBoundarySurfaceType>(__BoundarySurface_QNAME, AbstractBoundarySurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "_GenericApplicationPropertyOfAbstractUnderground")
    public JAXBElement<Object> create_GenericApplicationPropertyOfAbstractUnderground(Object value) {
        return new JAXBElement<Object>(__GenericApplicationPropertyOfAbstractUnderground_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroundSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/citygml/underground/2.0", name = "GroundSurface", substitutionHeadNamespace = "http://www.opengis.net/citygml/underground/2.0", substitutionHeadName = "_BoundarySurface")
    public JAXBElement<GroundSurfaceType> createGroundSurface(GroundSurfaceType value) {
        return new JAXBElement<GroundSurfaceType>(_GroundSurface_QNAME, GroundSurfaceType.class, null, value);
    }

}
