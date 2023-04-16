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
## JSP Scriptlet tag (Scripting elements)
<br>● In JSP, java code can be written inside the jsp page using the scriptlet tag. Let's see what are the scripting elements first.
<br>● The scripting elements provides the ability to insert java code inside the jsp. There are three types of scripting elements:
<br>● **scriptlet** tag
<br>● **expression** tag
<br>● **declaration** tag

**JSP scriptlet tag**
<br> A scriptlet tag is used to execute java source code in JSP. Syntax is as follows:
```bash
<%  java source code %>  
```
<br> Example of JSP scriptlet tag
<br> In this example, we are displaying a welcome message.
```bash
<html>  
	<body>  
		<% out.print("welcome to jsp"); %>  
	</body>  
</html> 
```
<br> Example of JSP scriptlet tag that prints the user name
<br> In this example, we have created two files index.html and welcome.jsp. The index.html file gets the username from the user and the welcome.jsp file prints the <br> username with the welcome message.
<br> index.html
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
welcome.jsp
```bash
<html>  
	<body>  
		<%  
		String name=request.getParameter("uname");  
		out.print("welcome "+name);  
		%>  
	</body>  
</html>  
```	
**JSP expression tag**
<br> The code placed within JSP expression tag is written to the output stream of the response. So you need not write out.print() to write data. It is mainly used to print the values of variable or method.
<br> Syntax of JSP expression tag
```bash
<%=  statement %>  
```
<br> Example of JSP expression tag
<br> In this example of jsp expression tag, we are simply displaying a welcome message.
```bash
<html>  
	<body>  
		<%= "welcome to jsp" %>  
	</body>  
</html>
```
Note: Do not end your statement with semicolon in case of expression tag.
<br> Example of JSP expression tag that prints current time To display the current time, we have used the getTime() method of Calendar class. The getTime() is an instance method of Calendar class, so we have called it after getting the instance of Calendar class by the getInstance() method.
<br> index.jsp
```bash
<html>  
	<body>  
		Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
	</body>  
</html>  
```
<br> Example of JSP expression tag that prints the user name In this example, we are printing the username using the expression tag. The index.html file gets the username and sends the request to the welcome.jsp file, which displays the username.
<br> index.jsp
```bash
<html>  
	<body>  
		<form action="welcome.jsp">  
			<input type="text" name="uname"><br/>  
			<input type="submit" value="go">  
		</form>  
	</body>  
</html>  
```
<br> welcome.jsp
```bash
<html>  
	<body>  
		<%= "Welcome "+request.getParameter("uname") %>  
	</body>  
</html> 
```
**JSP declaration tag**
<br> The code written inside the jsp declaration tag is placed outside the service() method of auto generated servlet.
<br> So it doesn't get memory at each request.
<br> Syntax of the declaration tag is as follows:
```bash
<%!  field or method declaration %>  
```
**Difference between JSP Scriptlet tag and Declaration tag**
<br> Jsp Scriptlet Tag	
<br>● The jsp scriptlet tag can only declare variables not methods.	
<br>● The declaration of scriptlet tag is placed inside the _jspService() method.
<br> Jsp Declaration Tag
<br>● The jsp declaration tag can declare variables as well as methods.
<br>● The declaration of jsp declaration tag is placed outside the _jspService() method.

<br>● Example of JSP declaration tag that declares field. In this example of JSP declaration tag, we are declaring the field and printing the value of the declared field using the jsp expression tag.
<br>● index.jsp
```bash
<html>  
	<body>  
		<%! int data=50; %>  
		<%= "Value of the variable is:"+data %>  
	</body>  
</html>  
```
<br> Example of JSP declaration tag that declares method
<br> In this example of JSP declaration tag, we are defining the method which returns the cube of given number and calling this method from the jsp expression tag. But we can also use jsp scriptlet tag to call the declared method.
<br> index.jsp
```bash
<html>  
	<body>  
		<%!   
			int cube(int n){  
				return n*n*n*;  
			}  
		%>  
		<%= "Cube of 3 is:"+cube(3) %>  
	</body>  
</html>  
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
<br>● The JSP request is an implicit object of type HttpServletRequest i.e. created for each jsp request by the web container. It can be used to get request information such as parameter, header information, remote address, server name, server port, content type, character encoding etc.
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
<br>● In JSP, response is an implicit object of type HttpServletResponse. The instance of HttpServletResponse is created by the web container for each jsp request.
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
<br>● In JSP, config is an implicit object of type ServletConfig. This object can be used to get initialization parameter for a particular JSP page. The config object is created by the web container for each jsp page.
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
<br>● In JSP, application is an implicit object of type ServletContext.
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
<br>● In JSP, session is an implicit object of type HttpSession.The Java developer can use this object to set,get or remove attribute or to get session information.
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
<br>● In JSP, pageContext is an implicit object of type PageContext class.The pageContext object can be used to set,get or remove attribute from one of the following scopes: page, request, session, application In JSP, page scope is the default scope.
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
<br>● In JSP, page is an implicit object of type Object class.This object is assigned to the reference of auto generated servlet class. It is written as:
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
<br>● In JSP, exception is an implicit object of type java.lang.Throwable class. This object can be used to print the exception. But it can only be used in error pages.It is better to learn it after page directive. Let's see a simple example:
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
## JSP directives
The jsp directives are messages that tells the web container how to translate a JSP page into the corresponding servlet.
<br>● There are three types of directives:
<br> 1) page directive
<br> 2) include directive
<br> 3) taglib directive
<br> Syntax of JSP Directive
```bash
<%@ directive attribute="value" %>  
```
**JSP page directive**

**1) import**
<br> The import attribute is used to import class,interface or all the members of a package.It is similar to import keyword in java class or interface.
<br> Example of import attribute
```bash
<html>  
	<body>  
		<%@ page import="java.util.Date" %>  
		Today is: <%= new Date() %>  
	</body>  
</html>  
```
**2) contentType**
<br> The contentType attribute defines the MIME(Multipurpose Internet Mail Extension) type of the HTTP response.The default value is "text/html;charset=ISO-8859-1".
<br> Example of contentType attribute
```bash
<html>  
	<body>  
  		<%@ page contentType=application/msword %>  
		Today is: <%= new java.util.Date() %>  
  	</body>  
</html>  
```
**3) extends**
<br> The extends attribute defines the parent class that will be inherited by the generated servlet.It is rarely used.
**4) info**
<br> This attribute simply sets the information of the JSP page which is retrieved later by using getServletInfo() method of Servlet interface.
<br> Example of info attribute
```bash
<html>  
	<body>  
  		<%@ page info="composed by Sonoo Jaiswal" %>  
		Today is: <%= new java.util.Date() %> 
	</body>  
</html>  
```
<br> The web container will create a method getServletInfo() in the resulting servlet.For example:
```bash
public String getServletInfo() {  
  	return "composed by Darshit R";   
}  
```
**5) buffer**
<br> The buffer attribute sets the buffer size in kilobytes to handle output generated by the JSP page.The default size of the buffer is 8Kb.
<br> Example of buffer attribute
```bash
<html>  
	<body>  
  		<%@ page buffer="16kb" %>  
		Today is: <%= new java.util.Date() %>  
	</body>  
</html> 
```
**6) language**
<br> The language attribute specifies the scripting language used in the JSP page. The default value is "java".
**7)isELIgnored**
<br> We can ignore the Expression Language (EL) in jsp by the isELIgnored attribute. By default its value is false i.e. Expression Language is enabled by default. We see Expression Language later.
```bash
<%@ page isELIgnored="true" %>//Now EL will be ignored  
```
**8) isThreadSafe**
<br> Servlet and JSP both are multithreaded.If you want to control this behaviour of JSP page, you can use isThreadSafe attribute of page directive.The value of isThreadSafe value is true.If you make it false, the web container will serialize the multiple requests, i.e. it will wait until the JSP finishes responding to a request before passing another request to it.If you make the value of isThreadSafe attribute like:
```bash
<%@ page isThreadSafe="false" %>
```
The web container in such a case, will generate the servlet as:
```bash
public class SimplePage_jsp extends HttpJspBase implements SingleThreadModel{  
	.......  
}  
```
**9) errorPage**
<br> The errorPage attribute is used to define the error page, if exception occurs in the current page, it will be redirected to the error page.
<br> Example of errorPage attribute
<br> index.jsp  
```bash
<html>  
	<body>  
		<%@ page errorPage="myerrorpage.jsp" %>  
		<%= 100/0 %>  
	</body>  
</html>
```
**10)isErrorPage**
<br> The isErrorPage attribute is used to declare that the current page is the error page.
<br> Note: The exception object can only be used in the error page.
<br> Example of isErrorPage attribute
<br> myerrorpage.jsp  
```bash
<html>  
	<body>  
		<%@ page isErrorPage="true" %>  
		Sorry an exception occured!<br/>  
		The exception is: <%= exception %>  
	</body>  
</html>  
```
**Jsp Include Directive**
<br> The include directive is used to include the contents of any resource it may be jsp file, html file or text file. The include directive includes the original content of the included resource at page translation time (the jsp page is translated only once so it will be better to include static resource).
<br> Advantage of Include directive
<br> Code Reusability
<br> Syntax of include directive
```bash
<%@ include file="resourceName" %>  
```
<br> Example of include directive
<br> In this example, we are including the content of the header.html file. To run this example you must create an header.html file.
```bash
<html>  
	<body>  
  		<%@ include file="header.html" %>  
		Today is: <%= java.util.Calendar.getInstance().getTime() %>  
  	</body>
</html>  
```
Note: The include directive includes the original content, so the actual page size grows at runtime.
	
**JSP Taglib directive**
<br> The JSP taglib directive is used to define a tag library that defines many tags. We use the TLD (Tag Library Descriptor) file to define the tags. In the custom tag section we will use this tag so it will be better to learn it in custom tag.
<br> Syntax JSP Taglib directive
```bash
<%@ taglib uri="uriofthetaglibrary" prefix="prefixoftaglibrary" %>  
```
Example of JSP Taglib directive
<br> In this example, we are using our tag named currentDate. To use this tag we must specify the taglib directive so the container may get information about the tag.
```bash
<html>  
	<body>  
		<%@ taglib uri="http://www.javatpoint.com/tags" prefix="mytag" %>  
		<mytag:currentDate/>  
	</body>  
</html> 
```
