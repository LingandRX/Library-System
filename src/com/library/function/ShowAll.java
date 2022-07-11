package com.library.function;

import com.library.book.BookList;

public class ShowAll implements Function {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getBookNums(); i++) {
            System.out.println(bookList.books[i]);
        }
    }
}
