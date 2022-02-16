package exe.reflection;

public class ReflectionExe {

	public static void main(String[] args) {
		try {
			Class<?> forName = Class.forName("Test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
