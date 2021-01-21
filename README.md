# OSGIDiscountCalculator
 

prerequisite:
* Eclipse 
* Java sdk 11  
* Setup osgi plugin 


To setup sdk 11;
1. Open Eclipse
2. Go to Window->Preference->Java->Compiler -> on Compiler Compliance level, Pick 11
3. Go to Window->Preference-> Java -> Installed JRE -> pick jdk 11 or higher(make sure it is installed in your computer)

  If jdk 11 or higher not available-> install and download jdk 11 --> then go to window->preference->Java->Installed JRE->And add new
->Standard VM->Click Directory->point to your jdk 11 installation file(usually in program files/java/jdk11 etc) and click  finish
	

# TO setup plugin

1. Choose 'Window' -> 'Preferences' menu from Eclipse.
2. From 'Preferences' dialog window, select 'User Libraries' under 'Java' -> 'Build Path'. Click on 'New' button.
3. Type 'Equinox' in the 'User library name' field. Click on 'OK' button.
4. Select the newly created 'Equinox' library, click on 'Add External Jars', browse to 'plugins' folder under Eclipse installation to locate the file 'org.eclipse.osgi_3.8.0.v20120830-144521.jar' and click on 'Open' button. As mentioned above, the trailing numerical part of the filename could be different in your environment.
5. Click on 'Ok' button.

## if the plugin is not available in /plugin/eclipses
download from http://download.eclipse.org/releases/2019-09/201909181001/plugins/org.eclipse.osgi_3.15.0.v20190830-1434.jar and put in plugin folder and 
repeat the steps 4

6. The OSGi runtime framework bundle gets added to the library 'Equinox'.

5. Now, to add the newly created libraries to your project: 
	- Right-click on the project - 'Launcher'.
	- Go to 'Build Path' -> 'Configure Build Path'. 
	- Go to 'Libraries' tab. Click on 'Add Library' button from the right panel. 
	- Select 'User Library'. Click on 'Next'. 
	- Select the check box - 'Equinox'. Click on 'Finish'. Then click on 'OK'. The user library will get added to your project.



# To run:
 * -import All project
 * -run launcher

