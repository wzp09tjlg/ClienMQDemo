package com.example.clientmqdemo.OrderConsumer;

import com.example.clientmqdemo.MsgCenterService.MsgCenterMager;
import com.example.clientmqdemo.MsgCenterService.MsgConst;
import com.example.clientmqdemo.MsgCenterService.MsgEvent;
import com.example.clientmqdemo.MsgCenterService.MsgListener;

/**
 * @author wuzp
 */
public class OrderPage {

    private MsgListener listener;

    public void onCreate() {
        MsgCenterMager.addListener(MsgConst.TYPE_ORDER, listener);
    }

    public void doSomeThing() {
        //
        //...
        //
    }

    public void onDestory() {
        MsgCenterMager.removeListener(listener);
    }

    private MsgListener getMsgListener() {
        if (listener == null) {
            listener = new MsgListener() {
                @Override
                public void onEvent(MsgEvent event) {

                }
            };
        }
        return listener;
    }
}
