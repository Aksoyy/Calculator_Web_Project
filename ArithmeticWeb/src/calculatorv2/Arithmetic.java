/**
 * Arithmetic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package calculatorv2;

public interface Arithmetic extends java.rmi.Remote
{
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public int mode(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException;
    public double getUpper(java.lang.String param1, java.lang.String degree) throws java.rmi.RemoteException;
    public double addition(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException;
    public double division(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException;
    public int fakto(java.lang.String param1) throws java.rmi.RemoteException;
    public double multiplication(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException;
    public double subtraction(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException;
}
