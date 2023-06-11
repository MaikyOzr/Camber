package com.roma.Camber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class CamberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamberApplication.class, args);
		try {
			TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
			api.registerBot(new CamberBot());
		} catch (TelegramApiException e) {
			throw new RuntimeException(e);
		}
	}

}
