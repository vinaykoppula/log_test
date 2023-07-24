package service;

import java.util.List;

import dao.TodoRepository;
import entity.TodoItem;

public class TodoServiceImpl implements TodoService{
	private TodoItem todoItem;

	@Override
	public TodoItem addItem(TodoItem todoItem) throws ItemAlreadyExistException {
		// TODO Auto-generated method stub
		if(TodoRepository.existsById(TodoItem.getId())){
            throw new ItemAlreadyExistException();
        }
        return TodoRepository.save(todoItem);
	}

	@Override
	public List getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoItem deleteItemById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoItem addItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
