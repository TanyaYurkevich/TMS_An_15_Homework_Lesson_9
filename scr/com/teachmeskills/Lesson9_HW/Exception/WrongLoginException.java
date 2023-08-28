package com.teachmeskills.Lesson9_HW.Exception;

public class WrongLoginException extends Exception{
    private String wrongLoginError;

    public WrongLoginException(String wrongLoginError){
        super();
    }
    public WrongLoginException(String message, String wrongLoginError) {
        super(message);
        this.wrongLoginError = wrongLoginError;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "wrongLoginError='" + wrongLoginError + '\'' +
                '}';
    }
}

