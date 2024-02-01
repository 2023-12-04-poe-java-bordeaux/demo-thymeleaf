package com.example.demoThymeleaf.tpLivre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LivreController {

    @Autowired
    LivreService livreService;

    @GetMapping("livres")
    public String liste(Model model){

        model.addAttribute("livres", livreService.getAll() );
        return "livre/livres.html";
    }

    // detailsLivre?id=4
    @GetMapping("detailsLivre")
    public String details(Model model,@RequestParam("id") Integer id){

        model.addAttribute("livre", livreService.findById(id));
        return "livre/detailLivre.html";
    }



    @GetMapping("livre-formulaire")
    public String formulaire(){

        return "livre/formulaire.html";
    }

    @PostMapping("livre-formulaire")
    public String add(Livre livre, Model model){
        livreService.add(livre);

        model.addAttribute("livres", livreService.getAll() );
        return "livre/livres.html";
    }
}
