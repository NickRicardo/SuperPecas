package br.com.masterclass.superpecas.controller;

import br.com.masterclass.superpecas.model.PecaModel;
import br.com.masterclass.superpecas.service.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/peca")
@CrossOrigin("*")
public class PecaController {

    @Autowired
    private PecaService pecaService;

    @GetMapping("/{pecaID}")
    public Optional<PecaModel> obterPorID(@PathVariable int pecaID) {
        return pecaService.ObterPorId(pecaID);
    }
}

