package com.example.clientmqdemo.MsgCenterService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 消息中心服务
 * 主要作用是维护消息队列，添加消息，分发消息
 *
 * @author wuzp
 */
public class MsgCenterService {

    //存放消息的队列 [参数是消息的容纳量，如果以后可以扩展，可以作出扩充无限的。但是需要考虑到消息爆炸带来的后果]
    Queue<MsgEvent> mesEventQueue = new ArrayBlockingQueue<MsgEvent>(100);
    Queue<MsgEvent> dealingEventQueue = new ArrayBlockingQueue<MsgEvent>(100);


    //所有的消息接受者集合[会不会存在问题？]
   Map<String, List<MsgListener>> msgReceivers = new HashMap();

   public void addEvent(MsgEvent event){
       mesEventQueue.add(event);
   }

   public void onDealing(){
       //单开了一个线程来处理消息的分发
       MsgEvent event = mesEventQueue.peek();
       dispatchEvent(event);
   }

   //分发消息
   public void dispatchEvent(MsgEvent event){
       List<MsgListener> listeners = msgReceivers.get(event.type);
       for(MsgListener listener:listeners){
           listener.onEvent(event);
       }
   }
}
