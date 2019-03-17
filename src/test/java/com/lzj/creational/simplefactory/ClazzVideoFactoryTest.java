package com.lzj.creational.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClazzVideoFactoryTest {

    @Test
    public void getVideo() {
        Video video = new ClazzVideoFactory().getVideo(JavaVideo.class);
        video.produce();

        Video video2 = new ClazzVideoFactory().getVideo(PythonVideo.class);
        video2.produce();
    }
}