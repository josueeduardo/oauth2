/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josue.oauth.provider.ex;

/**
 *
 * @author Josue
 */
public class InvalidClientCredException extends OAuthException {

    public InvalidClientCredException() {
        super("incorrect_client_credentials", "The client_id and/or client_secret passed are incorrect.");
    }

}
