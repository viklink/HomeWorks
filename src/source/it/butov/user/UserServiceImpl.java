package source.it.butov.user;

public class UserServiceImpl implements UserService {

	private UserRetriever userRetriever;  
	private UserValidator userValidator;

	public UserServiceImpl(UserRetriever userRetriever, UserValidator userValidator) {
		this.userRetriever = userRetriever;
		this.userValidator = userValidator;
	}

	@Override
	public User[] getAllUsers() throws Exception {
		return userRetriever.retrieve();
	}

	@Override
	public ErrorType validate(User user) {
		return userValidator.validate(user);
	}

	@Override
	public UserRetriever getUserRetriever() {
		return this.userRetriever;
	}

	@Override
	public void setUserRetriever(UserRetriever userRetriever) {
	}

	@Override
	public UserValidator getUserValidator() {
		return this.userValidator;
	}

	@Override
	public void setUserValidator(UserValidator userValidator) {
	}

}
