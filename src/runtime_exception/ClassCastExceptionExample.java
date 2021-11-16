package runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
	Dog dog = new Dog();
	changeDog(dog);
	Cat cat = new Cat();
	changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			try {
				Cat cat = (Cat) animal;//ClassCastException
			}catch(ClassCastException e) {
				System.out.println("입력된 객체가 잘못되었습니다.");
			}
		}
	}
}
//하나의 파일에 여러 클래스가 있으면 properties > bin으로 확인하면
//파일이 클래스명대로 생성된 것 확인 가능

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}