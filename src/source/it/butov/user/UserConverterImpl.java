package source.it.butov.user;

public class UserConverterImpl implements UserConverter {

	private static final int idIndex = 0;
	private static final int firstNameIndex = 1;
	private static final int lastNameIndex = 2;
	private static final int emailIndex = 3;
	private static final int passwordIndex = 4;
	private static final int birthdayYearIndex = 5;
	private static final int paramsQuantity = 6;

	@Override
	public User convertFromCsv(String csvString) {

		String[] params = csvString.split(";");
		User result = new User();
		if (params.length != paramsQuantity) {
			System.err.println("Cannot convert provided string -> " + csvString);
		} else {
			result.setId(Integer.parseInt(params[idIndex].trim()));
			result.setFirstName(params[firstNameIndex].trim());
			result.setLastName(params[lastNameIndex].trim());
			result.setEmail(params[emailIndex].trim());
			result.setPassword(params[passwordIndex].trim());
			result.setBirthdayYear(Integer.parseInt(params[birthdayYearIndex].trim()));
		}
		return result;
	}

}
