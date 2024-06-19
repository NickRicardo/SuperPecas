package br.com.masterclass.superpecas.repository;

import br.com.masterclass.superpecas.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, Integer> {

    @Query("SELECT DISTINCT fabricante FROM CarroModel")
    List<String> listarTodosFabricantes();

    List<CarroModel> findByNomeModeloOrCodigoUnico(String nomeModelo, String codigoUnico);

}
