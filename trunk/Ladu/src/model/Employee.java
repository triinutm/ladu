package model;

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
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "employee")
public class Employee implements java.io.Serializable {

	private int employee;
	private Person person;
	private Enterprise enterprise;
	private Integer structUnitFk;
	private String active;
	private Set<Enterprise> enterprisesForCreatedBy = new HashSet<Enterprise>(0);
	private Set<UserAccount> userAccountsForSubjectFk = new HashSet<UserAccount>(
			0);
	private Set<ItemAction> itemActions = new HashSet<ItemAction>(0);
	private Set<Person> personsForCreatedBy = new HashSet<Person>(0);
	private Set<EmployeeRole> employeeRoles = new HashSet<EmployeeRole>(0);
	private Set<PriceList> priceListsForCreatedBy = new HashSet<PriceList>(0);
	private Set<UserAccount> userAccountsForCreatedBy = new HashSet<UserAccount>(
			0);
	private Set<PriceList> priceListsForUpdatedBy = new HashSet<PriceList>(0);
	private Set<Person> personsForUpdatedBy = new HashSet<Person>(0);
	private Set<Enterprise> enterprisesForUpdatedBy = new HashSet<Enterprise>(0);

	public Employee() {
	}

	public Employee(int employee) {
		this.employee = employee;
	}

	public Employee(int employee, Person person, Enterprise enterprise,
			Integer structUnitFk, String active,
			Set<Enterprise> enterprisesForCreatedBy,
			Set<UserAccount> userAccountsForSubjectFk,
			Set<ItemAction> itemActions, Set<Person> personsForCreatedBy,
			Set<EmployeeRole> employeeRoles,
			Set<PriceList> priceListsForCreatedBy,
			Set<UserAccount> userAccountsForCreatedBy,
			Set<PriceList> priceListsForUpdatedBy,
			Set<Person> personsForUpdatedBy,
			Set<Enterprise> enterprisesForUpdatedBy) {
		this.employee = employee;
		this.person = person;
		this.enterprise = enterprise;
		this.structUnitFk = structUnitFk;
		this.active = active;
		this.enterprisesForCreatedBy = enterprisesForCreatedBy;
		this.userAccountsForSubjectFk = userAccountsForSubjectFk;
		this.itemActions = itemActions;
		this.personsForCreatedBy = personsForCreatedBy;
		this.employeeRoles = employeeRoles;
		this.priceListsForCreatedBy = priceListsForCreatedBy;
		this.userAccountsForCreatedBy = userAccountsForCreatedBy;
		this.priceListsForUpdatedBy = priceListsForUpdatedBy;
		this.personsForUpdatedBy = personsForUpdatedBy;
		this.enterprisesForUpdatedBy = enterprisesForUpdatedBy;
	}

	@Id
	@Column(name = "employee", unique = true, nullable = false)
	public int getEmployee() {
		return this.employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person_fk")
	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "enterprise_fk")
	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	@Column(name = "struct_unit_fk")
	public Integer getStructUnitFk() {
		return this.structUnitFk;
	}

	public void setStructUnitFk(Integer structUnitFk) {
		this.structUnitFk = structUnitFk;
	}

	@Column(name = "active", length = 1)
	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByCreatedBy")
	public Set<Enterprise> getEnterprisesForCreatedBy() {
		return this.enterprisesForCreatedBy;
	}

	public void setEnterprisesForCreatedBy(
			Set<Enterprise> enterprisesForCreatedBy) {
		this.enterprisesForCreatedBy = enterprisesForCreatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeBySubjectFk")
	public Set<UserAccount> getUserAccountsForSubjectFk() {
		return this.userAccountsForSubjectFk;
	}

	public void setUserAccountsForSubjectFk(
			Set<UserAccount> userAccountsForSubjectFk) {
		this.userAccountsForSubjectFk = userAccountsForSubjectFk;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<ItemAction> getItemActions() {
		return this.itemActions;
	}

	public void setItemActions(Set<ItemAction> itemActions) {
		this.itemActions = itemActions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByCreatedBy")
	public Set<Person> getPersonsForCreatedBy() {
		return this.personsForCreatedBy;
	}

	public void setPersonsForCreatedBy(Set<Person> personsForCreatedBy) {
		this.personsForCreatedBy = personsForCreatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<EmployeeRole> getEmployeeRoles() {
		return this.employeeRoles;
	}

	public void setEmployeeRoles(Set<EmployeeRole> employeeRoles) {
		this.employeeRoles = employeeRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByCreatedBy")
	public Set<PriceList> getPriceListsForCreatedBy() {
		return this.priceListsForCreatedBy;
	}

	public void setPriceListsForCreatedBy(Set<PriceList> priceListsForCreatedBy) {
		this.priceListsForCreatedBy = priceListsForCreatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByCreatedBy")
	public Set<UserAccount> getUserAccountsForCreatedBy() {
		return this.userAccountsForCreatedBy;
	}

	public void setUserAccountsForCreatedBy(
			Set<UserAccount> userAccountsForCreatedBy) {
		this.userAccountsForCreatedBy = userAccountsForCreatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByUpdatedBy")
	public Set<PriceList> getPriceListsForUpdatedBy() {
		return this.priceListsForUpdatedBy;
	}

	public void setPriceListsForUpdatedBy(Set<PriceList> priceListsForUpdatedBy) {
		this.priceListsForUpdatedBy = priceListsForUpdatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByUpdatedBy")
	public Set<Person> getPersonsForUpdatedBy() {
		return this.personsForUpdatedBy;
	}

	public void setPersonsForUpdatedBy(Set<Person> personsForUpdatedBy) {
		this.personsForUpdatedBy = personsForUpdatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeByUpdatedBy")
	public Set<Enterprise> getEnterprisesForUpdatedBy() {
		return this.enterprisesForUpdatedBy;
	}

	public void setEnterprisesForUpdatedBy(
			Set<Enterprise> enterprisesForUpdatedBy) {
		this.enterprisesForUpdatedBy = enterprisesForUpdatedBy;
	}

}
