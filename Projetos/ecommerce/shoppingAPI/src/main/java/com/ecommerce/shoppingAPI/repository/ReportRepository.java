package com.ecommerce.shoppingAPI.repository;

import com.ecommerce.shoppingAPI.entity.Shop;
import com.microservice.study.shoppingClient.dto.ShopReportDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

public interface ReportRepository {

    List<Shop> getShopByFilters(Date inicialDate, Date finalDate, Float minimalValue);

    ShopReportDTO getReportByDate(Date inicialDate, Date finalDate);
}
