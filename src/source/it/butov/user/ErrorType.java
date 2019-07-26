package source.it.butov.user;

public enum ErrorType {

	BAD_FIRST_NAME("First name should contain only letters"),
	BAD_LAST_NAME("Last name should contain only letters"),
	BAD_EMAIL("Bad email format"),
	BAD_PASSWORD("Your password does not match all the requirenments");

	private String errorMessage;

	private ErrorType(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}