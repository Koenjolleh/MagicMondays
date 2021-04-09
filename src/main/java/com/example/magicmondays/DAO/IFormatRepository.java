package com.example.magicmondays.DAO;

import com.example.magicmondays.Model.Format;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFormatRepository  extends JpaRepository<Format, Long> {
}
