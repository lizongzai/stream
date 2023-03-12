package com.example.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * 自定义消息接收通道
 *
 * @author lizongzai
 * @date 2023/03/12 11:29
 * @since 1.0.0
 */
public interface MySink02 {

  String MY_INPUT = "default.message";

  @Input(MY_INPUT)
  MessageChannel myInput();

}
