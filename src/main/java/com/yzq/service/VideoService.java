package com.yzq.service;

import com.yzq.mapper.VideoMapper;
import com.yzq.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoMapper videoMapper;

    public void setVideoMapper(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    public List<Video> getVideoDetail(int id) {
        return videoMapper.getVideoDetail(id);
    }

}
