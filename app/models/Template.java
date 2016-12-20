package models;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Template {
	
	private byte[] body;
	private Map<String, String> header = new HashMap<>();
	private Map<String, String> queryString = new HashMap<>();

	public Template(byte[] body) {
		this.body = body;
	}
	
	public abstract void setValue(String fieldName, String value);
	
}
