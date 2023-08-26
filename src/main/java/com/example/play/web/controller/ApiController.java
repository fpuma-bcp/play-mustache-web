package com.example.play.web.controller;

import com.example.play.web.dto.NewVideo;
import com.example.play.web.entity.VideoEntity;
import com.example.play.web.service.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
  private final VideoService videoService;
  public ApiController(VideoService videoService) {
    this.videoService = videoService;
  }

  @GetMapping("/api/videos")
  public List<VideoEntity> all() {
    return videoService.getVideos();
  }

  @PostMapping("/api/videos")
  public VideoEntity newVideo(@RequestBody NewVideo newVideo) {
    return videoService.create(newVideo);
  }
}
