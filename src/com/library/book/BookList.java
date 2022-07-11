package com.library.book;

public class BookList {
    public Book [] books = new Book[10];
    private int bookNums;

    {
        books[0] = new Book("java", "张三", 12, "计算机", false);
        books[1] = new Book("java", "张三", 12, "计算机", false);
        books[2] = new Book("java", "张三", 12, "计算机", false);
        bookNums = 3;
    }

    public int getBookNums() {
        return bookNums;
    }

    public void setBookNums(int bookNums) {
        this.bookNums = bookNums;
    }
}
