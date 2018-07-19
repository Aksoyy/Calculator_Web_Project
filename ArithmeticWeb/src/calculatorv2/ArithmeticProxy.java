package calculatorv2;

public class ArithmeticProxy implements calculatorv2.Arithmetic
{
  private String _endpoint = null;
  private calculatorv2.Arithmetic arithmetic = null;
  
  public ArithmeticProxy() 
  {
    _initArithmeticProxy();
  }
  
  public ArithmeticProxy(String endpoint)
  {
    _endpoint = endpoint;
    _initArithmeticProxy();
  }
  
  private void _initArithmeticProxy()
  {
    try
    {
      arithmetic = (new calculatorv2.ArithmeticServiceLocator()).getArithmetic();
      if (arithmetic != null)
      {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)arithmetic)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)arithmetic)._getProperty("javax.xml.rpc.service.endpoint.address");
      } 
    }
    catch (javax.xml.rpc.ServiceException serviceException){}
  }
  
  public String getEndpoint()
  {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint)
  {
    _endpoint = endpoint;
    if (arithmetic != null)
      ((javax.xml.rpc.Stub)arithmetic)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
  }
  
  public calculatorv2.Arithmetic getArithmetic()
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    arithmetic.main(args);
  }
  
  public int mode(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic.mode(param1, param2);
  }
  
  public double getUpper(java.lang.String param1, java.lang.String degree) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic.getUpper(param1, degree);
  }
  
  public double addition(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic.addition(param1, param2);
  }
  
  public double division(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic.division(param1, param2);
  }
  
  public int fakto(java.lang.String param1) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic.fakto(param1);
  }
  
  public double multiplication(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic.multiplication(param1, param2);
  }
  
  public double subtraction(java.lang.String param1, java.lang.String param2) throws java.rmi.RemoteException
  {
    if (arithmetic == null)
      _initArithmeticProxy();
    return arithmetic.subtraction(param1, param2);
  }
}