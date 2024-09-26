package com.Temp_Arduino_be.Temp_Arduino_be;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TempController {
	
	private TempService tempService;

	public TempController(TempService tempService) {
		this.tempService = tempService;
	}

	@PostMapping("/post-dht11-sensor-data")
	public Temp postDht11SensorDataToDb(@RequestBody Temp temp) {
		return tempService.addDht11SensorData(temp);
	}

	@GetMapping("/get-all-dht11-sensor-data")
	public List<Temp> getAllDht11SensorDataFromDb() {
		return tempService.getAllDht11SensorData();
	}
}
