package telran.ashkelon2020.accounting.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class BannedUserException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2655495674803614064L;

	public BannedUserException(String login) {
		super("User " + login + " is banned");
	}
}
