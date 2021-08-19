package com.example.exception.dto;

public class Error {

	private String field;
	private String message;
	private String invalidValue;
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the invalidValue
	 */
	public String getInvalidValue() {
		return invalidValue;
	}
	/**
	 * @param invalidValue the invalidValue to set
	 */
	public void setInvalidValue(String invalidValue) {
		this.invalidValue = invalidValue;
	}
	
	
}
