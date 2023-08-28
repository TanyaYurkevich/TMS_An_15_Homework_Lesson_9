package com.teachmeskills.Lesson9_HW.Exception;

public class WrongPasswordException extends  Exception{
    private String wrongPasswordError;

    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message,String wrongPasswordError) {
        super(message);
        this.wrongPasswordError = wrongPasswordError;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "wrongPasswordError='" + wrongPasswordError + '\'' +
                '}';
    }
}
