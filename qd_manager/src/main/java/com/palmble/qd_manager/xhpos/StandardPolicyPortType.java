
package com.palmble.qd_manager.xhpos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StandardPolicyPortType", targetNamespace = "xhpos")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StandardPolicyPortType {


    /**
     * 
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "xhpos")
    @RequestWrapper(localName = "searchProductInfo", targetNamespace = "xhpos", className = "xhpos.SearchProductInfo")
    @ResponseWrapper(localName = "searchProductInfoResponse", targetNamespace = "xhpos", className = "xhpos.SearchProductInfoResponse")
    public String searchProductInfo(
        @WebParam(name = "in0", targetNamespace = "xhpos")
        String in0);

    /**
     * 
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "xhpos")
    @RequestWrapper(localName = "insure", targetNamespace = "xhpos", className = "xhpos.Insure")
    @ResponseWrapper(localName = "insureResponse", targetNamespace = "xhpos", className = "xhpos.InsureResponse")
    public String insure(
        @WebParam(name = "in0", targetNamespace = "xhpos")
        String in0);

    /**
     * 
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "xhpos")
    @RequestWrapper(localName = "search", targetNamespace = "xhpos", className = "xhpos.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "xhpos", className = "xhpos.SearchResponse")
    public String search(
        @WebParam(name = "in0", targetNamespace = "xhpos")
        String in0);

    /**
     * 
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "xhpos")
    @RequestWrapper(localName = "surrender", targetNamespace = "xhpos", className = "xhpos.Surrender")
    @ResponseWrapper(localName = "surrenderResponse", targetNamespace = "xhpos", className = "xhpos.SurrenderResponse")
    public String surrender(
        @WebParam(name = "in0", targetNamespace = "xhpos")
        String in0);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "xhpos")
    @RequestWrapper(localName = "heartBeat", targetNamespace = "xhpos", className = "xhpos.HeartBeat")
    @ResponseWrapper(localName = "heartBeatResponse", targetNamespace = "xhpos", className = "xhpos.HeartBeatResponse")
    public String heartBeat();

}
