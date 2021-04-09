package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMatchRepository  extends JpaRepository<Match,Long> {
}
