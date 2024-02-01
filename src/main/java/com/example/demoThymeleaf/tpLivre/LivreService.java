package com.example.demoThymeleaf.tpLivre;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class LivreService {

    private HashMap<Integer, Livre> livres = new HashMap<>();
    private int idCount;

    public void add(Livre livre){
        idCount++;
        livre.setId(idCount);
        livres.put(livre.getId(), livre);
    }

    public List<Livre> getAll(){
        return livres.values().stream().toList();
    }

    public Livre findById(Integer id){
        return livres.get(id);
    }
}
