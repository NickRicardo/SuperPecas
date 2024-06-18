package br.com.masterclass.superpecas.controller;

import br.com.masterclass.superpecas.model.CarroModel;
import br.com.masterclass.superpecas.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
@CrossOrigin("*")
public class CarroController {


    @Autowired
    private CarroService carroService;

    @GetMapping("/ListarTodos")
    public List<CarroModel> ListarTodos() {
        return carroService.ListarTodos();
    }


}