package j2ee.research.struts2.domain;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-08 01:54
 * To change this template use File | Settings | File Templates.
 */
public class Identity implements Serializable{
	private static final long serialVersionUID=-9011308373160371722L;
	private Long id;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id=id;
	}

	@Override
	public String toString(){
		return "id:"+id;
	}
}
