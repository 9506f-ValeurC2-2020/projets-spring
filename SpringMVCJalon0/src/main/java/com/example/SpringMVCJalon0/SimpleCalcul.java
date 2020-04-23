/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMVCJalon0;



/**
 *
 * @author jalal
 */

public class SimpleCalcul {
    int a;
    int b;
    String op;
    
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public String getOp(){
        return op;
    }
    
    public double getResultat(){
        return calcul(a,b);
    }
    
    public String typeCalcul(){
        switch(op){
            case "plus":return "addition";
            case "moins":return "soustraction";
            case "division": if(b==0){
                    return "division par zero...Erreur";
            }
            return "division";
            case "fois":
                return "multiplication";
            default:return "rien";
        }
    }
    
    public SimpleCalcul(int a,int b,String op){
     this.a = a;
     this.b = b;
     this.op = op;
    }
    double calcul(int a,int b){
        double resultat = 0;
        switch(op){
            case "plus":resultat = a+b;
                break;
            case "moins":
                resultat = a-b;
                        break;
            case "division": if(b==0){
                    break;
            }
            resultat = (double)a/b;
                break;
            case "fois":
                resultat = a*b;
                break;
            default:break;
        }
        return resultat;
    }
}
