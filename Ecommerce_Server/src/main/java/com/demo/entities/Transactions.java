package com.demo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Transactions generated by hbm2java
 */
@Entity
@Table(name = "transactions", catalog = "ecommerce_db")
public class Transactions implements java.io.Serializable {

	private Integer id;
	private Orders orders;
	private Products products;
	private Services services;
	private Stores stores;
	private TransactionDetails transactionDetails;
	private double price;
	private int quantity;
	private double tax;
	private double total;
	private String note;
	private boolean status;
	private String cancelReason;

	public Transactions() {
	}

public Transactions(Products products, Services services, Stores stores, TransactionDetails transactionDetails,
			double price, int quantity, double tax, double total, boolean status) {
=======
	public Transactions(Orders orders, Products products, Stores stores, TransactionDetails transactionDetails,
			double price, int quantity, double tax, double total, boolean status) {
		this.orders = orders;
		this.products = products;
		this.stores = stores;
		this.transactionDetails = transactionDetails;
		this.price = price;
		this.quantity = quantity;
		this.tax = tax;
		this.total = total;
		this.status = status;
	}

	public Transactions(Orders orders, Products products, Services services, Stores stores,
			TransactionDetails transactionDetails, double price, int quantity, double tax, double total, String note,
			boolean status, String cancelReason) {
		this.orders = orders;
		this.products = products;
		this.services = services;
		this.stores = stores;
		this.transactionDetails = transactionDetails;
		this.price = price;
		this.quantity = quantity;
		this.tax = tax;
		this.total = total;
		this.note = note;
		this.status = status;
		this.cancelReason = cancelReason;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false)
	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_id")
	public Services getServices() {
		return this.services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id", nullable = false)
	public Stores getStores() {
		return this.stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transaction_detail_id", nullable = false)
	public TransactionDetails getTransactionDetails() {
		return this.transactionDetails;
	}

	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "tax", nullable = false, precision = 22, scale = 0)
	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Column(name = "total", nullable = false, precision = 22, scale = 0)
	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Column(name = "note", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "cancel_reason", length = 500)
	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

}
