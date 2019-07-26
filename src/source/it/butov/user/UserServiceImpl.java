package source.it.butov.user;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

	// private User[] users;
	ErrorType result;
	UserRetriever userRetriever;
	UserValidator userValidator;

	public UserServiceImpl(UserRetriever userRetriever, UserValidator userValidator) {

	}

	// User user = userRetriever.retrieve();

	@Override
	public User[] getAllUsers() throws Exception {

		User user = new User();

		User[] users = new User[6];

		for (int i = 0; i < users.length; i++) {

			users[i] = new User();

		}
		return users;
	}

	@Override
	public ErrorType validate(User user) {

		// ErrorType result = userValidator.validate(user);

		return result;
	}

	@Override
	public UserRetriever getUserRetriever() {

		return userRetriever;
	}

	@Override
	public void setUserRetriever(UserRetriever userRetriever) {

	}

	@Override
	public UserValidator getUserValidator() {

		return userValidator;
	}

	@Override
	public void setUserValidator(UserValidator userValidator) {

	}

}
