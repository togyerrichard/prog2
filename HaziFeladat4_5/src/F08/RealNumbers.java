/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F08;

/**
 *
 * @author Togyi
 */
public interface RealNumbers {
    void add(double num);
    double get(int idx);
    void delete(int idx);
    boolean contains(double num);
    int getFirstOccurence(double num);
}
