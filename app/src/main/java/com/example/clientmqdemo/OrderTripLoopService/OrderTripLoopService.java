package com.example.clientmqdemo.OrderTripLoopService;

import android.os.Handler;
import android.os.Message;

import com.example.clientmqdemo.MsgCenterService.MsgCenterMager;
import com.example.clientmqdemo.MsgCenterService.MsgCenterService;
import com.example.clientmqdemo.MsgCenterService.MsgEvent;

/**
 * 这个是service是获取订单的数据的
 * 具备的能力是 每三十秒获取一次数据
 *
 * @author wuzp
 */
public class OrderTripLoopService {

//  final   int MSG_LOOP = 100;
//  final   int MSG_STOP = 200;
//
//    Handler handler = new Handler(){
//
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            handler.removeMessages(MSG_LOOP);
//            switch (msg.what){
//                case MSG_LOOP:
//                    handler.sendEmptyMessage(MSG_LOOP);
//                    break;
//                case MSG_STOP:
//                    handler.removeCallbacksAndMessages(null);//removeAll
//                    break;
//            }
//
//        }
//    };
//
//    public void startLoop(){
//        handler.sendEmptyMessage(MSG_LOOP);
//    }
//
//    public void stopLoop(){
//        handler.sendEmptyMessage(MSG_STOP);
//    }

    public void getOrderInfo(){
        //
        Object orderInfo = null; ///get from network

        //transfer to msgevent

        MsgEvent msgEvent = new MsgEvent();
        MsgCenterMager.addMsgEvent(msgEvent);

    }
}
