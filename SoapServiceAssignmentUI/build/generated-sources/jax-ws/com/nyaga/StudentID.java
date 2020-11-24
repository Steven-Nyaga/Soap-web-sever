
package com.nyaga;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentID", propOrder = {
    "studentID"
})
public class StudentID {

    @XmlElement(name = "StudentID")
    protected int studentID;

    /**
     * Gets the value of the studentID property.
     * 
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Sets the value of the studentID property.
     * 
     */
    public void setStudentID(int value) {
        this.studentID = value;
    }

}
