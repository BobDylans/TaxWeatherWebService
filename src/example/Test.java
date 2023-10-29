package example;

//import example.client.CalTaxServiceLocator;
//import example.client.CalTax_PortType;

import example.client2.IncomeTax;
import example.client2.IncomeTaxServiceLocator;

public class Test {
    public static void main(String[] argv) {
        try {
            IncomeTaxServiceLocator locator = new IncomeTaxServiceLocator();
            IncomeTax service = locator.getCalTax();
            // If authorization is required
            //((HelloWorldSoapBindingStub)service).setUsername("user3");
            //((HelloWorldSoapBindingStub)service).setPassword("pass3");
            // invoke business method
            System.out.println(service.calTax("55000"));
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}