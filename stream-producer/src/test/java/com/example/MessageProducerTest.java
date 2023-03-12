package com.example;

import com.example.producer.MessageProducer;
import com.example.producer.MyMessageProducer02;
import com.example.producer.SourceMessageProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {StreamProducerApplication.class})
public class MessageProducerTest {

    @Autowired
    private MessageProducer messageProducer;
    @Autowired
    private MyMessageProducer02 myMessageProducer02;
    @Autowired
    private SourceMessageProducer sourceMessageProducer;

    @Test
    public void testSend() {
        for (int i=0; i<15;i++) {
            messageProducer.send("hello spring cloud stream" + ": " + i);
        }
    }

    @Test
    public void testMySend02() {
        myMessageProducer02.send("约定大于配置");
    }

    @Test
    public void testSendSource() {
        sourceMessageProducer.send("10086|10086@email.com");
    }
}
