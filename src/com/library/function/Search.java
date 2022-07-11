package com.library.function;

import com.library.book.BookList;

import java.util.Scanner;

public class Search implements Function {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入书的名字");
        String name = new Scanner(System.in).next();

        for (int i = 0; i < bookList.getBookNums(); i++) {
            if (name.equals(bookList.books[i].getName())) {
                System.out.println(bookList.books[i]);
                return;
            }
        }

        System.out.println("未被找到");
    }
}
