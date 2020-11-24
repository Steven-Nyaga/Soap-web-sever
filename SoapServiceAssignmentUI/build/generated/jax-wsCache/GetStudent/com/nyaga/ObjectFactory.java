
package com.nyaga;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nyaga package. 
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

    private final static QName _StudentID_QNAME = new QName("http://nyaga.com/", "StudentID");
    private final static QName _StudentIDResponse_QNAME = new QName("http://nyaga.com/", "StudentIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nyaga
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentIDResponse }
     * 
     */
    public StudentIDResponse createStudentIDResponse() {
        return new StudentIDResponse();
    }

    /**
     * Create an instance of {@link StudentID }
     * 
     */
    public StudentID createStudentID() {
        return new StudentID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nyaga.com/", name = "StudentID")
    public JAXBElement<StudentID> createStudentID(StudentID value) {
        return new JAXBElement<StudentID>(_StudentID_QNAME, StudentID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nyaga.com/", name = "StudentIDResponse")
    public JAXBElement<StudentIDResponse> createStudentIDResponse(StudentIDResponse value) {
        return new JAXBElement<StudentIDResponse>(_StudentIDResponse_QNAME, StudentIDResponse.class, null, value);
    }

}
