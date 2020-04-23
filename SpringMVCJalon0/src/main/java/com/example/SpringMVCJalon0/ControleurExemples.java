/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringMVCJalon0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jalal
 */
@Controller
@RequestMapping("/exemples")
public class ControleurExemples {

    @RequestMapping(value = "/exemple1", method = RequestMethod.GET)
    public ModelAndView salut(String nom) {
        return new ModelAndView("exemple1",
                 "nom", nom);

    }
    
    
    @GetMapping(value = "/exemple2")
    public ModelAndView calcul(int a,String op, int b) {
       SimpleCalcul simpleCalcul = new SimpleCalcul(a,b,op);       
        return new ModelAndView("exemple2",
                 "simpleCalcul", simpleCalcul);

    }
    
    @RequestMapping(value = "/exemple3", method = RequestMethod.GET)
    public ModelAndView play() {
        return new ModelAndView("exemple3",
                 "essai", 15);

    }
    
   
}
