package com.gestionelibreria.gestionelibreria;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class LibreriaController {

    @GetMapping("/getLibro")
    public Libro getLibro(@RequestBody Libro libro){
        return libro;
    }

    @PostMapping("/postLibro/{id}")
        public Libro postLibro(@PathVariable Integer id, @RequestBody Libro libro,@RequestParam String nome){
        return libro;
    }

}
