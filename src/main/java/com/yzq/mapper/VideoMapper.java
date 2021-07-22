package com.yzq.mapper;

import com.yzq.pojo.Video;

import java.util.List;

public interface VideoMapper {
      List<Video> getVideoDetail(int id);
}
