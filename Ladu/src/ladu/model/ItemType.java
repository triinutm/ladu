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
 * ItemType generated by hbm2java
 */
@Entity
@Table(name = "item_type")
public class ItemType implements java.io.Serializable {

	private long itemType;
	private ItemType itemType_1;
	private String typeName;
	private Long level;
	private Set<Item> items = new HashSet<Item>(0);
	private Set<TypeAttribute> typeAttributes = new HashSet<TypeAttribute>(0);
	private Set<ItemType> itemTypes = new HashSet<ItemType>(0);

	public ItemType() {
	}

	public ItemType(long itemType) {
		this.itemType = itemType;
	}

	public ItemType(long itemType, ItemType itemType_1, String typeName,
			Long level, Set<Item> items, Set<TypeAttribute> typeAttributes,
			Set<ItemType> itemTypes) {
		this.itemType = itemType;
		this.itemType_1 = itemType_1;
		this.typeName = typeName;
		this.level = level;
		this.items = items;
		this.typeAttributes = typeAttributes;
		this.itemTypes = itemTypes;
	}

	@Id
	@Column(name = "item_type", unique = true, nullable = false, precision = 10, scale = 0)
	public long getItemType() {
		return this.itemType;
	}

	public void setItemType(long itemType) {
		this.itemType = itemType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "super_type_fk")
	public ItemType getItemType_1() {
		return this.itemType_1;
	}

	public void setItemType_1(ItemType itemType_1) {
		this.itemType_1 = itemType_1;
	}

	@Column(name = "type_name", length = 200)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Column(name = "level", precision = 10, scale = 0)
	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "itemType")
	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "itemType")
	public Set<TypeAttribute> getTypeAttributes() {
		return this.typeAttributes;
	}

	public void setTypeAttributes(Set<TypeAttribute> typeAttributes) {
		this.typeAttributes = typeAttributes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "itemType_1")
	public Set<ItemType> getItemTypes() {
		return this.itemTypes;
	}

	public void setItemTypes(Set<ItemType> itemTypes) {
		this.itemTypes = itemTypes;
	}

}
