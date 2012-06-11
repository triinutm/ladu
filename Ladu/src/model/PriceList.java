package model;

// Generated 11.06.2012 19:20:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PriceList generated by hbm2java
 */
@Entity
@Table(name = "price_list")
public class PriceList implements java.io.Serializable {

	private long priceList;
	private PriceListStatusType priceListStatusType;
	private Employee employeeByUpdatedBy;
	private Employee employeeByCreatedBy;
	private Long defaultDiscountXtra;
	private Date dateFrom;
	private Date dateTo;
	private String note;
	private Date created;
	private Date updated;
	private Set<CustomerPriceList> customerPriceLists = new HashSet<CustomerPriceList>(
			0);
	private Set<ItemPriceList> itemPriceLists = new HashSet<ItemPriceList>(0);

	public PriceList() {
	}

	public PriceList(long priceList) {
		this.priceList = priceList;
	}

	public PriceList(long priceList, PriceListStatusType priceListStatusType,
			Employee employeeByUpdatedBy, Employee employeeByCreatedBy,
			Long defaultDiscountXtra, Date dateFrom, Date dateTo, String note,
			Date created, Date updated,
			Set<CustomerPriceList> customerPriceLists,
			Set<ItemPriceList> itemPriceLists) {
		this.priceList = priceList;
		this.priceListStatusType = priceListStatusType;
		this.employeeByUpdatedBy = employeeByUpdatedBy;
		this.employeeByCreatedBy = employeeByCreatedBy;
		this.defaultDiscountXtra = defaultDiscountXtra;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.note = note;
		this.created = created;
		this.updated = updated;
		this.customerPriceLists = customerPriceLists;
		this.itemPriceLists = itemPriceLists;
	}

	@Id
	@Column(name = "price_list", unique = true, nullable = false, precision = 10, scale = 0)
	public long getPriceList() {
		return this.priceList;
	}

	public void setPriceList(long priceList) {
		this.priceList = priceList;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "price_list_status_type_fk")
	public PriceListStatusType getPriceListStatusType() {
		return this.priceListStatusType;
	}

	public void setPriceListStatusType(PriceListStatusType priceListStatusType) {
		this.priceListStatusType = priceListStatusType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "updated_by")
	public Employee getEmployeeByUpdatedBy() {
		return this.employeeByUpdatedBy;
	}

	public void setEmployeeByUpdatedBy(Employee employeeByUpdatedBy) {
		this.employeeByUpdatedBy = employeeByUpdatedBy;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by")
	public Employee getEmployeeByCreatedBy() {
		return this.employeeByCreatedBy;
	}

	public void setEmployeeByCreatedBy(Employee employeeByCreatedBy) {
		this.employeeByCreatedBy = employeeByCreatedBy;
	}

	@Column(name = "default_discount_xtra", precision = 10, scale = 0)
	public Long getDefaultDiscountXtra() {
		return this.defaultDiscountXtra;
	}

	public void setDefaultDiscountXtra(Long defaultDiscountXtra) {
		this.defaultDiscountXtra = defaultDiscountXtra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_from", length = 13)
	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_to", length = 13)
	public Date getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	@Column(name = "note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", length = 29)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated", length = 29)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "priceList")
	public Set<CustomerPriceList> getCustomerPriceLists() {
		return this.customerPriceLists;
	}

	public void setCustomerPriceLists(Set<CustomerPriceList> customerPriceLists) {
		this.customerPriceLists = customerPriceLists;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "priceList")
	public Set<ItemPriceList> getItemPriceLists() {
		return this.itemPriceLists;
	}

	public void setItemPriceLists(Set<ItemPriceList> itemPriceLists) {
		this.itemPriceLists = itemPriceLists;
	}

}
