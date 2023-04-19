package sef.module8.activity;

import com.sun.xml.internal.ws.api.server.ThreadLocalContainerResolver;

/**
 * This class represents the exception that can be thrown if the name given to
 * an Account instance violates naming rules
 * 
 * @author John Doe
 *
 */
public class AccountException extends Exception {
	/**
	 * 
	 */
	String message;
	String name;

	public static final String NAME_TOO_SHORT = "Name must be longer than 4 characters";
	public static final String NAME_TOO_SIMPLE = "Name must contain a combination of letters and numbers";

	/**
	 * Constructs an AcountException
	 * 
	 * @param message
	 *            The message to be set explaining the name violation (see static
	 *            attributes)
	 * @param name
	 *            The actual name
	 * @throws AccountException 
	 */
	public AccountException(String message, String name) throws AccountException{
		this.message = message;
		this.name = name;
	}

	/**
	 * Returns the name passed to this Account exception
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

}
