package com.lucasmadeira.controleponto.controller;

import com.lucasmadeira.controleponto.model.JornadaTrabalho;
import com.lucasmadeira.controleponto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody  JornadaTrabalho jornadaTrabalho){
            return jornadaService.save(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody  JornadaTrabalho jornadaTrabalho){
        return jornadaService.update(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> findAll(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> findById(@PathVariable Long idJornada) throws NoSuchElementException {
        return ResponseEntity.ok(jornadaService.findById(idJornada));
    }

    @DeleteMapping("/{idJornada}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteJornada(@PathVariable Long idJornada){
        jornadaService.deleteById(idJornada);
    }

}
