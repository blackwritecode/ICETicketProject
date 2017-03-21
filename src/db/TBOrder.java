package db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 订单对象
 * 
 * @author pkls
 *
 */
@Entity
@Table(name = "TB_ORDER")
public class TBOrder {

	private long id;
	private String phone;
	private String orderNum;
	private int orderDate;
	private int ticketType;
	private double amount;
	private int orderStatus;
	
	

	public TBOrder() {
		super();
	}

	public TBOrder(long id, String phone, String orderNum, int orderDate, int ticketType, double amount,
			int orderStatus) {
		super();
		this.id = id;
		this.phone = phone;
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.ticketType = ticketType;
		this.amount = amount;
		this.orderStatus = orderStatus;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "PHONE", length = 16)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column (name = "ORDER_NUM" , length = 24)
	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	@Column(name="ORDER_DATE")
	public int getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name="TICKET_TYPE")
	public int getTicketType() {
		return ticketType;
	}

	public void setTicketType(int ticketType) {
		this.ticketType = ticketType;
	}

	@Column(name="AMOUNT")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name="ORDER_STATUS")
	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

}
