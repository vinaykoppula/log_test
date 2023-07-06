package in.vinayit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService {

	private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
	public String getWelcomeMsg() {
		logger.info("getWelcomeMsg() - method start");
		String msg = "Welocme to Vinayit";
		logger.info("getWelcomeMsg() - method end");
		return msg;
	}
	public String getGreetMsg() {
		logger.info("getGreetMsg() - method start");
		String msg = "Good morning...!";
		logger.info("getGreetMsg() - method end");
		return msg;
	}
}
