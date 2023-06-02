/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.studentweb.CustomExceptions;

/**
 *
 * @author Vladyslav
 */
public class EmailException extends Exception{

    public EmailException() {
        super("invalid email type");
    }
    
}
