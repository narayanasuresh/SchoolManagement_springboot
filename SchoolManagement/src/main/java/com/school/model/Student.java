package com.school.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "student")
public class Student  implements Serializable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long sId;

	    @NotBlank
	    private String sName;
	    private String sAge;
		public Long getsId() {
			return sId;
		}
		public void setsId(Long sId) {
			this.sId = sId;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public String getsAge() {
			return sAge;
		}
		public void setsAge(String sAge) {
			this.sAge = sAge;
		}
	    
}
