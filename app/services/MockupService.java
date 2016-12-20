package services;

import services.impl.MockupServiceImpl;

import com.google.inject.ImplementedBy;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ImplementedBy(MockupServiceImpl.class)
public interface MockupService {

	public Object mock(Mock mock);
	
	@Getter
	@Setter
	@ToString
	@EqualsAndHashCode
	@AllArgsConstructor
	public static class Mock {
		
		private String system;
		private String module;
		private String action;
	}
}
