/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shout.ejb;

/**
 *
 * @author Nathalie Desrosiers
 */
public class InvalidShoutDataException extends Exception{

    public InvalidShoutDataException(String message) throws InvalidShoutDataException{
        super(message);
    }
}
