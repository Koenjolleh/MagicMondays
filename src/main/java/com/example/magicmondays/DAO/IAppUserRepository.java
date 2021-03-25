package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Gandalf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGandalfRepository extends JpaRepository<Gandalf, Long> {
}
