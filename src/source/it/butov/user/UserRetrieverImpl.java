package source.it.butov.user;

import java.io.File;
import java.util.Scanner;

public class UserRetrieverImpl implements UserRetriever {

	private UserConverter userConverter;
	private String csvString;

	public UserRetrieverImpl(UserConverter userConverter) {

	}

	@Override
	public User[] retrieve() throws Exception {

		// User[] users = null;

		Scanner scanner = new Scanner(new File("hometask.txt"));

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine().trim();
			if (line.startsWith("#")) {
				continue;
			}
		}
		scanner.close();

		User user = userConverter.convertFromCsv(csvString);
		
		User[] params = new User[6];
		
		// как поместить эти параметры юзера в массив?
		
		int id = user.getId();
		String firstName = user.getFirstName();
		String lastName = user.getLastName();
		String email = user.getEmail();
		String password = user.getPassword();
		int birthdayYear = user.getBirthdayYear();
		
		return params;
	}

	@Override
	public UserConverter getConverter() {

		return userConverter;
	}

}
