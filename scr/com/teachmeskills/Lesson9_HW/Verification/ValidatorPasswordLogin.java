package com.teachmeskills.Lesson9_HW.Verification;

public class ValidatorPasswordLogin {
    public static boolean verificationPassLog(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин введен некорректно. ");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches("^[A-Za-z]+[0-9]+$")) {
            throw new WrongPasswordException("Пароль введен некорректно");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }

        return true;
    }
}
