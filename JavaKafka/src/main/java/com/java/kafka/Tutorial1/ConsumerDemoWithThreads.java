package com.java.kafka.Tutorial1;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

public class ConsumerDemoWithThreads {



    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ConsumerDemoWithThreads.class);
        ConsumerDemoWithThreads threads = new ConsumerDemoWithThreads();
        threads.consumerStart();
    }

    public  void  consumerStart(){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Runnable myCons = new ConsumerThread(countDownLatch);
        Thread myThread = new Thread(myCons);
        myThread.start();
    }

    public class ConsumerThread implements Runnable{

        Logger logger = LoggerFactory.getLogger(ConsumerThread.class);

        private CountDownLatch countDownLatch;
        private KafkaConsumer<String, String> consumer;

        ConsumerThread(CountDownLatch latch){
            this.countDownLatch = latch;
            Properties properties = new Properties();
            properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
            properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
            properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
            properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, "my_fourth_application");
            properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
            //creating a KAfka consumer..
            consumer = new KafkaConsumer<String, String>(properties);
            //subscribing to the topic..
            consumer.subscribe(Collections.singleton("first_topic"));
            //polling the topic
        }

        @Override
        public void run() {
            try {
                while (true) {
                    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                    for (ConsumerRecord<String, String> record : records) {
                        logger.info("Topic:" + record.topic() + "Partition:" +
                                record.partition() + "TimeStamp:" + record.timestamp() +
                                "Value:" + record.value());
                    }
                }
            }
            catch (WakeupException exception){
                logger.info("Received Shutdown Signal!");
            }
            finally {
                consumer.close();
                countDownLatch.countDown();
            }
        }


        public void shutdown(){
            consumer.wakeup();
        }


    }
}
