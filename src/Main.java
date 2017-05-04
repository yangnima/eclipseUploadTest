import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		/*random.setSeed(1);*/
		System.out.println(random.nextInt(10));
		System.out.println(random.nextDouble());
		
		List<Integer> array = Arrays.asList(new Integer[] {1,2,3,4,5});
		Collections.shuffle(array);
		for (int i : array) 
			System.out.print(i +" ");
		System.out.println();
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
		System.out.println(UUID.randomUUID());
		System.out.println(Math.log(16));
		System.out.println(Math.max(1, 2));
		System.out.println(Math.min(1, 2));
		System.out.println(Math.ceil(11.5));
		System.out.println(Math.floor(11.3));
		System.out.println(Math.round(11.3));
		System.out.println(Math.round(11.5));

	}

}
