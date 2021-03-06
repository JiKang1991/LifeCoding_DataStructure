package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		
		//---------------------------------------------------------------------------
		// addLast(value)는 ArrayList객체의 마지막에 element를 추가하는 메소드입니다.
		numbers.addLast(10);	// numbers[0] == 10
		numbers.addLast(20);	// numbers[1] == 20
		numbers.addLast(30);	// numbers[2] == 30
		numbers.addLast(40);	// numbers[3] == 40
		
		// [0] == 10 / [1] == 20 / [2] == 30 / [3] == 40
		System.out.println("numbers -> " + numbers);
		
		//---------------------------------------------------------------------------
		// add(index, value)는 ArrayList객체의 'index'에 해당하는 인덱스를 가진 element에
		// 'value'에 해당하는 값을 대입하는 메소드입니다.
		// ('index'에 해당하는 인덱스와 'index'보다 큰 인덱스를 가지고 있던 기존의 element들은
		// 기존의 인덱스에 1을 더한 인덱스를 가지게 됩니다. 즉, 뒤로 밀리게됩니다.)
		numbers.add(1, 15);
		
		// [0] == 10 / [1] == 15 / [2] == 20 / [3] == 30 / [4] == 40
		System.out.println("numbers.add(1, 15); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// add(value)는 ArrayList객체의 0번 인덱스를 가진 element에 값에
		// 'value'값을 대입하는 메소드입니다.(0번 인덱스의 element가 추가되므로
		// 기존의 모든 element들은'기존 인덱스 + 1'의 인덱스 값을 가지게 됩니다.)
		numbers.addFirst(5);
		
		// [0] == 5 / [1] == 10 / [2] == 15 / [3] == 20 / [4] == 30 / [5] == 40
		System.out.println("numbers.addFirst(5); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// remove(index)는 ArrayList객체의 'index'에 해당하는 인덱스를 가진 element를
		// 삭제하는 메소드입니다.
		// ('index'보다 큰 인덱스를 가지고 있던 기존의 element들은 기존의 인덱스에 1을 뺀
		// 인덱스를 가지게 됩니다. 즉, 앞으로 당겨지게 됩니다.)
		System.out.print("return value of numbers.remove(1) = ");
		System.out.println(numbers.remove(1));
		
		// [0] == 5 / [1] == 15 / [2] == 20 / [3] == 30 / [4] == 40 
		System.out.println("numbers.remove(1); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// removeFirst()는 ArrayList객체의 첫 번째 element를 삭제하는 메소드입니다.
		// (모든 element들은 기존의 인덱스에 1을 뺀 인덱스를 가지게 됩니다. 즉, 앞으로 당겨지게 됩니다.)
		System.out.print("return value of numbers.removeFirst() = ");
		System.out.println(numbers.removeFirst());
		
		// [0] == 15 / [1] == 20 / [2] == 30 / [3] == 40 
		System.out.println("numbers.removeFirst(); -> " + numbers);

		//---------------------------------------------------------------------------
		// removeLast()는 ArrayList객체의 마지막 element를 삭제하는 메소드입니다.
		System.out.print("return value of numbers.removeLast() = ");
		System.out.println(numbers.removeLast());
		
		// [0] == 15 / [1] == 20 / [2] == 30 
		System.out.println("numbers.removeLast(); -> " + numbers);
		
		//---------------------------------------------------------------------------
		// get(index)는 ArrayList의 'index'에 해당하는 인덱스를 가진 element를 리턴하는 메소드입니다.
		System.out.println("numbers.get(1); -> " + numbers.get(0));	// 15
		System.out.println("numbers.get(1); -> " + numbers.get(1));	// 20
		System.out.println("numbers.get(1); -> " + numbers.get(2));	// 30
		
		//---------------------------------------------------------------------------
		// size()는 ArrayList의 element 개수를 리턴하는 메소드 입니다.
		System.out.println("numbers.size(); -> " + numbers.size());  // 3
		
		//---------------------------------------------------------------------------
		numbers.addFirst(5);
		numbers.add(2, 5);
		numbers.add(4, 5);
		numbers.addLast(5);
		
		// [0] == 5 / [1] == 15 / [2] == 5 / [3] == 20 / [4] == 5 / [5] == 30 / [6] == 5
		System.out.println("numbers -> " + numbers);
		
		
		//---------------------------------------------------------------------------
		// indexOf(value)는 'value'에 해당하는 값을 가진 element의 인덱스를 리턴하는 메소드입니다.
		System.out.print("numbers.indexOf(5); -> ");
		printArray(numbers.indexOf(5));
				
		System.out.print("numbers.indexOf(60); -> ");
		printArray(numbers.indexOf(60));
		
		//---------------------------------------------------------------------------
		// ArrayList 객체(numbers)의 반복적인 작업을 처리하기 위해서는 ListIterator 객체가 필요합니다.
		// ListIterator 객체를 리턴받기 위해서 listIterator()를 사용합니다.
		// ListIterator는 ArrayList에 포함되어있는 클래스입니다.
		ArrayList.ListIterator li = numbers.listIterator();
		
		// hasNext()는 next()로 리턴된 element의 다음 element가 null이면 false null이 아니면 true를 리턴합니다.
		while(li.hasNext()) {
			// next()가 호출되면 ListIterator 객체의 요소가 순차적으로 리턴됩니다. 
			// 5, 15, 5, 20, 5, 30, 5
			System.out.print(li.next() + " ");			
		}
		
		System.out.println();
		
		// 위의 반복문으로 인해 현재 li객체 내부의 인덱스는 마지막 엘리먼트의 인덱스 + 1입니다.
		
		// hasPrevious()는 li 객체 내부의 인덱스가 가리키는 엘리먼트
		
		while(li.hasPrevious()) {
			// previous()는 li 객체 내부의 인덱스가 가리키는 엘리먼트 이전의 엘리먼트를 순차적으로 호출합니다.
			// 5, 30, 5, 20, 5, 15, 5
			System.out.print(li.previous() + " ");	
		}
		System.out.println();
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.add(35);
			}
			System.out.print(number + " ");
		}
		System.out.println("\n" + numbers);
		
		 
		while(li.hasPrevious()) {
			li.previous();
		}
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.remove();
			}
			System.out.print(number + " ");
		}
		System.out.println("\n" + numbers);
		
	}
	
	public static void printArray(int[] arr) {
		if(arr.length == 0) {
			System.out.println("null");
		} else {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(", ");
			}
		}
			System.out.println();
		}
	}

}
