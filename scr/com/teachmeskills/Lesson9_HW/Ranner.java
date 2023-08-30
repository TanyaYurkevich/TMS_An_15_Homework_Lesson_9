package com.teachmeskills.Lesson9_HW;

public class Runner { public static void main(String[] args) {
    boolean UserAut = false;
    try {
        UserAut = ValidatorPasswordLogin.verificationPassLog("hyjhvgjgf", "qwe123qwe","qwe1223qwe");
    } catch (WrongLoginException e) {
        System.out.println("Ошибка ввода, запрещенный символл");
    } catch (WrongPasswordException e) {
        System.out.println("Ошибка ввода");
    }
}
}
