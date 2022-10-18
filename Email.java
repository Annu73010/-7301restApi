package com.bank.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emails")
public class Email {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer eid;
	private String eto;
	private String efrom;
	private String esubject;
	private String ebody;
	private Integer userid;
	
	public Integer getEtd() {
		return eid;
	}
	public void setEtd(Integer etd) {
		this.eid = etd;
	}
	public String getEto() {
		return eto;
	}
	public void setEto(String eto) {
		this.eto = eto;
	}
	public String getEfrom() {
		return efrom;
	}
	public void setEfrom(String efrom) {
		this.efrom = efrom;
	}
	public String getEsubject() {
		return esubject;
	}
	public void setEsubject(String esubject) {
		this.esubject = esubject;
	}
	public String getEbody() {
		return ebody;
	}
	public void setEbody(String ebody) {
		this.ebody = ebody;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
}
