package source.it.butov.user;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserRetrieverImpl implements UserRetriever {

	private UserConverter userConverter;

	public UserRetrieverImpl(UserConverter userConverter) {
		this.userConverter = userConverter;
	}

	@Override
	public User[] retrieve() throws Exception {
		User[] result = new User[getUsersCount()];

		try (Scanner scanner = new Scanner(new File("hometask.txt"))) {
			int index = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (!line.startsWith("#")) {
					User user = userConverter.convertFromCsv(line);
					result[index] = user;
					index++;
				}
			}
		}
		return result;
	}

	@Override
	public UserConverter getConverter() {
		return this.userConverter;
	}

	private int getUsersCount() throws IOException {
		return (int)Files.lines(Paths.get("hometask.txt")).filter(line -> !line.startsWith("#")).count();
	}

}
