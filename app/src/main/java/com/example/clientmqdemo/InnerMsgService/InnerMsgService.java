package com.example.clientmqdemo.InnerMsgService;

import com.example.clientmqdemo.MsgCenterService.MsgCenterMager;
import com.example.clientmqdemo.MsgCenterService.MsgEvent;

/**
 * @author wuzp
 */
public class InnerMsgService {

    public void onInnerPushReceive(Object obj) {
        //transfer to msgEvent
        MsgEvent event = new MsgEvent();
        MsgCenterMager.addMsgEvent(event);
    }
}
