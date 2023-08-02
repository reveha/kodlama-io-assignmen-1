package com.languages.ProgramminLanguages.DataAccess.Abstract;

import com.languages.ProgramminLanguages.Entities.ProgrammingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProgrammingLanguagesDAO extends JpaRepository<ProgrammingLanguages, Integer> {
}
