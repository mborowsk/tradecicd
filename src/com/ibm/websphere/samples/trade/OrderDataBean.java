//
// "This sample program is provided AS IS and may be used, executed, copied and modified without royalty payment by customer (a) for its own
// instruction and study, (b) in order to develop applications designed to run with an IBM WebSphere product, either for customer's own internal use 
// or for redistribution by customer, as part of such an application, in customer's own products. " 
//
// (C) COPYRIGHT International Business Machines Corp., 2005
// All Rights Reserved * Licensed Materials - Property of IBM
//

package com.ibm.websphere.samples.trade;


import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;
import com.ibm.websphere.samples.trade.util.*;



public class OrderDataBean implements Serializable 
{
	private static final long serialVersionUID = -8102390075888573852L;
   	
	private Integer		orderID;			/* orderID */
	private String		orderType;			/* orderType (buy, sell, etc.) */
	private String		orderStatus;		/* orderStatus (open, processing, completed, closed, cancelled) */
	private Date		openDate;			/* openDate (when the order was entered) */
	private Date		completionDate;		/* completionDate */
	private double	quantity;			/* quantity */
	private BigDecimal	price;				/* price */
	private BigDecimal	orderFee;			/* price */


    /* Fields for relationship fields are not kept in the Data Bean */
	private String 		symbol;

	public OrderDataBean() {}
	/**
	 * OrderDataBean
	 * @construct an OrderDataBean
	 */
	public OrderDataBean(Integer orderID,
							String orderType,
							String orderStatus,
							Date openDate,
							Date completionDate,
							double quantity,
							BigDecimal price,
							BigDecimal orderFee,
							String symbol
							)
	{
		setOrderID(orderID);
		setOrderType(orderType);
		setOrderStatus(orderStatus);
		setOpenDate(openDate);
		setCompletionDate(completionDate);
		setQuantity(quantity);
		setPrice(price);
		setOrderFee(orderFee);
		setSymbol(symbol);
	}
	
	public static OrderDataBean getRandomInstance() {
		return new OrderDataBean(
			new Integer(TradeConfig.rndInt(100000)),
			TradeConfig.rndBoolean() ? "buy" : "sell",
			"open",
			new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
			new java.util.Date(TradeConfig.rndInt(Integer.MAX_VALUE)),
			TradeConfig.rndQuantity(),
			TradeConfig.rndBigDecimal(1000.0f),
			TradeConfig.rndBigDecimal(1000.0f),
			TradeConfig.rndSymbol()
		);
	}
	
	public String toString()
	{
		return "Order " + getOrderID()
				+ "\n\t      orderType: " + getOrderType()
				+ "\n\t    orderStatus: " +	getOrderStatus()
				+ "\n\t       openDate: " +	getOpenDate()
				+ "\n\t completionDate: " +	getCompletionDate()
				+ "\n\t       quantity: " +	getQuantity()
				+ "\n\t          price: " +	getPrice()
				+ "\n\t       orderFee: " +	getOrderFee()
				+ "\n\t         symbol: " +	getSymbol()				
				;
	}
	public String toHTML()
	{
		return "<BR>Order <B>" + getOrderID() + "</B>"
				+ "<LI>      orderType: " + getOrderType() + "</LI>"
				+ "<LI>    orderStatus: " +	getOrderStatus() + "</LI>"
				+ "<LI>       openDate: " +	getOpenDate() + "</LI>"
				+ "<LI> completionDate: " +	getCompletionDate() + "</LI>"
				+ "<LI>       quantity: " +	getQuantity() + "</LI>"
				+ "<LI>          price: " +	getPrice() + "</LI>"
				+ "<LI>       orderFee: " +	getOrderFee() + "</LI>"
				+ "<LI>         symbol: " +	getSymbol() + "</LI>"
				;
	}

	public void print()
	{
		Log.log( this.toString() );
	}	
	
	/**
	 * Gets the orderID
	 * @return Returns a Integer
	 */
	public Integer getOrderID() {
		return orderID;
	}
	/**
	 * Sets the orderID
	 * @param orderID The orderID to set
	 */
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}


	/**
	 * Gets the orderType
	 * @return Returns a String
	 */
	public String getOrderType() {
		return orderType;
	}
	/**
	 * Sets the orderType
	 * @param orderType The orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


	/**
	 * Gets the orderStatus
	 * @return Returns a String
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * Sets the orderStatus
	 * @param orderStatus The orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	/**
	 * Gets the openDate
	 * @return Returns a Date
	 */
	public Date getOpenDate() {
		return openDate;
	}
	/**
	 * Sets the openDate
	 * @param openDate The openDate to set
	 */
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	/**
	 * Gets the completionDate
	 * @return Returns a Date
	 */
	public Date getCompletionDate() {
		return completionDate;
	}
	/**
	 * Sets the completionDate
	 * @param completionDate The completionDate to set
	 */
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}


	/**
	 * Gets the quantity
	 * @return Returns a BigDecimal
	 */
	public double getQuantity() {
		return quantity;
	}
	/**
	 * Sets the quantity
	 * @param quantity The quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}


	/**
	 * Gets the price
	 * @return Returns a BigDecimal
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * Sets the price
	 * @param price The price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	/**
	 * Gets the orderFee
	 * @return Returns a BigDecimal
	 */
	public BigDecimal getOrderFee() {
		return orderFee;
	}
	/**
	 * Sets the orderFee
	 * @param orderFee The orderFee to set
	 */
	public void setOrderFee(BigDecimal orderFee) {
		this.orderFee = orderFee;
	}

	/**
	 * Gets the symbol
	 * @return Returns a String
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * Sets the symbol
	 * @param symbol The symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


}

