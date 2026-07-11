package com.ecommerce.shoppingAPI.service;

import com.ecommerce.shoppingAPI.converter.DTOConverter;
import com.ecommerce.shoppingAPI.entity.Shop;
import com.ecommerce.shoppingAPI.repository.ReportRepository;
import com.microservice.study.shoppingClient.dto.ShopDTO;
import com.microservice.study.shoppingClient.dto.ShopReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {
    @Autowired
    private ReportRepository reportRepository;

    public ResponseEntity<List<ShopDTO>> getShopsByFilter(Date inicialDate, Date finalDate, Float minimalValue) {
        List<Shop> shops = reportRepository.getShopByFilters(inicialDate, finalDate, minimalValue);
        return ResponseEntity.ok(shops.stream()
                .map(DTOConverter::convert)
                .collect(Collectors.toList()));
    }

    public ResponseEntity<ShopReportDTO> getReportByDate(Date inicialDate, Date finalDate) {
        ShopReportDTO shopReportDTO = reportRepository.getReportByDate(inicialDate, finalDate);
        return ResponseEntity.ok(shopReportDTO);
    }
}
