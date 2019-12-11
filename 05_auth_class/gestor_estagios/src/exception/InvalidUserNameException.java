/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author victor
 */
public class InvalidUserNameException extends Exception{
    
    public InvalidUserNameException() {
    }

    public InvalidUserNameException(String message) {
        super(message);
    }
    
}
