package j2ee.research.forjob;

/**
 * Created with IntelliJ IDEA.
 * User: yuan2048
 * Date: 2014-06-09 21:13
 * To change this template use File | Settings | File Templates.
 */
public class Test{
	static void split(){
		System.out.println("|DF|A3".split("|").length);
		for(String s:"|DF|A3".split("|")){
			System.out.println(s);
		}
		for(String s:",DF,A3".split("|")){
			System.out.println(s);
		}
	}
	static void add(){
		System.out.println("************** add");
		int a=1;
		int b=++a + a++;//6
		int c=b++ + ++b;//10
		System.out.println("a:"+a);//3
		System.out.println("a++:"+(a++));//3
		System.out.println("b:"+b);//6
		System.out.println("++b:"+(++b));//7
		System.out.println("c:"+c);//10
		System.out.println("c++:"+c++);//10
		int d=1;
		System.out.println(d++);//1
		System.out.println(++d);//3

	}

	static void stringAdd(){
		System.out.println("************** stringAdd");
		String e="abc";
		String a="ab";
		final String f="ab";
		String b="c";
		String c=a+"c";
		String j=f+"c";
		String d=a+b;
		System.out.println(e==c);//false
		System.out.println(e==d);//false
		System.out.println(e==j);//true
	}

	static void extendsParent(){
		System.out.println("************** extendsParent");
		//Parent
		new Parent();
		//Parent
		//Child
		new Child();
	}

	static void  addOne(final Other o){o.i++;}
	static class Other{public int i;}

	static void testNumber(){
		System.out.println("************** testNumber");
		int x=4;
		System.out.println(x>4?99.9:9);//9.0
	}
	static void operateStringBuffer(StringBuffer a,StringBuffer b){
		a.append(b);
		b=a;
	}
	static void testStringBufferReference(){
		System.out.println("************** testStringBufferReference");
		StringBuffer a=new StringBuffer("a");
		StringBuffer b=new StringBuffer("b");
		operateStringBuffer(a,b);
		System.out.println(a+","+b);//ab,b 后面这个b?
	}
	static void operateInteger(Integer i){
		int val=i.intValue();
		val+=3;
		i=new Integer(val);
	}
	static void testOperateInteger(){
		System.out.println("************** testOperateInteger");
		Integer i=new Integer(0);
		operateInteger(i);
		System.out.println(i);//0
	}


	static class Parent{
		public Parent(){
			System.out.println("Parent");
		}
	}
	static class Child extends  Parent{
		public Child(){
			System.out.println("Child");
		}
	}
	public static void main(String[] args){
		add();
		stringAdd();
		extendsParent();
		Other other=new Other();
		addOne(other);System.out.println(other.i);//1
		testNumber();
		testStringBufferReference();
		testOperateInteger();


	}

}
