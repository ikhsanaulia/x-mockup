package models.statements;

import java.util.Optional;

import lombok.AllArgsConstructor;
import models.Request;
import models.Response;
import models.Statement;

@AllArgsConstructor
public class ReplaceResponseFieldStatement implements Statement {

	private String name;
	private String value;
	private Optional<Statement> next;
	
	@Override
	public Optional<Statement> apply(Request request, Response response) {
		
		if (next.isPresent())
			return next;
		else
			return Optional.empty();
	}

}
