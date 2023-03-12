package com.example.consumer;

import com.example.channel.MySink02;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者
 */
@Component
@EnableBinding(MySink02.class)
public class MyMessageConsumer02 {

  /**
   * 接收消息
   *
   * @param message
   */
  @StreamListener(MySink02.MY_INPUT)
  public void receive(String message) {
    System.out.println("Message = " + message);
  }

}
