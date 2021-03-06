
package com.nyaga;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetStudent", targetNamespace = "http://nyaga.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetStudent {


    /**
     * 
     * @param studentID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "StudentID")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "StudentID", targetNamespace = "http://nyaga.com/", className = "com.nyaga.StudentID")
    @ResponseWrapper(localName = "StudentIDResponse", targetNamespace = "http://nyaga.com/", className = "com.nyaga.StudentIDResponse")
    @Action(input = "http://nyaga.com/GetStudent/StudentIDRequest", output = "http://nyaga.com/GetStudent/StudentIDResponse")
    public String studentID(
        @WebParam(name = "StudentID", targetNamespace = "")
        int studentID);

}
