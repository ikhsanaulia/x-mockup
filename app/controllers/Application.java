package controllers;

import javax.inject.Inject;

import play.libs.Json;
import play.mvc.*;
import services.MockupService;
import services.MockupService.Mock;

public class Application extends Controller {

	@Inject
	MockupService mockupService;

	public Result index() {
		return ok();
	}

	public Result mockup(String system, String module, String action) {
		return ok(Json.toJson(mockupService.mock(new Mock(system, module, action))));
	}
	
}
