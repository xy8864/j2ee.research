package j2ee.research.tutorial.lang.generic;

public interface NumberWrapper<T extends Number> {
	public double square(T num);
}
