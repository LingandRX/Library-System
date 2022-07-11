package com.library.main;

import com.library.book.BookList;
import com.library.user.*;

import java.util.Scanner;

public class Main {

    public static User m() {
        System.out.println("请输入你的名字");
        String name = new Scanner(System.in).next();
        System.out.println("请输入你的身份");
        System.out.println("1. 普通用户 ");
        System.out.println("2. 管理员 ");
        int a = new Scanner(System.in).nextInt();
        while(true) {
            if (a == 1) {
                return new PublicUser(name);
            } else if (a == 2) {
                return new AdminUser(name);
            } else {
                System.out.println("请重新输入");
                a = new Scanner(System.in).nextInt();
            }
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = m();
        while (true) {
            user.doFunctions(user.functionNum(), bookList);
        }
    }
}
