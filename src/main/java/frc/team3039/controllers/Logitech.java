package frc.team3039.controllers;

/**
 * Contains functions for use with the Logitech Controller.
 * @author Joshua Lewis joshlewi14@gmail.com
 */
public class Logitech extends ButtonMap {
//Logitech Button Mapping
public Logitech() {

    this.AXIS_LEFT_X = 0;
    this.AXIS_LEFT_Y = 1;
    this.AXIS_RIGHT_X= 2;
    this.AXIS_RIGHT_Y= 3;
    
    this.BUTTON_SQAURE = 1;
    this.BUTTON_X = 2;
    this.BUTTON_CIRCLE = 3;
    this.BUTTON_TRIANGLE = 4;
    this.BUTTON_LEFT_BUMPER = 5;	
    this.BUTTON_RIGHT_BUMPER = 6;
    this.BUTTON_LEFT_TRIGGER = 7;
    this.BUTTON_RIGHT_TRIGGER = 8;
    this.BUTTON_SHARE = 9;          //Back Button        
    this.BUTTON_OPTIONS = 10;       //Start Button    
    this.BUTTON_LEFT_JOYSTICK = 11;
    this.BUTTON_RIGHT_JOYSTICK = 12;
       
    }
}