import java.security.AccessController;
import java.security.PrivilegedExceptionAction;

import oracle.security.jps.JpsContext;
import oracle.security.jps.JpsContextFactory;
import oracle.security.jps.service.credstore.CredentialStore;
import oracle.security.jps.service.credstore.PasswordCredential;


public class JPSCreds {

	public static void main(String[] args) throws Exception {
		//Path of the jps-config-jse.xml
		System.setProperty("oracle.security.jps.config",
		"jps-config-jse.xml");

		String password = null;
		JpsContext jpsContext = JpsContextFactory.getContextFactory().getContext();
		final CredentialStore credentialStore = (CredentialStore)jpsContext.getServiceInstance(CredentialStore.class);
		credentialStore.refresh();

		if (credentialStore.containsCredential("OAM_STORE", "jks")) {
			PasswordCredential passwordCred =
			(PasswordCredential)credentialStore.getCredential("OAM_STORE", "jks");
			password = new String(passwordCred.getPassword());
		}

		System.out.println(password);
	}

}
