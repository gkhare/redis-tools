package com.gkhare.github.redis.subscribe;

import redis.clients.jedis.JedisPubSub;

import java.lang.Override;
import java.lang.String;

/**
 * Created by gkhare on 4/17/14.
 */
public class RedisSubscriber extends JedisPubSub {
    @Override
    public void onMessage(String s, String s2) {
        System.out.println(String.format("Received %s:%s", s, s2));
    }

    @Override
    public void onPMessage(String s, String s2, String s3) {
        System.out.println(String.format("Received (Pattern Subscribe) %s:%s:%s", s, s2, s3));
    }

    @Override
    public void onSubscribe(String s, int i) {
        System.out.println(String.format("Subscribed %s:%s", s, i));
    }

    @Override
    public void onUnsubscribe(String s, int i) {
        System.out.println(String.format("Unsubscribed %s:%s", s, s2))
    }

    @Override
    public void onPUnsubscribe(String s, int i) {
        System.out.println(String.format("Pattern Unsubscribed %s:%s", s, s2))
    }

    @Override
    public void onPSubscribe(String s, int i) {
        System.out.println(String.format("Pattern Subscribed %s:%s", s, s2))
    }
}
