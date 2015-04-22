package j2ee.research.struts2.domain;

import com.google.common.base.Objects;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-08 01:53
 * To change this template use File | Settings | File Templates.
 */
public class User extends Identity{
	private static final long serialVersionUID=3512519622251785686L;
	private String username;
	private String password;
	private String fullName;
	private String email;
	private String passwordHint;
	private boolean accountEnabled;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean credentialsExpired;
	private Long companyId;
	private Long deptId;
	private Integer version;

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username=username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getFullName(){
		return fullName;
	}

	public void setFullName(String fullName){
		this.fullName=fullName;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getPasswordHint(){
		return passwordHint;
	}

	public void setPasswordHint(String passwordHint){
		this.passwordHint=passwordHint;
	}

	public boolean isAccountEnabled(){
		return accountEnabled;
	}

	public void setAccountEnabled(boolean accountEnabled){
		this.accountEnabled=accountEnabled;
	}

	public boolean isAccountExpired(){
		return accountExpired;
	}

	public void setAccountExpired(boolean accountExpired){
		this.accountExpired=accountExpired;
	}

	public boolean isAccountLocked(){
		return accountLocked;
	}

	public void setAccountLocked(boolean accountLocked){
		this.accountLocked=accountLocked;
	}

	public boolean isCredentialsExpired(){
		return credentialsExpired;
	}

	public void setCredentialsExpired(boolean credentialsExpired){
		this.credentialsExpired=credentialsExpired;
	}

	public Long getCompanyId(){
		return companyId;
	}

	public void setCompanyId(Long companyId){
		this.companyId=companyId;
	}

	public Long getDeptId(){
		return deptId;
	}

	public void setDeptId(Long deptId){
		this.deptId=deptId;
	}

	public Integer getVersion(){
		return version;
	}

	public void setVersion(Integer version){
		this.version=version;
	}

	@Override
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj.getClass()!=getClass()){
			return false;
		}
		User rhs=(User) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(this.username, rhs.username)
				.append(this.password, rhs.password)
				.append(this.fullName, rhs.fullName)
				.append(this.email, rhs.email)
				.append(this.passwordHint, rhs.passwordHint)
				.append(this.accountEnabled, rhs.accountEnabled)
				.append(this.accountExpired, rhs.accountExpired)
				.append(this.accountLocked, rhs.accountLocked)
				.append(this.credentialsExpired, rhs.credentialsExpired)
				.append(this.companyId, rhs.companyId)
				.append(this.deptId, rhs.deptId)
				.append(this.version, rhs.version)
				.isEquals();
	}

	@Override
	public int hashCode(){
		return new HashCodeBuilder()
				.appendSuper(super.hashCode())
				.append(username)
				.append(password)
				.append(fullName)
				.append(email)
				.append(passwordHint)
				.append(accountEnabled)
				.append(accountExpired)
				.append(accountLocked)
				.append(credentialsExpired)
				.append(companyId)
				.append(deptId)
				.append(version)
				.toHashCode();
	}

	@Override
	public String toString(){
		return Objects.toStringHelper(this)
				.add("username", username)
				//.add("password", password)
				.add("fullName", fullName)
				.add("email", email)
				.add("passwordHint", passwordHint)
				.add("accountEnabled", accountEnabled)
				.add("accountExpired", accountExpired)
				.add("accountLocked", accountLocked)
				.add("credentialsExpired", credentialsExpired)
				.add("companyId", companyId)
				.add("deptId", deptId)
				.add("version", version)
				.toString();
	}
}
