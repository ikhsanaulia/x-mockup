package models;

import java.util.Optional;

public interface Statement {
	Optional<Statement> apply(Request request, Response response);
}
