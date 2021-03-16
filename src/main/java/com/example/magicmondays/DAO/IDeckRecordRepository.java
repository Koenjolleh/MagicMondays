package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.DeckRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeckRecordRepository extends JpaRepository<DeckRecord,Long> {
}
