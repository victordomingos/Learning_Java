/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author EFA
 */
public class InvalidLicensePlateException extends Exception {

    public InvalidLicensePlateException() {
    }

    public InvalidLicensePlateException(String message) {
        super(message);
    }
    
}
