package model;

// Generated 12.06.2012 19:50:00 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Store generated by hbm2java
 */
@Entity
@Table(name = "store")
public class Store implements java.io.Serializable {

	private long store;
	private String name;
	private Set<ItemAction> itemActionsForStoreToFk = new HashSet<ItemAction>(0);
	private Set<ItemAction> itemActionsForStoreFromFk = new HashSet<ItemAction>(
			0);
	private Set<ItemStore> itemStores = new HashSet<ItemStore>(0);

	public Store() {
	}

	public Store(long store) {
		this.store = store;
	}

	public Store(long store, String name,
			Set<ItemAction> itemActionsForStoreToFk,
			Set<ItemAction> itemActionsForStoreFromFk, Set<ItemStore> itemStores) {
		this.store = store;
		this.name = name;
		this.itemActionsForStoreToFk = itemActionsForStoreToFk;
		this.itemActionsForStoreFromFk = itemActionsForStoreFromFk;
		this.itemStores = itemStores;
	}

	@Id
	@Column(name = "store", unique = true, nullable = false, precision = 10, scale = 0)
	public long getStore() {
		return this.store;
	}

	public void setStore(long store) {
		this.store = store;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storeByStoreToFk")
	public Set<ItemAction> getItemActionsForStoreToFk() {
		return this.itemActionsForStoreToFk;
	}

	public void setItemActionsForStoreToFk(
			Set<ItemAction> itemActionsForStoreToFk) {
		this.itemActionsForStoreToFk = itemActionsForStoreToFk;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "storeByStoreFromFk")
	public Set<ItemAction> getItemActionsForStoreFromFk() {
		return this.itemActionsForStoreFromFk;
	}

	public void setItemActionsForStoreFromFk(
			Set<ItemAction> itemActionsForStoreFromFk) {
		this.itemActionsForStoreFromFk = itemActionsForStoreFromFk;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
	public Set<ItemStore> getItemStores() {
		return this.itemStores;
	}

	public void setItemStores(Set<ItemStore> itemStores) {
		this.itemStores = itemStores;
	}

}
