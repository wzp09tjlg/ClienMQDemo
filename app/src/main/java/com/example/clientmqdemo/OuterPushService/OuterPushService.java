package com.example.clientmqdemo.OuterPushService;

import com.example.clientmqdemo.MsgCenterService.MsgCenterMager;
import com.example.clientmqdemo.MsgCenterService.MsgEvent;

/**
 * @author wuzp
 */
public class OuterPushService {

    public void onPushHandler(String pushMsg){

        //transfer pushMsg to event

        MsgEvent msgEvent = new MsgEvent();
        MsgCenterMager.addMsgEvent(msgEvent);
    }
}
