package com.library.function;

import com.library.book.Book;
import com.library.book.BookList;

import java.util.Scanner;

public class AddBook implements Function {
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入图书名字");
        String name = new Scanner(System.in).next();
        System.out.println("请输入图书作者");
        String author = new Scanner(System.in).next();
        System.out.println("请输入图书价格");
        int price = new Scanner(System.in).nextInt();
        System.out.println("请输入图书类型");
        String type = new Scanner(System.in).next();
        bookList.books[bookList.getBookNums()] = new Book(name, author, price, type, false);
        bookList.setBookNums(bookList.getBookNums()+1);
        System.out.println("添加完成");
    }
}
