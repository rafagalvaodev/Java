package com.ecommerce.shoppingAPI.controller;

import com.ecommerce.shoppingAPI.service.ReportService;
import com.ecommerce.shoppingAPI.service.ShopService;
import com.microservice.study.shoppingClient.dto.ShopDTO;
import com.microservice.study.shoppingClient.dto.ShopReportDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @Autowired
    private ReportService reportService;

    @GetMapping("/shopping")
    public ResponseEntity<PagedModel<ShopDTO>> getShops(Pageable pageable) {
        Page<ShopDTO> products = shopService.getAll(pageable);
        return ResponseEntity.ok(new PagedModel<>(products));
    }

    @GetMapping("/shopping/shopByUser/{userIdentifier}")
    public ResponseEntity<List<ShopDTO>> getShopsIdentifier(@PathVariable String userIdentifier) {
        List<ShopDTO> products = shopService.getByUser(userIdentifier);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/shopping/{id}")
    public ResponseEntity<ShopDTO> findById(@PathVariable Long id) {
        ShopDTO products = shopService.findById(id);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/shopping/search")
    public ResponseEntity<List<ShopDTO>> getShopsByFilter(
            @RequestParam(name = "inicialDate", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date inicialDate,
            @RequestParam(name = "finalDate", required = false)
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date finalDate,
            @RequestParam(name = "minimalValue", required = false) Float minimalValue) {

        return reportService.getShopsByFilter(inicialDate, finalDate, minimalValue);
    }

    @GetMapping("/shopping/report")
    public ResponseEntity<ShopReportDTO> getReportByDate(
            @RequestParam(name = "inicialDate", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date inicialDate,
            @RequestParam(name = "finalDate", required = true)
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date finalDate) {

        return reportService.getReportByDate(inicialDate, finalDate);
    }

    @PostMapping("/shopping")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> saveShops(
            @Valid @RequestBody ShopDTO shopDTO,
            @RequestHeader(name = "userkey", required = true) String userKey) {
        ShopDTO savedShopDTO = shopService.saveShop(shopDTO, userKey);

        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/shopping/{id}")
                .buildAndExpand(savedShopDTO.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

}
