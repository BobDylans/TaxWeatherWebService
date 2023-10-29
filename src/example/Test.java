package example;

//import example.client.CalTaxServiceLocator;
//import example.client.CalTax_PortType;

import example.INclient.IncomeTax;
import example.INclient.IncomeTaxServiceLocator;

public class Test {
    public static void main(String[] argv) {
        try {
            IncomeTaxServiceLocator locator = new IncomeTaxServiceLocator();
            IncomeTax service = locator.getCalTax();
            System.out.println(service.calTax("55000"));
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}