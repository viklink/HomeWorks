package source.it.butov.user;

public class UserConverterImpl implements UserConverter {
	
	
	User user = new User();
	
	@Override
	public User convertFromCsv(String csvString) {
	
		String[] params = csvString.split(";"); // split("\\s*;\\s*");
		
		int id = Integer.parseInt(params[0]);
		String firstName = params[1];
		String lastName = params[2];
		String email = params[3];
		String password = params[4];
		int birthdayYear = Integer.parseInt(params[5]);
		
		User user = new User();
		
		user.setId(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setBirthdayYear(birthdayYear);
		
		return user;
	}
	

}
