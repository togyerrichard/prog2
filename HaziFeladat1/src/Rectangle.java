/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Togyi
 */
public class Rectangle {
    double height;
    double width;

    public Rectangle() {
        this.height=1;
        this.width=1;
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    
    public double getPerimeter(){
        return 2 * (width+height);
        
    }
    
    public double getArea(){
        return width*height;
        
    }

    @Override
    public String toString() {
        return "A "+ width + "szélességű, " + height + "magasságú téglalap területe "+getArea() + ", kerülete pedig "+getPerimeter();
    }
    
    
    
    
}
