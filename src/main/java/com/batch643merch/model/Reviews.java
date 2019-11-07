package com.batch643merch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Reviews {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reviewid")
	private int reviewid;
	@OneToOne
	@JoinColumn(name="itemid")
	private Item itemid;
	@ManyToOne
	@JoinColumn(name="userid")
	private User userid;
	private String reviewmessage;
	
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reviews(int reviewid, Item itemid, User userid, String reviewmessage) {
		super();
		this.reviewid = reviewid;
		this.itemid = itemid;
		this.userid = userid;
		this.reviewmessage = reviewmessage;
	}
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	public Item getItemid() {
		return itemid;
	}
	public void setItemid(Item itemid) {
		this.itemid = itemid;
	}
	public User getUserid() {
		return userid;
	}
	public void setUserid(User userid) {
		this.userid = userid;
	}
	public String getReviewmessage() {
		return reviewmessage;
	}
	public void setReviewmessage(String reviewmessage) {
		this.reviewmessage = reviewmessage;
	}
	
	

}
