package com.devsuperior.sistemaclientes.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg) 
    {
        super(msg);
    }

}
