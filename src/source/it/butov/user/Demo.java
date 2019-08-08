package source.it.butov.user;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws Exception {
		UserConverter userConverter = new UserConverterImpl();
		UserRetriever userRetriever = new UserRetrieverImpl(userConverter);
		UserValidator userValidator = new UserValidatorImpl();
		UserService userService = new UserServiceImpl(userRetriever, userValidator);
		

		User[] users = userService.getAllUsers();

		Arrays.stream(users).forEach(user -> System.out.println(userService.validate(user)));

		System.out.println(Arrays.deepToString(users));
	}

}
