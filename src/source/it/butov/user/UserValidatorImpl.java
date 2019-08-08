package source.it.butov.user;

public class UserValidatorImpl implements UserValidator {

	private static final String firstNameRegex = "[a-zA-Z] {1,30}";
	private static final String lastNameRegex = "[a-zA-Z] {1,30}";
	private static final String emailRegex = "\\w*[@][a-z] {1,20}\\.[a-z] {2,3}";
	private static final String passwordRegex = ".{6,20}";

	@Override
	public ErrorType validate(User user) {
		
		ErrorType result = checkFirstName(user);
		
		if (result == null) {
			result = checkLastName(user);
		}
		if (result == null) {
			result = checkEmail(user);
		}
		if (result == null) {
			result = checkPassword(user);
		}

		return result;
	}


	private ErrorType checkFirstName(User user) {

		boolean result = user.getFirstName().matches(firstNameRegex);

		return result ? null : ErrorType.BAD_FIRST_NAME;
	}

	private ErrorType checkLastName(User user) {

		boolean result = user.getLastName().matches(lastNameRegex);

		return result ? null : ErrorType.BAD_LAST_NAME;
	}
	
	private ErrorType checkEmail(User user) {
		
		boolean result = user.getEmail().matches(emailRegex);
		
		return result ? null : ErrorType.BAD_EMAIL;
	}
	
	private ErrorType checkPassword (User user) {
		
		boolean result = user.getPassword().matches(passwordRegex);
		
		return result ? null : ErrorType.BAD_PASSWORD;
	}

}
