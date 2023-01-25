package com.ivankimanoos.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ivankimanoos.data.api.TodoService;
import com.ivankimanoos.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToString_usingAStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = 
				new TodoBusinessImpl(todoServiceStub);
		List<String> filteredTodos = 
				todoBusinessImpl.retrieveTodosRelatedToString("Dummy");
		assertEquals(2, filteredTodos.size());		
	}

}
