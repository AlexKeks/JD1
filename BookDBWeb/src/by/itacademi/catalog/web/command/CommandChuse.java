package by.itacademi.catalog.web.command;

import by.itacademi.catalog.web.command.impl.AddBook;
import by.itacademi.catalog.web.command.impl.AddBookAction;
import by.itacademi.catalog.web.command.impl.DeleteBook;
import by.itacademi.catalog.web.command.impl.DeleteBookAction;
import by.itacademi.catalog.web.command.impl.ViewBookId;
import by.itacademi.catalog.web.command.impl.ViewBookList;
import by.itacademi.catalog.web.command.impl.View_Book;

public class CommandChuse {

	public  static BasicAction perforAction(ActionType action){
		
		BasicAction basicAction = null;
		
		switch(action){
		case ADD_BOOK:
			basicAction = new AddBook();
			break;
		case ADD_BOOK_ACTION:
			basicAction = new AddBookAction();
			break;
		case DELETE_BOOK:
			basicAction = new DeleteBook();
			break;
		case DELETE_BOOK_ACTION:
			basicAction = new DeleteBookAction();
			break;
		case VIEW_BOOK:
			basicAction = new View_Book();
			break;
		case VIEW_BOOK_LIST:
			basicAction = new ViewBookList();
			break;
		case VIEW_BOOK_BY_ID:
			basicAction = new ViewBookId();
		}
		
		return basicAction;
	}
		
	

}
