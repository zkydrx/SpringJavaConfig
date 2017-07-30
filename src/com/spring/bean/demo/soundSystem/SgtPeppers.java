package com.spring.bean.demo.soundSystem;

import org.springframework.stereotype.Component;

/**
 * Created by ZKY on 2017-07-29 17:09.
 */
@Component
public class SgtPeppers implements CompactDisc
{
    private String title = " Sgt. Pepper's Lonely Hearts Club Band";
    private String artList = "The Beatles";

    @Override
    public void play()
    {
        System.out.println("Playing "+title+" by "+artList);
    }
}
