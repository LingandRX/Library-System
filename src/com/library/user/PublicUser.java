package com.library.user;

import com.library.function.*;

import java.util.Scanner;

public class PublicUser extends User {
    public PublicUser(String name) {
        super(name);
        System.out.println("欢迎" + name);
        functions = new Function[] {
                new Search(),
                new Borrow(),
                new Return(),
                new Exit()
        };
    }

    @Override
    public int functionNum() {
        while (true) {
            System.out.println("1. 借阅图书");
            System.out.println("2. 归还图书");
            System.out.println("3. 查找图书");
            System.out.println("4. 退出系统");
            System.out.println("请输入你的选择:");
            int a = new Scanner(System.in).nextInt();
            while (true) {
                if (!(a > 4 || a < 0)) {
                    return a - 1;
                } else {
                    System.out.println("请重新输入");
                    a = new Scanner(System.in).nextInt();
                }
            }
        }
    }
}
