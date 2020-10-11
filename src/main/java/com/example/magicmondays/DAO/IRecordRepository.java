package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecordRepository extends JpaRepository<Record,Integer> {
}
