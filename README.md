# OAMUtil
OAM Utility

From OAM 11.1.2.3 release, the OAM wlst command ListCred() is not available. If you need to access the .oamkeystore you will need to retrieve the .oamkeystore password programatically.

Compile and execute the JPSCreds.java

javac -cp .:<PATH>/Oracle.security.jps.*:<PATH>/jps-manifest.jar JPSCreds.java

java -cp .:<PATH>/Oracle.security.jps.*:<PATH>/jps-manifest.jar JPSCreds
