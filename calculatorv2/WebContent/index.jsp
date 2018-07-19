<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE</title>
</head>
<body bgColor="#dbeeff">
   <h3> ISLEMLERIN YAPILABILMESI ICIN GEREKLI BOSLUKLARA DEGERLERI GIRINIZ </h3> <br/>
    
    <form action="servlet" method="post">
    Girilen Ilk Deger : <input type="text" name="param1" size="20"><br><br/>
    Girilen Ikinci Deger : <input type="text" name="param2" size="20">
    <br><br/><input type="submit" name="submit" id="sum" value="Toplama" />
    <input type="submit" id="sub" name="submit" value="Cikarma" />
    <input type="submit" id="div" name="submit" value="Bolme" />
    <input type="submit" id="mul" name="submit" value="Carpma" />
    <input type="submit" id="upper" name="submit" value="Ust Alma" />
    <input type="submit" id="mode" name="submit" value="Mod" />
	</form>
    
</body>
</html>