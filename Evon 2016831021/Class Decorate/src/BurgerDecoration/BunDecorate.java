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
public class BunDecorate extends DecorateBurger{
    
    public BunDecorate(WidgetInterface widgetInterface) {
        super(widgetInterface);
    }
    
    public void drawBurger(){
        super.drawBurger();
        System.out.println("<--- Bun --->");
        
    }
    
}
