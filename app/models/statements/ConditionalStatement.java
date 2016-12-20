package models.statements;

import java.util.Optional;
import java.util.function.BiFunction;

import lombok.AllArgsConstructor;
import models.Request;
import models.Response;
import models.Statement;

@AllArgsConstructor
public class ConditionalStatement implements Statement {

	private Optional<Statement> left;
	private Statement right;
	private BiFunction<Request, Response, Boolean> condition;

	@Override
	public Optional<Statement> apply(Request request, Response response) {
		if (condition.apply(request, response)) {
			return Optional.of(right);
		} else if (left.isPresent()) {
			return left;
		} else {
			return Optional.empty();
		}
	}

}
