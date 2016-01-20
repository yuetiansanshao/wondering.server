package com.bbs.wondering.model;

import java.util.Date;

public class BaseModel {

	private Long id;
	
	private Date created;
	
	private Date modified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj){
			return true;
		}
		if(id == null || obj == null || !(obj instanceof BaseModel)){
			return false;
		}
		final BaseModel mod = (BaseModel) obj;
		return id.equals(mod.getId());
	}

	@Override
	public int hashCode() {
		return id == null ? System.identityHashCode(this) : id.hashCode();
	}
}
