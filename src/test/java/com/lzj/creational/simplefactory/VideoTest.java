package com.lzj.creational.simplefactory;

import org.junit.Test;

public class VideoTest {
    @Test
    public void getVideo() {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("Java");
        video.produce();
    }

}