package com.example.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 自定义发送消息通道
 *
 * @author lizongzai
 * @date 2023/03/12 11:27
 * @since 1.0.0
 */
public interface MySource02 {

  String MY_OUTPUT = "default.message";

  @Output(MY_OUTPUT)
  MessageChannel myOutput();

}
