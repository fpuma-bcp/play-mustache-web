package com.example.play.web.repository;

import com.example.play.web.entity.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface VideoRepository extends JpaRepository<VideoEntity, Long> {
  List<VideoEntity> findByNameContainsIgnoreCase(String partialName);

  List<VideoEntity> findByDescriptionContainsIgnoreCase(String partialDescription);

  List<VideoEntity> findByNameContainsOrDescriptionContainsAllIgnoreCase(String partialName,
                                                                         String partialDescription);
}
