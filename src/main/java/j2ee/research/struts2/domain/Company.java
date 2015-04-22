package j2ee.research.struts2.domain;

import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-11 17:50
 * To change this template use File | Settings | File Templates.
 */
public class Company extends Identity{
	private static final long serialVersionUID=2384050912844513395L;
	private String name;
	private Set<Company> child;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public Set<Company> getChild(){
		return child;
	}

	public void setChild(Set<Company> child){
		this.child=child;
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
		Company rhs=(Company) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(this.name, rhs.name)
				.append(this.child, rhs.child)
				.isEquals();
	}

	@Override
	public int hashCode(){
		return new HashCodeBuilder()
				.appendSuper(super.hashCode())
				.append(name)
				.append(child)
				.toHashCode();
	}

	@Override
	public String toString(){
		return new ToStringBuilder(this)
				.appendSuper(super.toString())
				.append("name", name)
				.append("child", child)
				.toString();
	}
}
