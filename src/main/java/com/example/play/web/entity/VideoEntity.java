package com.example.play.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VideoEntity {
  @Id
  @GeneratedValue
  private  Long id;

  /**
   * Name of the video
   */
  private String name;

  /**
   * Brief Description
   */
  private String description;

  public VideoEntity() {
    this(null, null);
  }

  public VideoEntity(String name, String description) {
    this.id = null;
    this.description = description;
    this.name = name;
  }
}
