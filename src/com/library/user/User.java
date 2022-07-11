package com.library.user;

import com.library.book.BookList;
import com.library.function.Function;

public abstract class User {
    private String name;
    Function functions[];
    public User(String name) {
        this.name = name;
    }

    public abstract int functionNum();

    public void doFunctions(int i, BookList bookList) {
        functions[i].work(bookList);
    }
}
