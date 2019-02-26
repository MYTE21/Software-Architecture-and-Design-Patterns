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
public class burgerDecorator {
    public static void main(String[] args) {
        WidgetInterface widgetInterface = new BunDecorate(new LattuceLeafDecorate(new CheeseDecorate(new MeatDecorate(new CheeseDecorate(new LattuceLeafDecorate(new BunDecorate(new burgerSize())))))));
        widgetInterface.drawBurger();
    }
}
