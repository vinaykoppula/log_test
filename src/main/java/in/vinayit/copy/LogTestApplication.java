package in.vinayit.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import in.vinayit.dao.ReportDao;
import in.vinayit.service.MessageService;

@SpringBootApplication
public class LogTestApplication {

	@Autowired
//	private ReportDao reportDao;

	public static void main(String[] args) {
		SpringApplication.run(LogTestApplication.class, args);
		MessageService service = new MessageService();
		service.getWelcomeMsg();
		service.getGreetMsg();

	}

}
