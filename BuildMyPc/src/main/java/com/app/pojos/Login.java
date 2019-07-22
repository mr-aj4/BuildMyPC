package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.other.EnumRole;

@Entity
@Table(name="Login")

public class Login {
		@Id
		@Column(name="Email",length=30)
		private String email;
		@Column(name="Password",length=30,nullable=false)
		private String password;
		@Column(name="Role",length=10,nullable=false)
		private EnumRole role;
		
		
		
		public Login() {
			super();
		}

		public Login(String email, String password, EnumRole role) {
			super();
			this.email = email;
			this.password = password;
			this.role = role;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public EnumRole getRole() {
			return role;
		}
		public void setRole(EnumRole role) {
			this.role = role;
		}
		@Override
		public String toString() {
			return "Login [email=" + email + ", password=" + password + ", role=" + role + "]";
		}
		
		
		

}
