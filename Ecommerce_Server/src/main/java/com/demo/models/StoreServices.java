package com.demo.models;
// Generated Nov 24, 2021, 4:10:46 PM by Hibernate Tools 5.1.10.Final

/**
 * StoreServices generated by hbm2java
 */
public class StoreServices implements java.io.Serializable {

	private StoreServicesId id;
	private ServiceInfo services;
	private StoreInfo stores;

	public StoreServices() {
	}

	public StoreServices(StoreServicesId id, ServiceInfo services, StoreInfo stores) {
		this.id = id;
		this.services = services;
		this.stores = stores;
	}

	public StoreServicesId getId() {
		return this.id;
	}

	public void setId(StoreServicesId id) {
		this.id = id;
	}

	public ServiceInfo getServices() {
		return this.services;
	}

	public void setServices(ServiceInfo services) {
		this.services = services;
	}

	public StoreInfo getStores() {
		return this.stores;
	}

	public void setStores(StoreInfo stores) {
		this.stores = stores;
	}

}
