package com.spring.bean.demo.soundSystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by ZKY on 2017-07-29 17:20.
 */
@Configuration
//通过java 代码装配Bean
public class CDPlayerConfig
{
    @Bean
    public CompactDisc sgtPeppers()
    {
        return new SgtPeppers();
    }
}
