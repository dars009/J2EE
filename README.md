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


