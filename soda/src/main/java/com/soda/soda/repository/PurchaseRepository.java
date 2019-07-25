package com.soda.soda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soda.soda.model.PurchaseInfo;

@Repository
public interface PurchaseRepository extends CrudRepository<PurchaseInfo, Long>{
}
