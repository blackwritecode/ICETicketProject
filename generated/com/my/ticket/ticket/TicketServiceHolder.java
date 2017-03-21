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

public final class TicketServiceHolder extends Ice.ObjectHolderBase<TicketService>
{
    public
    TicketServiceHolder()
    {
    }

    public
    TicketServiceHolder(TicketService value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof TicketService)
        {
            value = (TicketService)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _TicketServiceDisp.ice_staticId();
    }
}
