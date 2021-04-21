package com.example.demo.exception;

public class NoticeNotFoundException extends RuntimeException{
  public NoticeNotFoundException(String message) {
    super(message);
  }
}
