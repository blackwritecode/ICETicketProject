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

public interface _TicketServiceOperationsNC
{
    boolean createOrder(Order myOrder);

    Order[] queryMyOrders(String phone);

    boolean cancelOrder(long orderId);
}
