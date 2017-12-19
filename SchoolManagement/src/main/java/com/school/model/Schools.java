package com.school.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "schools")
public class Schools  implements Serializable {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long scId;

	    @NotBlank
	    private String schoolName;
	    
	    private String schoolLocation;

		public Long getScId() {
			return scId;
		}

		public void setScId(Long scId) {
			this.scId = scId;
		}

		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

		public String getSchoolLocation() {
			return schoolLocation;
		}

		public void setSchoolLocation(String schoolLocation) {
			this.schoolLocation = schoolLocation;
		}
}
