package com.library.function;

import com.library.book.BookList;

import java.util.Scanner;

public class Return implements Function {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入书的名字");
        String name = new Scanner(System.in).next();

        for (int i = 0; i < bookList.getBookNums(); i++) {
            if (name.equals(bookList.books[i].getName())) {
                if (bookList.books[i].isBorrow()) {
                    bookList.books[i].setBorrow(false);
                    System.out.println("归还成功");
                } else {
                    System.out.println("未被借出");
                }
                return;
            }
        }

        System.out.println("没有这本书");
    }
}
