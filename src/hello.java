import com.fundebug.Fundebug;

public class hello {

	public static void main(String[] args) {
		Fundebug fundebug = new Fundebug("apikey");
		fundebug.notify("TEST", "Hello, Fundebug!");
		System.out.println("Hello, World");
	}

}
