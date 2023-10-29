/**
 * CalTaxService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package example.INclient;

public interface IncomeTaxService extends javax.xml.rpc.Service {
    public java.lang.String getCalTaxAddress();

    public example.INclient.IncomeTax getCalTax() throws javax.xml.rpc.ServiceException;

    public example.INclient.IncomeTax getCalTax(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
