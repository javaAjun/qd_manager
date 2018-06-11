
package com.palmble.qd_manager.xhpos;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xhpos package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xhpos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchProductInfo }
     * 
     */
    public SearchProductInfo createSearchProductInfo() {
        return new SearchProductInfo();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SurrenderResponse }
     * 
     */
    public SurrenderResponse createSurrenderResponse() {
        return new SurrenderResponse();
    }

    /**
     * Create an instance of {@link InsureResponse }
     * 
     */
    public InsureResponse createInsureResponse() {
        return new InsureResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link HeartBeat }
     * 
     */
    public HeartBeat createHeartBeat() {
        return new HeartBeat();
    }

    /**
     * Create an instance of {@link SearchProductInfoResponse }
     * 
     */
    public SearchProductInfoResponse createSearchProductInfoResponse() {
        return new SearchProductInfoResponse();
    }

    /**
     * Create an instance of {@link Insure }
     * 
     */
    public Insure createInsure() {
        return new Insure();
    }

    /**
     * Create an instance of {@link HeartBeatResponse }
     * 
     */
    public HeartBeatResponse createHeartBeatResponse() {
        return new HeartBeatResponse();
    }

    /**
     * Create an instance of {@link Surrender }
     * 
     */
    public Surrender createSurrender() {
        return new Surrender();
    }

}
