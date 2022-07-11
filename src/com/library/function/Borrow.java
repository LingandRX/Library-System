package com.library.function;

import com.library.book.BookList;

import java.util.Scanner;

public class Borrow implements Function {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入要借阅书的名字");
        String name = new Scanner(System.in).next();

        for (int i = 0; i < bookList.getBookNums(); i++) {
            if (name.equals(bookList.books[i].getName())) {
                if (!bookList.books[i].isBorrow()) {
                    bookList.books[i].setBorrow(true);
                    System.out.println("借阅成功");
                } else {
                    System.out.println("该书已经借出");
                }
                return ;
            }
        }

        System.out.println("暂无这本书");
    }
}
