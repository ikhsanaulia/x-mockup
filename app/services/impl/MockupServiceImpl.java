package services.impl;

import javax.inject.Singleton;

import com.fasterxml.jackson.annotation.JsonProperty;

import play.mvc.Controller;
import play.mvc.Http;
import services.MockupService;

@Singleton
public class MockupServiceImpl implements MockupService {

	@Override
	public Object mock(Mock mock) {
		
		Http.Context context = Controller.ctx();
		
		return new Object() {
			
			@JsonProperty
			String system = mock.getSystem();
			
			@JsonProperty
			String module = mock.getModule();
			
			@JsonProperty
			String action = mock.getAction();
			
		};
	}

}
