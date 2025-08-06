
public class unboxing {

	public static void main(String[] args) {
int num=60;

Integer boxedNum= Integer.valueOf(num);

Integer unboxedNum= boxedNum.intValue();

System.out.println("unboxed number "+unboxedNum);
	}

}
