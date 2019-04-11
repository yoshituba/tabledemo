package com.demo.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class PetController {

    @Autowired
    private PetRepository repository;

    @RequestMapping(value="/pet", method = RequestMethod.GET)
    public String index(Model model){
        List<Pet> pets = repository.findAll();

        model.addAttribute("pets", pets);

        return "index";
    }


}
