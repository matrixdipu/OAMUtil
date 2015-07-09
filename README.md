# OAMUtil
OAM Utility

From OAM 11.1.2.3 release, the OAM wlst command ListCred() is not available. If you need to access the .oamkeystore you will need to [retrieve the .oamkeystore password programatically](http://howtoidm.blogspot.com/2015/07/how-to-retrieve-oamkeystore-oamstore.html).

Compile and execute the JPSCreds.java

javac -cp .:<PATH>/Oracle.security.jps.*:<PATH>/jps-manifest.jar JPSCreds.java

java -cp .:<PATH>/Oracle.security.jps.*:<PATH>/jps-manifest.jar JPSCreds
