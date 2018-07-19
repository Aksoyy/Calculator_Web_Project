package com.hknsoft.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import calculatorv2.Arithmetic;
import calculatorv2.ArithmeticProxy;
import calculatorv2.ArithmeticService;
import calculatorv2.ArithmeticServiceLocator;
import calculatorv2.ArithmeticSoapBindingStub;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/servletv2")
public class Servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");*/
		
		//PrintWriter out = response.getWriter();
		/*out.print("<html><body>");
		out.print("<h1>Hello Servlet</h1>");
		out.print("</body></html>");*/
		
		/*out.print("<body bgColor=\"#dbeeff\" >\r\n" + 
				"	<h3>--->>>---- GEREKLI BOSLUKLARA DEGERLERI GIRINIZ ---<<<----</h3> <br/>\r\n" + 
				"	Girilen Ilk Deger : <input type=\"number\" id=\"number1\" value=\"\"><br/><br>\r\n" + 
				"	Girilen Ikinci Deger : <input type=\"number\" id=\"number2\" value=\"\"><br><br>\r\n" + 
				"	<input type=\"button\" id=\"hesapla\" value=\"Toplama\">\r\n" + 
				"	<input type=\"button\" id=\"hesapla2\" value=\"Çikarma\">\r\n" + 
				"	<input type=\"button\" id=\"hesapla3\" value=\"Bölme\">\r\n" + 
				"	<input type=\"button\" id=\"hesapla4\" value=\"Çarpma\">\r\n" + 
				"	<input type=\"button\" id=\"hesapla5\" value=\"Mod\">\r\n" + 
				"	<input type=\"button\" id=\"hesapla6\" value=\"Ust Alma\">\r\n" + 
				"\r\n" + 
				"	<script>\r\n" + 
				"		var txtSayi1=document.getElementById(\"number1\");\r\n" + 
				"		var txtSayi2=document.getElementById(\"number2\");\r\n" + 
				"		var btnHesapla=document.getElementById(\"hesapla\");\r\n" + 
				"		var btnHesapla2=document.getElementById(\"hesapla2\");\r\n" + 
				"		var btnHesapla3=document.getElementById(\"hesapla3\");\r\n" + 
				"		var btnHesapla4=document.getElementById(\"hesapla4\");\r\n" + 
				"		var btnHesapla5=document.getElementById(\"hesapla5\");\r\n" + 
				"		var btnHesapla6=document.getElementById(\"hesapla6\");\r\n" + 
				"		btnHesapla.onclick  = function()\r\n" + 
				"		{\r\n" + 
				"			var number1 = Number(txtSayi1.value);\r\n" + 
				"			var number2 = Number(txtSayi2.value);\r\n" + 
				"			var result = number1+number2\r\n" + 
				"			window.alert(\"Girilen sayilarin toplami: \"+result);\r\n" + 
				"		}\r\n" + 
				"		btnHesapla2.onclick  = function()\r\n" + 
				"		{\r\n" + 
				"			var number1 = Number(txtSayi1.value);\r\n" + 
				"			var number2 = Number(txtSayi2.value);\r\n" + 
				"			var result = number1-number2\r\n" + 
				"			window.alert(\"Girilen sayilarin farki: \"+result);\r\n" + 
				"		}\r\n" + 
				"		btnHesapla3.onclick  = function()\r\n" + 
				"		{\r\n" + 
				"			var number1 = Number(txtSayi1.value);\r\n" + 
				"			var number2 = Number(txtSayi2.value);\r\n" + 
				"			var result = number1/number2\r\n" + 
				"			window.alert(\"Girilen sayilarin bolumu: \"+result);\r\n" + 
				"		}\r\n" + 
				"		btnHesapla4.onclick  = function()\r\n" + 
				"		{\r\n" + 
				"			var number1 = Number(txtSayi1.value);\r\n" + 
				"			var number2 = Number(txtSayi2.value);\r\n" + 
				"			var result = number1*number2\r\n" + 
				"			window.alert(\"Girilen sayilarin carpimi: \"+result);\r\n" + 
				"		}\r\n" + 
				"		btnHesapla5.onclick  = function()\r\n" + 
				"		{\r\n" + 
				"			var number1 = Number(txtSayi1.value);\r\n" + 
				"			var number2 = Number(txtSayi2.value);\r\n" + 
				"			var result = number1%number2\r\n" + 
				"			window.alert(\"Girilen ilk sayinin ikinci sayiya modu : \"+result);\r\n" + 
				"		}\r\n" + 
				"		btnHesapla6.onclick  = function()\r\n" + 
				"		{\r\n" + 
				"			var number1 = Number(txtSayi1.value);\r\n" + 
				"			var number2 = Number(txtSayi2.value);\r\n" + 
				"			var result=number1;\r\n" + 
				"			for( var a=1 ; a<number2 ; a+=1 )\r\n" + 
				"				result *= result;\r\n" + 
				"			window.alert(\"Girilen ilk sayinin ikinci sayi derecesinde ustu : \"+result);\r\n" + 
				"		}\r\n" + 
				"	</script>\r\n" + 
				"</body>\r\n" + 
				"</html>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//Servlet ile Servisi bağlayacak nesnenin tanımlandığı yerdir.
		//portSoapBindingStub  proxy = new portSoapBindingStub();
		ArithmeticProxy proxy = new ArithmeticProxy("http://localhost:8080/calculatorv2/services/Arithmetic");
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		//proxy.addition(param1, param2);
		//System.out.println(request.getParameter("submit"));
		
		PrintWriter writer = response.getWriter();
		writer.print("<html><body bgColor=\"#dbeeff\">");
		double result;	
		
		//Basılacak butona göre işlemi belirlemektedir.
		switch(request.getParameter("submit"))
		{
			case "Toplama":
				result = proxy.addition(param1, param2);
				writer.print("<h3>Toplama isleminin sonucu : " + result + "</h3>");
				break;
			
			case "Cikarma":
				result = proxy.subtraction(param1, param2);
				writer.print("<h3>Cikarma isleminin sonucu : " + result + "</h3>");
				break;
			
			case "Bolme":
				if( Integer.parseInt(param2) == 0 )
				{
					writer.print("<h3>Section value can not be 0</h3>");
					break;
				}
				result = proxy.division(param1, param2);
				writer.print("<h3>Bolme isleminin sonucu : " + result + "</h3>");
				break;
		
			case "Carpma":
				result = proxy.multiplication(param1, param2);
				writer.print("<h3>Carpma isleminin sonucu : " + result + "</h3>");
				break;	
		
			case "Ust Alma":
				if(  Integer.parseInt(param2) < 0 )
				{
					writer.print("<h3>Second value can not be less than 0</h3>");
					break;
				}
				
				result = proxy.getUpper(param1, param2);
				writer.print("<h3>Ust alma isleminin sonucu : " + result + "</h3>");
				break;
		
			case "Mod":
				if(  Integer.parseInt(param2) < 0 )
				{
					writer.print("<h3>Second value can not be less than 0</h3>");
					break;
				}
				
				result = proxy.mode(param1, param2);
				writer.print("<h3>Mod isleminin sonucu : " + result + "</h3>");
				break;	
		}
		//İslemin sonucundan sonra geriye donmeyi sağlayan yapıdır.
		writer.print("<h3>"
				+ " <a href = 'http://localhost:8080/ArithmeticWeb/index.jsp'>Geri Don</a>"
				+ "</h3>");
		writer.print("</body></html>");
		writer.close();
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    try 
	    {
	        /* TODO output your page here. You may use following sample code. */
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>TEST</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Servlet ClientServlet at " + request.getContextPath() + "</h1>");
	 
	        try
	        {
	            String s = "madam";
	     //       out.println(s + " kelimesi palindrome mu? " + palindromeMu(s));
	        }
	        catch
	        (Exception e)
	        {
	            out.println(e);
	        }
	        out.println("</body>");
	        out.println("</html>");
	    }
	    finally
	    {
	        out.close();
	    }
	}
}