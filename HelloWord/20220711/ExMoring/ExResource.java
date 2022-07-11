package ExMoring;

public class ExResource {
	public static void main(String[] args) {
		Class cls = ExClass.class;
		String path = cls.getResource("kimsang.txt").getPath();
		
		System.out.println("경로  " + path);
		System.out.println(1);

	}
}
