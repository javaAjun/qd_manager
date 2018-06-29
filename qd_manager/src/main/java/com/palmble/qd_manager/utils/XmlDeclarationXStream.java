package com.palmble.qd_manager.utils;

import java.io.OutputStream;
import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XmlDeclarationXStream extends XStream {
    private String version;
 
    private String ecoding;
 
    public XmlDeclarationXStream() {
       this("1.0", "UTF-8");
    }
 
    public XmlDeclarationXStream(String version, String ecoding) {
       this.version = version;
       this.ecoding = ecoding;
    }
 
   
    public XmlDeclarationXStream(DomDriver domDriver) {
    	super(domDriver);
	}

	public String getDeclaration() {
       return "<?xml version=\"" + this.version + "\" encoding=\"" + this.ecoding + "\"?>\n";
    }
 
    @Override
    public void toXML(Object arg0, OutputStream arg1) {
       try {
           String dec = this.getDeclaration();
           byte[] bytesOfDec = dec.getBytes(this.ecoding);
           arg1.write(bytesOfDec);
       } catch (Exception e) {
          // log.error("输出Declaration时候出现异常", e);
           return ;
       }
       super.toXML(arg0, arg1);
    }
 
    @Override
    public void toXML(Object arg0, Writer arg1) {
       try {
           arg1.write(getDeclaration());
       } catch (Exception e) {
         //  log.error("输出Declaration时候出现异常", e);
           return ;
       }
       super.toXML(arg0, arg1);
    }
 
}
