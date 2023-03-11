package com.example.consumer;

import com.example.channel.MySink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * 消息消费者
 */
@Component
@EnableBinding({MySink.class})
public class MessageConsumer {

    /**
     * 接收消息
     *
     * @param message
     */
    @StreamListener(MySink.MY_INPUT)
    public void receive(String message) {
        System.out.println("message = " + message);
    }

}
