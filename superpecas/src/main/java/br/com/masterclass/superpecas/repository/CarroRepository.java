package br.com.masterclass.superpecas.repository;

import br.com.masterclass.superpecas.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, Integer> {

    @Query("SELECT c FROM Carro c WHERE c.fabricante = ?1")
    List<CarroModel> listarTodosFabricantes(@Param("?1") String fabricante);

}
