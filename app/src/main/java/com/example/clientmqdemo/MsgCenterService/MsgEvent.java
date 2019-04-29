package com.example.clientmqdemo.MsgCenterService;

/**
 * 消息事件实体
 *
 * @author wuzp
 */
public class MsgEvent {
    int id;   //可以随机产生，需要依赖使用方是否使用 或者是否存在限制
    int type; //区分不同类型的消息
    Object obj; //消息携带的数据
}
