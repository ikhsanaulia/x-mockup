package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public abstract class Response extends Template {
	
	public Response(byte[] body) {
		super(body);
	}

	@Getter
	@Setter
	private int responseCode = 200;

}
