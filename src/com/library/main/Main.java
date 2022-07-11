package com.library.main;

import com.library.book.BookList;
import com.library.user.*;

import java.util.Scanner;

public class Main {

    public static User m() {
        String name = "";
        System.out.println("请输入你的名字");
        for (int i = 0; i < 3; i++) {
            name = new Scanner(System.in).next();
            if (!(isChinese(name) || isEnglish(name))) {
                System.out.println("请重新输入你的名字, " + (i + 1));
            } else {
                break;
            }
        }
        if (!(isChinese(name) || isEnglish(name))) {
            System.out.println("没有输入正确的名字三次，已退出程序");
            System.exit(0);
        }
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

    public static boolean isChinese(String cns) {
        String regex = "[(\\u4e00-\\u9fa5)]{0,5}";
        return cns.matches(regex);
    }

    public static boolean isEnglish(String ens) {
        String regex = "[a-zA-Z]{2,11}";
        return ens.matches(regex);
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = m();
        while (true) {
            user.doFunctions(user.functionNum(), bookList);
        }
    }
}
