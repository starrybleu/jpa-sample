package com.idincu.sample.jpa.api;

import com.idincu.sample.jpa.domain.ItemEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ItemEntryRepository extends JpaRepository<ItemEntry, Long>, JpaSpecificationExecutor<ItemEntry>, QuerydslPredicateExecutor<ItemEntry> {

}
