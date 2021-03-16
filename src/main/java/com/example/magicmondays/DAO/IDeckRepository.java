package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeckRepository extends JpaRepository<Deck,Long> {
}
