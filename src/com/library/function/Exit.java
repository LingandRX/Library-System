package com.library.function;

import com.library.book.BookList;

public class Exit implements Function{
    @Override
    public void work(BookList bookList) {
        System.exit(0);
    }
}
