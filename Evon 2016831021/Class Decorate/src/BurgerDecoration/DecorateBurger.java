/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BurgerDecoration;

/**
 *
 * @author user
 */
public class DecorateBurger implements WidgetInterface{
    
    private final WidgetInterface widgetInterface ;
    
    public DecorateBurger(WidgetInterface widgetInterface){
        this.widgetInterface = widgetInterface ;
    }

    @Override
    public void drawBurger() {
        widgetInterface.drawBurger();
    }
    
}
