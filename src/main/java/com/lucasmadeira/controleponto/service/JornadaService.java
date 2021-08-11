package com.lucasmadeira.controleponto.service;

import com.lucasmadeira.controleponto.model.JornadaTrabalho;
import com.lucasmadeira.controleponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public JornadaTrabalho findById(Long id) throws NoSuchElementException{
        return jornadaRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada"));
    }

    public void deleteById(Long id) {
        jornadaRepository.deleteById(id);
    }

}
