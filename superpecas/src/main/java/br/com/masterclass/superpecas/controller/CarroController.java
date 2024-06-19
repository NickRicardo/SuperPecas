package br.com.masterclass.superpecas.controller;

import br.com.masterclass.superpecas.dto.CarroCriarDTO;
import br.com.masterclass.superpecas.model.CarroModel;
import br.com.masterclass.superpecas.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{carroID}")
    public Optional<CarroModel> obterPorId(@PathVariable int carroID) {
        return carroService.ObterPorId(carroID);
    }

    @GetMapping("/ListarTodosFabricantes")
    public List<String> listarTodosFabricantes() {
        return carroService.listarTodosFabricantes();
    }

    @DeleteMapping("/{carro_id}")
    public void excluirCarro(@PathVariable Integer carro_id){
        carroService.excluirCarro(carro_id);
    }

    @PostMapping("/criarNovoCarro")
    public ResponseEntity<String> criaNovoCarro(@RequestBody CarroCriarDTO carroDTO){
        this.carroService.criaCarro(carroDTO);
        return  ResponseEntity.status(HttpStatus.CREATED).body("Carro Adicionado com Sucesso!");
    }

}
