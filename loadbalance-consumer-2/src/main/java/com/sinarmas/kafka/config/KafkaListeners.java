package com.sinarmas.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	
	@KafkaListener(
			topics = "test",
			groupId = "groupId"
			)
	void listener(String data) {
		System.out.println("Listner Received: "+data+" success!");
		
	}

}
