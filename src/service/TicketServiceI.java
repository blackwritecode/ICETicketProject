package service;

import java.util.List;

import org.slf4j.LoggerFactory;

import com.my.ticket.ticket.Order;
import com.my.ticket.ticket._TicketServiceDisp;

import Ice.Current;
import db.TBOrder;
import spring.TicketOrderServiceSpringImp;
import util.SpringUtil;

public class TicketServiceI extends _TicketServiceDisp {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	org.slf4j.Logger logger = LoggerFactory.getLogger(TicketServiceI.class);

	@Override
	public boolean createOrder(Order myOrder, Current __current) {
		TBOrder tbOrder = new TBOrder();
		tbOrder.setPhone(myOrder.phone);
		tbOrder.setOrderDate(myOrder.orderDate);
		tbOrder.setOrderNum(myOrder.orderNum);
		tbOrder.setTicketType(myOrder.ticketType);
		tbOrder.setAmount(myOrder.amount);
		tbOrder.setOrderStatus(0);
		return SpringUtil.getBean(TicketOrderServiceSpringImp.class).createOrder(tbOrder);
	}

	@Override
	public Order[] queryMyOrders(String phone, Current __current) {
		List<TBOrder> tbOrders = SpringUtil.getBean(TicketOrderServiceSpringImp.class).queryMyOrders(phone);
		Order[] orders = new Order[tbOrders.size()];
		int i = 0;
		for(TBOrder tbOrder : tbOrders){
			orders[i++] = tBOrder2Order(tbOrder);
		}
		return orders;
	}
	
	private static Order tBOrder2Order(TBOrder tbOrder){
		Order order = new Order(tbOrder.getId(),tbOrder.getPhone(),tbOrder.getOrderNum()
				,tbOrder.getOrderDate(),tbOrder.getTicketType(),tbOrder.getAmount()
				,tbOrder.getOrderStatus());
		return order;
	}

	@Override
	public boolean cancelOrder(long orderId, Current __current) {
		return SpringUtil.getBean(TicketOrderServiceSpringImp.class).cancelOrder(orderId);
	}

}
