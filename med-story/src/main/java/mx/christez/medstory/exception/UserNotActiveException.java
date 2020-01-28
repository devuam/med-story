package mx.christez.medstory.exception;

public class UserNotActiveException extends Exception{
	private static final long serialVersionUID = 1L;

	public UserNotActiveException() {
		super("Usuario no activado. Es necesario activar tu cuenta antes de recuperar tu contraseña");
	}
}
