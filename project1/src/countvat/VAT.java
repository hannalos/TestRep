/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvat;

/**
 *
 * @author HP
 */
public class VAT {
    public double sum;
    public VAT(double sum){
        this.sum=sum;
    }
    public double countVAT(){
        return sum*0.2;
    }
    public double countSUM(){
        return sum-(sum*0.2);
    }
}
