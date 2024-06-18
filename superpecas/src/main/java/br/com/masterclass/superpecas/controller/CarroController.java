package br.com.masterclass.superpecas.controller;

import br.com.masterclass.superpecas.model.CarroModel;
import br.com.masterclass.superpecas.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{carro_id}")
    public Optional<CarroModel> obterPorId(@PathVariable int carro_id){
        return carroService.ObterPorId(carro_id);
    }

    @GetMapping("/ListarTodosFabricantes")
    public List<CarroModel> listarTodosFabricantes (@RequestParam("fabricante") String fabricante){
        return carroService.listarTodosFabricantes(fabricante);
    }
}