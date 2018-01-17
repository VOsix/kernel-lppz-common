package com.lppz.oms.kafka.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LackOrderLog extends MyPageDto{
	private String mergeorderid;
	private String seq;
	private String orderid;
	private String orderlineid;
	private String werehousecode;
	private String productcode;
	private String productname;
	private String mergeflag;
	private String receivetime;
	private String issuccess;
	private String message;
	/**
	 * @return the mergeorderid
	 */
	public String getMergeorderid() {
		return mergeorderid;
	}
	/**
	 * @param mergeorderid the mergeorderid to set
	 */
	public void setMergeorderid(String mergeorderid) {
		this.mergeorderid = mergeorderid;
	}
	/**
	 * @return the seq
	 */
	public String getSeq() {
		return seq;
	}
	/**
	 * @param seq the seq to set
	 */
	public void setSeq(String seq) {
		this.seq = seq;
	}
	/**
	 * @return the orderid
	 */
	public String getOrderid() {
		return orderid;
	}
	/**
	 * @param orderid the orderid to set
	 */
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	/**
	 * @return the orderlineid
	 */
	public String getOrderlineid() {
		return orderlineid;
	}
	/**
	 * @param orderlineid the orderlineid to set
	 */
	public void setOrderlineid(String orderlineid) {
		this.orderlineid = orderlineid;
	}
	/**
	 * @return the werehousecode
	 */
	public String getWerehousecode() {
		return werehousecode;
	}
	/**
	 * @param werehousecode the werehousecode to set
	 */
	public void setWerehousecode(String werehousecode) {
		this.werehousecode = werehousecode;
	}
	/**
	 * @return the productcode
	 */
	public String getProductcode() {
		return productcode;
	}
	/**
	 * @param productcode the productcode to set
	 */
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	/**
	 * @return the productname
	 */
	public String getProductname() {
		return productname;
	}
	/**
	 * @param productname the productname to set
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}
	/**
	 * @return the mergeflag
	 */
	public String getMergeflag() {
		return mergeflag;
	}
	/**
	 * @param mergeflag the mergeflag to set
	 */
	public void setMergeflag(String mergeflag) {
		this.mergeflag = mergeflag;
	}
	/**
	 * @return the receivetime
	 */
	public String getReceivetime() {
		return receivetime;
	}
	/**
	 * @param receivetime the receivetime to set
	 */
	public void setReceivetime(String receivetime) {
		this.receivetime = receivetime;
	}
	/**
	 * @return the issuccess
	 */
	public String getIssuccess() {
		return issuccess;
	}
	/**
	 * @param issuccess the issuccess to set
	 */
	public void setIssuccess(String issuccess) {
		this.issuccess = issuccess;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	public void buildTime(){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			if(receivetime!=null){
				this.receivetime=format.format(new Date(Long.parseLong(receivetime)));
			}
		} catch (NumberFormatException e) {
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LackOrderLog [mergeorderid=");
		builder.append(mergeorderid);
		builder.append(", seq=");
		builder.append(seq);
		builder.append(", orderid=");
		builder.append(orderid);
		builder.append(", orderlineid=");
		builder.append(orderlineid);
		builder.append(", werehousecode=");
		builder.append(werehousecode);
		builder.append(", productcode=");
		builder.append(productcode);
		builder.append(", productname=");
		builder.append(productname);
		builder.append(", mergeflag=");
		builder.append(mergeflag);
		builder.append(", receivetime=");
		builder.append(receivetime);
		builder.append(", issuccess=");
		builder.append(issuccess);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
	
}
