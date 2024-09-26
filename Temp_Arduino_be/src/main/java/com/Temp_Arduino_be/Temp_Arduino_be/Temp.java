package com.Temp_Arduino_be.Temp_Arduino_be;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Temp {

	@Id
	private String id;
	private double celsius;
	private double humidity;
	private LocalDateTime timestamp;

	public Temp(String id, double celsius, double humidity, LocalDateTime timestamp) {
		this.id = id;
		this.celsius = celsius;
		this.humidity = humidity;
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	
	
}
