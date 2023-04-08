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

