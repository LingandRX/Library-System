package com.library.book;

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;

    private boolean isBorrow;

    public Book() {

    }

    public Book(String name, String author, int price, String type, boolean isBorrow) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBorrow = isBorrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }

    @Override
    public String toString() {
        if (isBorrow) {
            return "{书名:" + name +
                    ", 作者:" + author +
                    ", 价格:" + price +
                    ", 类型:" + type +
                    ", 已借出}";
        } else {
            return "{书名:" + name +
                    ", 作者:" + author +
                    ", 价格:" + price +
                    ", 类型:" + type +
                    ", 未借出}";
        }
    }
}
