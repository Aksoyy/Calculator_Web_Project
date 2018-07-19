/**
 * ArithmeticService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package calculatorv2;

public interface ArithmeticService extends javax.xml.rpc.Service
{
    public java.lang.String getArithmeticAddress();

    public calculatorv2.Arithmetic getArithmetic() throws javax.xml.rpc.ServiceException;

    public calculatorv2.Arithmetic getArithmetic(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
