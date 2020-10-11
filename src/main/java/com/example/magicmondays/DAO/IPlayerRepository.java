package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerRepository extends JpaRepository<Player,Integer> {
}
