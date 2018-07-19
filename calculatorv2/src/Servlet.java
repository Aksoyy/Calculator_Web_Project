import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculatorv2.Arithmetic;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/servlet")
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
		Arithmetic add = new Arithmetic();
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		//System.out.println(request.getParameter("submit"));
		
		PrintWriter writer = response.getWriter();
		writer.print("<html><body bgColor=\"#dbeeff\">");
		double result;	
		
		//Basılacak butona göre işlemi belirlemektedir.
		switch(request.getParameter("submit"))
		{
			case "Toplama":
				result = add.addition(param1, param2);
				writer.print("<h3>Toplama isleminin sonucu : " + result + "</h3>");
				break;
			
			case "Cikarma":
				result = add.subtraction(param1, param2);
				writer.print("<h3>Cikarma isleminin sonucu : " + result + "</h3>");
				break;
			
			case "Bolme":
				if( Integer.parseInt(param2) == 0 )
				{
					writer.print("<h3>Section value can not be 0</h3>");
					break;
				}
				result = add.division(param1, param2);
				writer.print("<h3>Bolme isleminin sonucu : " + result + "</h3>");
				break;
		
			case "Carpma":
				result = add.multiplication(param1, param2);
				writer.print("<h3>Carpma isleminin sonucu : " + result + "</h3>");
				break;	
		
			case "Ust Alma":
				if(  Integer.parseInt(param2) < 0 )
				{
					writer.print("<h3>Second value can not be less than 0</h3>");
					break;
				}
				
				result = add.getUpper(param1, param2);
				writer.print("<h3>Ust alma isleminin sonucu : " + result + "</h3>");
				break;
		
			case "Mod":
				if(  Integer.parseInt(param2) < 0 )
				{
					writer.print("<h3>Second value can not be less than 0</h3>");
					break;
				}
				
				result = add.mode(param1, param2);
				writer.print("<h3>Mod isleminin sonucu : " + result + "</h3>");
				break;	
		}
		writer.print("<h1>DENEME</h1>");
		writer.print("</body></html>");
		writer.close();
	}
}