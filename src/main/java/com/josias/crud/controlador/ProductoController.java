package com.josias.crud.controlador;

import com.josias.crud.modelo.producto;
import com.josias.crud.repositorys.IProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private IProductoDAO repositorio;

    @PostMapping("/producto")
     public producto create(@Validated @RequestBody producto producto){
        return repositorio.insert(producto);
     }

     @GetMapping("/")
     public List<producto> readAll(){
        return repositorio.findAll();
     }

     @PutMapping("/producto/{id}")
     public producto update(@PathVariable String id, @Validated @RequestBody producto producto){
        return repositorio.save(producto);
    }

    @DeleteMapping("/producto/{id}")
    public void delete(@PathVariable String id){

        repositorio.deleteById(id);
    }

}
