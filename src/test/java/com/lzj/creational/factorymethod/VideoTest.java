package com.lzj.creational.factorymethod;

import org.junit.Test;

public class VideoTest {

    @Test
    public void getVideo() {
        AbstractVideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}