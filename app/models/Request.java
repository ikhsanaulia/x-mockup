package models;

import lombok.ToString;

@ToString
public abstract class Request extends Template {
	
	public Request(byte[] body) {
		super(body);
	}
}
