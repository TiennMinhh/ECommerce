package com.demo.entities;
// Generated Nov 16, 2021, 9:02:55 AM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Banners generated by hbm2java
 */
@Entity
@Table(name = "banners", catalog = "ecommerce_db")
public class Banners implements java.io.Serializable {

	private Integer id;
	private Users usersByCreaterId;
	private Users usersByUpdaterId;
	private String caption;
	private String description;
	private String link;
	private Date created;
	private Date updated;
	private boolean status;
	private Set<Images> imageses = new HashSet<Images>(0);

	public Banners() {
	}

	public Banners(Users usersByCreaterId, Users usersByUpdaterId, String caption, String description, String link,
			Date created, Date updated, boolean status) {
		this.usersByCreaterId = usersByCreaterId;
		this.usersByUpdaterId = usersByUpdaterId;
		this.caption = caption;
		this.description = description;
		this.link = link;
		this.created = created;
		this.updated = updated;
		this.status = status;
	}

	public Banners(Users usersByCreaterId, Users usersByUpdaterId, String caption, String description, String link,
			Date created, Date updated, boolean status, Set<Images> imageses) {
		this.usersByCreaterId = usersByCreaterId;
		this.usersByUpdaterId = usersByUpdaterId;
		this.caption = caption;
		this.description = description;
		this.link = link;
		this.created = created;
		this.updated = updated;
		this.status = status;
		this.imageses = imageses;
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
	@JoinColumn(name = "creater_id", nullable = false)
	public Users getUsersByCreaterId() {
		return this.usersByCreaterId;
	}

	public void setUsersByCreaterId(Users usersByCreaterId) {
		this.usersByCreaterId = usersByCreaterId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "updater_id", nullable = false)
	public Users getUsersByUpdaterId() {
		return this.usersByUpdaterId;
	}

	public void setUsersByUpdaterId(Users usersByUpdaterId) {
		this.usersByUpdaterId = usersByUpdaterId;
	}

	@Column(name = "caption", nullable = false, length = 100)
	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Column(name = "description", nullable = false, length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "link", nullable = false, length = 100)
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false, length = 10)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "updated", nullable = false, length = 10)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "banners")
	public Set<Images> getImageses() {
		return this.imageses;
	}

	public void setImageses(Set<Images> imageses) {
		this.imageses = imageses;
	}

}
