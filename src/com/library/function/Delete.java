package com.library.function;

import com.library.book.BookList;

import java.util.Scanner;

public class Delete implements Function {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要删除书的名字");
        String name = new Scanner(System.in).next();

        for (int i = 0; i < bookList.getBookNums(); i++) {
            if (name.equals(bookList.books[i].getName())) {
                for (int j = 0; j < bookList.getBookNums() - i - 1; j++) {
                    bookList.books[i+1] = bookList.books[i+j+1];
                }
                bookList.setBookNums(bookList.getBookNums() - 1);
                System.out.println("删除成功 ");
                return;
            }
        }

        System.out.println("没有这本书");
    }
}
