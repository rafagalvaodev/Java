package com.ecommerce.shoppingAPI.repository;

import com.ecommerce.shoppingAPI.entity.Shop;
import com.microservice.study.shoppingClient.dto.ShopReportDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.Date;
import java.util.List;

public class ReportRepositoryImpl implements ReportRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Shop> getShopByFilters(Date inicialDate, Date finalDate, Float minimalValue) {

        StringBuilder sb = new StringBuilder();

        sb.append("SELECT s ");
        sb.append("FROM Shop s ");
        sb.append("WHERE s.date >= :inicialDate");

        if (finalDate != null) {
            sb.append(" AND s.date <= :finalDate");
        }

        if (minimalValue != null) {
            sb.append(" AND s.total <= :minimalValue");
        }

        Query query = entityManager.createQuery(sb.toString());
        query.setParameter("inicialDate", inicialDate);

        if (finalDate != null) {
            query.setParameter("finalDate", finalDate);
        }

        if (minimalValue != null) {
            query.setParameter("minimalValue", minimalValue);
        }

        return query.getResultList();
    }

    @Override
    public ShopReportDTO getReportByDate(Date inicialDate, Date finalDate) {

        StringBuilder sb = new StringBuilder();

        sb.append("SELECT count(sp.id), sum(sp.total), avg(sp.total) ");
        sb.append("FROM shop sp ");
        sb.append("WHERE sp.date >= :inicialDate ");
        sb.append("And sp.date <= :finalDate ");

        Query query = entityManager.createNativeQuery(sb.toString());
        query.setParameter("inicialDate", inicialDate);
        query.setParameter("finalDate", finalDate);

        Object[] result = (Object[]) query.getSingleResult();
        ShopReportDTO shopReportDTO = new ShopReportDTO();

        if (result != null) {
            if (result[0] != null) {
                shopReportDTO.setCount(Integer.parseInt(result[0].toString()));
            }

            if (result[1] != null) {
                shopReportDTO.setTotal(Double.parseDouble(result[1].toString()));
            }

            if (result[1] != null) {
                shopReportDTO.setMean(Double.parseDouble(result[2].toString()));
            }
        }

        return shopReportDTO;
    }
}
