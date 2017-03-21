package test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import db.TBOrder;
import spring.TicketOrderServiceSpringImp;

public class TestSpring {

//	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		TicketOrderServiceSpringImp springOrderSvrImp = context.getBean(TicketOrderServiceSpringImp.class);
//		TBOrder theOrder = new TBOrder();
//		theOrder.setPhone("13916969166");
//		theOrder.setAmount(33.33);
//		theOrder.setOrderDate(2015032701);
//		theOrder.setOrderNum("2015032701001");
//		boolean success = springOrderSvrImp.createOrder(theOrder);
//		assertEquals(true,success);
//		
//		List<TBOrder> orders = springOrderSvrImp.queryMyOrders("13916969166");
//		assertEquals(true,!orders.isEmpty());
//		theOrder = orders.iterator().next();
//		success = springOrderSvrImp.cancelOrder(theOrder.getId());
//		assertEquals(true,success);
//	}
	@Test
	public void testAll(){
		// 加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TicketOrderServiceSpringImp springOrderSvrImp = context.getBean(TicketOrderServiceSpringImp.class);
		TBOrder theOrder = new TBOrder();
		theOrder.setPhone("18837471587");
		theOrder.setAmount(66.66);
		theOrder.setOrderDate(2017032102);
		theOrder.setOrderNum("2017032108889");
		boolean success = springOrderSvrImp.createOrder(theOrder);
		assertEquals(true,success);
		
		List<TBOrder> orders = springOrderSvrImp.queryMyOrders("18837471587");
		assertEquals(true,!orders.isEmpty());
		theOrder = orders.iterator().next();
		success = springOrderSvrImp.cancelOrder(theOrder.getId());
		assertEquals(true,success);
		context.close();
	}
}
