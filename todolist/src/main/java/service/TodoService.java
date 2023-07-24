package service;

import java.util.List;

import entity.TodoItem;

public interface TodoService {

	public TodoItem addItem();
	public List getAllItems();
	public TodoItem deleteItemById();
	TodoItem addItem(TodoItem todoItem) throws ItemAlreadyExistException;
	
}
