package com.Temp_Arduino_be.Temp_Arduino_be;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

@Service
public class TempService {

	private final MongoOperations mongoOperations;

	public TempService(MongoOperations mongoOperations) {
		this.mongoOperations = mongoOperations;
	}

	public Temp addDht11SensorData (Temp temp) {
		temp.setTimeStamp(LocalDateTime.now());
		return mongoOperations.insert(temp);

	}

	public List<Temp> getAllDht11SensorData () {
		return mongoOperations.findAll(Temp.class);
	}
		
}
