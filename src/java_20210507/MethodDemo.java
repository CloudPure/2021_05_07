package java_20210507;

public class MethodDemo {
	
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean isLeafYear = isleafYear(year);
		if(isLeafYear) {
			monthArray[1] = 29;
		}
		
		for(int i =1; i<=31; i++) {
			System.out.print(i+"\t");
			if(i%7==0) System.out.println();
		}
	}
	
	//자바에서 앞에다가 True, false이면 is를 붙임! leafYear(x) isleafYear(o)
	public int[] ascending(int[] array ) {
		// 오름차순 정렬
				for(int i = 0; i < array.length; i++) {
					for(int j = 0; j < array.length - (i+1); j++) {
						if(array[j] < array[j + 1]) {
							int temp = array[j];
							array[j] = array[j+1];
							array[j+1] = temp;
						}
					}
				}
				return array;
				
	}
	public boolean isleafYear(int year){
		return year % 4 == 0 && year%100 !=0  || year%400==0;
				
	}
	public int plus(int first, int second) {
		//first, second => 매개변수(parameter)
		return first + second;
	}
	public static void main(String[] args) {
		// 윤년 맞는지 확인하기
		MethodDemo m = new MethodDemo();
		int sum = m.plus(10, 20); // 10, 20 → 인자(Arguments)
		System.out.printf("%d %n", sum);
		
		boolean leafYear = m.isleafYear(1984);
		System.out.printf("%s %n", leafYear);
		
		int[] test = {10, 20, 1, 30, 4, 89, 100, 25};
		int[] afterTest = m.ascending(test);
		for(int i= 0; i< afterTest.length; i++) {
			System.out.print(afterTest[i]+"\t");
			
		}
		System.out.println();
		m.print(2020, 3);
	}

}
