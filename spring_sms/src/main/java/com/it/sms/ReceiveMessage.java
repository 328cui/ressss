package com.it.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 接收消息
 */
@Component
public class ReceiveMessage {


    @Autowired
    private SendSms sendSms;

    //接收消息
    @JmsListener(destination = "sms")
    public void receiveMessage(Map<String,String> map) throws  Exception{

        //发短信
       sendSms.sendMessage(map);

    }

}
