package wizut.tpsi.ogloszenia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// oznakowania - lab1 = furka4u cz.1, lab2 = cz.2 itd...
@SpringBootApplication
public class OgloszeniaApplication {

	public static void main(String[] args) {
		System.out.println("ch1");
		SpringApplication.run(OgloszeniaApplication.class, args);
	}

}
