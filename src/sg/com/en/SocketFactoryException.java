package sg.com.en;

import java.net.SocketException;

/**
 * SocketFactoryException contains the response message 
 * from the proxy.
 * @author Ernest Neo [ernestneo at en.com.sg]
 *
 */
public class SocketFactoryException extends SocketException
{
	private String response;
	
	public SocketFactoryException(String msg, String response)
	{
		super(msg);
		this.response = response;
	}
	
	public String getResponse() {
		return this.response;
	}
}
