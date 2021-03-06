// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `TicketServer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.my.ticket.ticket;

public interface TicketServicePrx extends Ice.ObjectPrx
{
    public boolean createOrder(Order myOrder);

    public boolean createOrder(Order myOrder, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_createOrder(Order myOrder);

    public Ice.AsyncResult begin_createOrder(Order myOrder, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_createOrder(Order myOrder, Ice.Callback __cb);

    public Ice.AsyncResult begin_createOrder(Order myOrder, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_createOrder(Order myOrder, Callback_TicketService_createOrder __cb);

    public Ice.AsyncResult begin_createOrder(Order myOrder, java.util.Map<String, String> __ctx, Callback_TicketService_createOrder __cb);

    public boolean end_createOrder(Ice.AsyncResult __result);

    public Order[] queryMyOrders(String phone);

    public Order[] queryMyOrders(String phone, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_queryMyOrders(String phone);

    public Ice.AsyncResult begin_queryMyOrders(String phone, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_queryMyOrders(String phone, Ice.Callback __cb);

    public Ice.AsyncResult begin_queryMyOrders(String phone, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_queryMyOrders(String phone, Callback_TicketService_queryMyOrders __cb);

    public Ice.AsyncResult begin_queryMyOrders(String phone, java.util.Map<String, String> __ctx, Callback_TicketService_queryMyOrders __cb);

    public Order[] end_queryMyOrders(Ice.AsyncResult __result);

    public boolean cancelOrder(long orderId);

    public boolean cancelOrder(long orderId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_cancelOrder(long orderId);

    public Ice.AsyncResult begin_cancelOrder(long orderId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_cancelOrder(long orderId, Ice.Callback __cb);

    public Ice.AsyncResult begin_cancelOrder(long orderId, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_cancelOrder(long orderId, Callback_TicketService_cancelOrder __cb);

    public Ice.AsyncResult begin_cancelOrder(long orderId, java.util.Map<String, String> __ctx, Callback_TicketService_cancelOrder __cb);

    public boolean end_cancelOrder(Ice.AsyncResult __result);
}
