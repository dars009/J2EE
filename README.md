# J2EE
Advance Java Practicals

##Tomcat Download
https://tomcat.apache.org/download-80.cgi

## JAVA Setting
(Inside Eclipse) Window > Preference > Java > Install JRE > Add > Select Standard VM > directory >serch for jdk folder which is install / download by you > Select JDK folder > next > select jdk which is added by you > apply  and close


## Project Creation
File > New > Other > Maven > Maven Project > (If you are unable to see maven option then change eclipse and download it from -> https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2023-03/R/eclipse-jee-2023-03-R-win32-x86_64.zip)

Maven Project > Select 1st checkbox (Create simple project skip arc type) > Next > provide Group Id (Package name for eg. com.test) > Artifact ID (Project name > for eg. advjavademo) > select packaging type > war (because we need webapp folder inside our project)> finish  


## Maven Troublesooting (GOOD INTERNET IS MUST)
Once the project created / or Download project you have to
<br> Right click on Project > Run as > **Maven Install** > expected o/p **Build Success** in Consol 
<br> Right clock on Project > Maven > **Update Project** > Select your Project > and Update 

## J2EE Project 
you will see web app folder in src > main >
<br> Generate web.xml file for that > right click on > Deployment Descriptor > Generate Deployment Descriptor Stub > (this step will add **web.xml** file in **WEB-INF** folder inside webapp) 

<br> inside you will see welcome file list > that is the first page of your application >
default it will find index.jsp inside **webapp** folder 

## Tomcat Setup In Project
Download Tomcat form : https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.64/bin/apache-tomcat-8.5.64-windows-x64.zip

<br> Setup tomcat in eclipse 
<br> (Inside eclipse) window > Show View > Other > Server (You will see server window) > click on add server link > Apache > tomcat 8.5 > next > Search for tomcat that you have downloaded and extracted till tomcat folder > next > finish

<br> double click on tomcat > increase time out to 9999
<br> select webapps folder in deployment path 
<br> Save them (ctrl + s)

<br> Right click on tomcat > Start (it must be start clean with any error)

## Next Step In side Project 

Create **index.jsp** file > inside **webapp**(Right click > new > file >(File name) index.jsp > next > finish )
<br> Write code like 
```bash
<form action="LoginController" method="post">
	Email : <input type="email" name="email" />
	<br>
	Password : <input type="password" name="password" />
	<br>
	<input type="submit" value="Login">
</form>
```
## JSP to JAVA (Controller) Connectivity

Create New Java Class with proper name for eg LoginController > inside proper package for eg com.test.controller > extend it with HttpServlet class and add class level annotation call 
```bash
@WebServlet("/LoginController")
public class LoginController extends HttpServlet
```
Override doPost Method

## Introduction
J2EE stands for Java 2 Platform, Enterprise Edition. J2EE is the standard platform for developing applications in the enterprise and is designed for enterprise applications that run on servers. J2EE provides APIs that let developers create workflows and make use of resources such as databases or web services. J2EE consists of a set of APIs. Developers can use these APIs to build applications for business computing.

<br>● A J2EE application server is software that runs applications built with J2EE APIs and lets you run multiple applications on a single computer. Developers can use different J2EE application servers to run applications built with J2EE APIs.

![2023-04-08_21h18_47](https://user-images.githubusercontent.com/22477406/230730667-8d5a365f-e14a-4c88-a25b-ca443187886e.png)

Multi-tier Architecture of Enterprise Java

## Benefits of J2EE
<br>● **Portability:** If you build a J2EE application on a specific platform, it runs the same way on any other J2EE-compliant platform. This makes it easy to move applications from one environment to another. For example, moving an application from one computer to another or relocating an application from a test server to a production server.
<br>● **Reusability:** The components in J2EE are reused, so the average size of an application is much smaller than it would be if you had to write equivalent functionality from scratch for each program. For example, one component lets you read objects from a database. You can use that object-reading feature in any J2EE application. Since this functionality is already written and tested, you don’t have to write it yourself every time you need it.
<br>● **Security:** Java technology lets programmers handle sensitive data far more securely than they can in C/C++ programs.
<br>● **Scalability:** J2EE lets developers build applications that run well on both small, single-processor computers and large, multi-processor systems.
<br>● **Reliability:** Many of the services (such as transaction management and monitoring) that applications need to be reliable are built into J2EE.

## What are the limitations of J2EE?
<br>● J2EE doesn’t provide any database access services. 
You can use the J2EE component “Enterprise JavaBean” to send queries to an SQL database, but you need another kind of software, a Java Database Connectivity (JDBC) driver, to send the actual queries. 
For example, to access an Oracle database, you need the Oracle JDBC driver, and to access a MySQL database, you need the MySQL connector/J driver.
<br>● You cannot build desktop applications using J2EE APIs; they only run in application servers and communicate with backend J2EE services (application servers).
<br>● Application servers often require separate licenses and must be purchased separately.
<br>● J2EE or Java EE is currently known as Jakarta EE, which is its new implementation run as part of the Eclipse Enterprise for Java (EE4J) project. 
<br>● Eclipse Enterprise for Java (EE4J) is the project that now hosts all Java Enterprise technologies. 
<br>● With the move to EE4J, the J2EE / Java EE platform is taking a big step forward by adopting an open governance model that will allow it to be more tightly integrated with other major open-source projects.

## Session
In general, the term “Session” in computing language, refers to a period of time in which a user’s activity happens on a website. 
<br>● Whenever you login to an application or a website, the server should validate/identify the user and track the user interactions across the application. 
<br>● To achieve this, Java Web Server supports the servlet standard session interface, called HttpSession, to perform all the session-related activities.
<br>● **HttpSession Interface**
<br>● Java servlets has HttpSession(I) in javax.servlet.http package. 
<br>● This interface provides a way to identify a user across more than one-page requests or visit a Website. 
<br>● Servlet container uses this interface to create a session between an HTTP client and an HTTP server and stores information about that user. 
<br>● It provides various methods to manipulate information about a session such as,
<br>● To bind a session object with a specified user.
<br>● To get the creation time.
<br>● To know the last time, the user had accessed the website in that session.
<br>● To invalidate the session etc.
<br>● **Creating a Session**
<br>● Once the user login to the website, we need to create a new session. To do this, we need to use getSession() method in HttpServletRequest Interface.
<br>● **1) HttpSession getSession():**
```bash
HttpSession session = request.getSession();
```
<br>● This method returns the current session associated with this request. 
<br>● If the request does not have a session, it creates one. We can also create a session using  getSession(boolean create) method in HttpServletRequest Interface.
<br>● **2) HttpSession getSession(boolean create):**
We can pass the boolean parameters – true or false. getSession(true):
```bash
HttpSession session = request.getSession(true);
```
<br>● **3) void invalidate():**
<br>● Once the user requests to logout, we need to destroy that session. 
<br>● To do this, we need to use invalidate() method in HttpSession Interface.
```bash
HttpSession session = request.getSession();
session.invalidate();
```
<br>● When this invalidate method is called on the session, it removes all the objects that are bound to that session.

<br>● Below are the code snippet for **servlet** 
```bash
HttpSession session = request.getSession();
System.out.println(session.getId());
if (!session.isNew()) {
	session.invalidate();
	session = request.getSession();
	session.setMaxInactiveInterval(0);
}
//get value from data base and set in the session
session.setAttribute("userIdInSession", rs.getInt(1));
session.setAttribute("userEmailInSession", rs.getString(2))
```
<br>● Below are the code snippet for **jsp** to access session using scriptlet tag
```bash
<%
	Integer useridheder = (Integer) session.getAttribute("userIdInSession");
	String useremailheader = (String) session.getAttribute("userEmailInSession");
%>
```
## Implecit Objects Of JSP
<br>● There are 9 jsp implicit objects. These objects are created by the web container that are available to all the jsp pages.
<br>● The available implicit objects are out, request, config, session, application etc.
<br>● A list of the 9 implicit objects is given below:
<br>	Object  -  type 		
<br>	1) out -  JspWriter
<br>	2) request - HttpServletRequest
<br>    3) response - HttpServletResponse
<br>	4) config - ServletConfig
<br>	5) application	- ServletContext
<br>	6) session - HttpSession
<br> 	7) pageContext - PageContext
<br>    8) page	- Object
<br>	9) exception - Throwable 

<br> **1) JSP out implicit object**
<br>● For writing any data to the buffer, JSP provides an implicit object named out. It is the object of JspWriter. In case of servlet you need to write:
```bash
PrintWriter out=response.getWriter();  
```
<br>● But in JSP, you don't need to write this code.
<br>● Example of out implicit object
<br>● In this example we are simply displaying date and time.
<br>● index.jsp
```bash
<html>  
	<body>  
		<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
	</body>  
</html>
```
<br> **2) JSP request implicit object**
The JSP request is an implicit object of type HttpServletRequest i.e. created for each jsp request by the web container. It can be used to get request information such as parameter, header information, remote address, server name, server port, content type, character encoding etc.
It can also be used to set, get and remove attributes from the jsp request scope.
Let's see the simple example of request implicit object where we are printing the name of the user with welcome message.
<br>● Example of JSP request implicit object
<br>● index.html
```bash
<form action="welcome.jsp">  
	<input type="text" name="uname">  
	<input type="submit" value="go"><br/>  
</form>
```
● welcome.jsp
```bash
<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
```
<br> **3) JSP response implicit object**
In JSP, response is an implicit object of type HttpServletResponse. The instance of HttpServletResponse is created by the web container for each jsp request.
It can be used to add or manipulate response such as redirect response to another resource, send error etc.
Let's see the example of response implicit object where we are redirecting the response to the Google.
<br>● Example of response implicit object
<br>● index.html
```bash
<form action="welcome.jsp">  
	<input type="text" name="uname">  
	<input type="submit" value="go"><br/>  
</form>
```
● welcome.jsp
```bash
<%   
response.sendRedirect("http://www.google.com");  
%>  
```
<br> **4) JSP config implicit object**
In JSP, config is an implicit object of type ServletConfig. This object can be used to get initialization parameter for a particular JSP page. The config object is created by the web container for each jsp page.
Generally, it is used to get initialization parameter from the web.xml file.
<br>● Example of config implicit object:
<br>● index.html
```bash
<form action="welcome">  
	<input type="text" name="uname">  
	<input type="submit" value="go"><br/>  
</form>  
```
● web.xml file
```bash
<web-app>  
	<servlet>  
		<servlet-name>darshit</servlet-name>  
		<jsp-file>/welcome.jsp</jsp-file>  
	<init-param>  
		<param-name>dname</param-name>  
		<param-value>sun.jdbc.odbc.JdbcOdbcDriver</param-value>  
	</init-param>  
	</servlet>  
		<servlet-mapping>  
		<servlet-name>darshit</servlet-name>  
		<url-pattern>/welcome</url-pattern>  
	</servlet-mapping>  
</web-app>  
```
● welcome.jsp
```bash
<%   
out.print("Welcome "+request.getParameter("uname"));  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>  
```
<br> **5) JSP application implicit object**
In JSP, application is an implicit object of type ServletContext.
The instance of ServletContext is created only once by the web container when application or project is deployed on the server.
This object can be used to get initialization parameter from configuaration file (web.xml). It can also be used to get, set or remove attribute from the application scope.
This initialization parameter can be used by all jsp pages.
<br>● Example of application implicit object:
<br>● index.html
```bash
<form action="welcome">  
	<input type="text" name="uname">  
	<input type="submit" value="go"><br/>  
</form>
```
● web.xml file
```bash
<web-app>  
	<servlet>  
		<servlet-name>Darshit</servlet-name>  
		<jsp-file>/welcome.jsp</jsp-file>  
	</servlet>  
	<servlet-mapping>  
		<servlet-name>Darshit</servlet-name>  
		<url-pattern>/welcome</url-pattern>  
	</servlet-mapping>  
	<context-param>  
		<param-name>dname</param-name>  
		<param-value>sun.jdbc.odbc.JdbcOdbcDriver</param-value>  
	</context-param>  
</web-app>  
```
● welcome.jsp
```bash
<%   
out.print("Welcome "+request.getParameter("uname"));  
String driver=application.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>  
```
<br> **6) session implicit object**
In JSP, session is an implicit object of type HttpSession.The Java developer can use this object to set,get or remove attribute or to get session information.
<br>● Example of session implicit object
<br>● index.html
```bash
<html>  
	<body>  
		<form action="welcome.jsp">  
			<input type="text" name="uname">  
			<input type="submit" value="go"><br/>  
		</form>  
	</body>  
</html>  
● welcome.jsp
```bash
<html>  
	<body>  
		<%   
		String name=request.getParameter("uname");  
		out.print("Welcome "+name);  
		session.setAttribute("user",name);  
		<a href="second.jsp">second jsp page</a>  
		%>  
	</body>  
</html>
```
● second.jsp
```bash
<html>  
	<body>  
		<%   
		String name=(String)session.getAttribute("user");  
		out.print("Hello "+name);  
		%>  
	</body>  
</html>  
```
<br> **7) pageContext implicit object**
In JSP, pageContext is an implicit object of type PageContext class.The pageContext object can be used to set,get or remove attribute from one of the following scopes: page, request, session, application In JSP, page scope is the default scope.
<br>● Example of pageContext implicit object
<br>● index.html
```bash
<html>  
	<body>  
		<form action="welcome.jsp">  
			<input type="text" name="uname">  
			<input type="submit" value="go"><br/>  
		</form>  
	</body>  
</html>
```
● welcome.jsp
```bash
<html>  
	<body>  
		<%   
		String name=request.getParameter("uname");  
		out.print("Welcome "+name);  
		pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
		<a href="second.jsp">second jsp page</a>  
		%>  
	</body>  
</html>
```
● second.jsp
```bash
<html>  
	<body>  
		<%   
		String name=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);  
		out.print("Hello "+name);  
		%>  
	</body>  
</html>  
```
<br> **8) page implicit object:**
In JSP, page is an implicit object of type Object class.This object is assigned to the reference of auto generated servlet class. It is written as:
```bash
Object page=this;
```
● For using this object it must be cast to Servlet type.For example:
```bash
<% (HttpServlet)page.log("message"); %>
```
● Since, it is of type Object it is less used because you can use this object directly in jsp.For example:
```bash
<% this.log("message"); %>
```
<br> **9) exception implicit object**
In JSP, exception is an implicit object of type java.lang.Throwable class. This object can be used to print the exception. But it can only be used in error pages.It is better to learn it after page directive. Let's see a simple example:
<br>● Example of exception implicit object:
<br>● error.jsp
```bash
<%@ page isErrorPage="true" %>  
<html>  
	<body>  
		Sorry following exception occured:<%= exception %>  
	</body>  
</html>
```
