package com.htc.patientservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	
	@Column
	private Long appointmentId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId;
	@Column
	private String patientName;
	@Column 
	private Date appointmentDate;
	public Patient() {
		super();
	
	}
	
	public Patient(Long patientId, String patientName, Date appointmentDate) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentDate = appointmentDate;
	}

	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appointmentId == null) ? 0 : appointmentId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (appointmentId == null) {
			if (other.appointmentId != null)
				return false;
		} else if (!appointmentId.equals(other.appointmentId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [appointmentId=" + appointmentId + ", patientId=" + patientId + ", patientName=" + patientName
				+ ", appointmentDate=" + appointmentDate + "]";
	}
	
	
}
	