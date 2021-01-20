package com.project.spring.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.spring.models.User;
import com.project.spring.models.VisitModel;


@Repository
public interface VisitRepository extends JpaRepository<VisitModel, Long>{



List<VisitModel> findByusermodel(User id);

}
