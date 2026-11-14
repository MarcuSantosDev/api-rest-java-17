package com.marcusantosproject.api_rest.controller;

import com.marcusantosproject.api_rest.database.model.ProdutoEntity;
import com.marcusantosproject.api_rest.dto.ProdutoDto;
import com.marcusantosproject.api_rest.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {
    private final ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoEntity>> findAll(){
        return ResponseEntity.ok().body(produtoService.findAll());
    }

    @PostMapping
    public  ProdutoEntity insert(@RequestBody ProdutoDto objDto){
        return produtoService.insert(objDto);
    }

    @PutMapping("/{id}")
    public ProdutoEntity update(@RequestBody ProdutoDto objDto, @PathVariable Integer id){
        return produtoService.update(objDto,id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        produtoService.delete(id);
    }
}
