package com.ivankimanoos.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ivankimanoos.data.api.TodoService;
import com.ivankimanoos.data.api.TodoServiceStub;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToString_usingAMock() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", 
				"Learn to Dance");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = 
				todoBusinessImpl.retrieveTodosRelatedToString("Dummy");
		
		assertEquals(2, filteredTodos.size());		
	}
	
	@Test
	public void testRetrieveTodosRelatedToString_withEmptyList() {
		
		TodoService todoServiceMock = mock(TodoService.class);
		
		List<String> todos = Arrays.asList();
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos = 
				todoBusinessImpl.retrieveTodosRelatedToString("Dummy");
		
		assertEquals(0, filteredTodos.size());		
	}

}
