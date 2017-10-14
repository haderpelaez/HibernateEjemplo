package co.edu.udea.iw.util.exception;

import org.apache.log4j.Logger;

/**
 * Excepcion propia de la aplicacion
 * @author Hader Pelaez Noreña - hader.pelaez@udea.edu.co
 *
 */

public class IwException extends Exception {
	
	private Logger log = Logger.getLogger(this.getClass());

	public IwException() {
		// TODO Auto-generated constructor stub
	}

	public IwException(String arg0) {
		super(arg0);
		log.error(arg0);
	}

	public IwException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public IwException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		log.error(arg0, arg1);
	}

	public IwException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

}
