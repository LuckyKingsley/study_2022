package com.example.study_2022.GEO.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author JinXin
 * @description
 * @date 2022/02/09 09:27
 **/

@Slf4j
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    public void testRedis() {
//        redisTemplate.opsForGeo().
    }
}