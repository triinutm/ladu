package ladu.model;

// Generated 12.06.2012 19:50:00 by Hibernate Tools 3.4.0.CR1

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

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer")
public class Customer implements java.io.Serializable {

	private int customer;
	private SubjectType subjectType;
	private Integer subjectFk;
	private Set<CustomerPriceList> customerPriceLists = new HashSet<CustomerPriceList>(
			0);

	public Customer() {
	}

	public Customer(int customer) {
		this.customer = customer;
	}

	public Customer(int customer, SubjectType subjectType, Integer subjectFk,
			Set<CustomerPriceList> customerPriceLists) {
		this.customer = customer;
		this.subjectType = subjectType;
		this.subjectFk = subjectFk;
		this.customerPriceLists = customerPriceLists;
	}

	@Id
	@Column(name = "customer", unique = true, nullable = false)
	public int getCustomer() {
		return this.customer;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_type_fk")
	public SubjectType getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(SubjectType subjectType) {
		this.subjectType = subjectType;
	}

	@Column(name = "subject_fk")
	public Integer getSubjectFk() {
		return this.subjectFk;
	}

	public void setSubjectFk(Integer subjectFk) {
		this.subjectFk = subjectFk;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<CustomerPriceList> getCustomerPriceLists() {
		return this.customerPriceLists;
	}

	public void setCustomerPriceLists(Set<CustomerPriceList> customerPriceLists) {
		this.customerPriceLists = customerPriceLists;
	}

}
