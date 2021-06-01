package com.projeto.bootcamp.mapper;


import com.projeto.bootcamp.model.Stock;
import com.projeto.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }

    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();
        stock.setId(stock.getId());
        stock.setName(stock.getName());
        stock.setPrice(stock.getPrice());
        stock.setVariation(stock.getVariation());
        stock.setDate(stock.getDate());
        return dto;
    }

    public List<StockDTO> toDto(List<Stock> listStock){
        return listStock.stream().map(this::toDto).collect(Collectors.toList());
    }
}
