package cn.parkmanasys.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.parkmanasys.entity.TransactionType;


@Repository
public interface TransactionTypeMapper extends JpaRepository<TransactionType, Integer>{
	@Query("from #{#entityName} t where t.id = :Id")
	public List<TransactionType> findTransactionTypeInfo(@Param("Id") Integer Id);
}
