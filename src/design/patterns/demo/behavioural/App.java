package design.patterns.demo.behavioural;

public class App {

	public static void main(String args[]) {
		
		Visitor obj = new GamePlayer();
		
		Visitable game1 = new Cricket();
		
		game1.accept(obj);
		
//		Visitor visitor = new GamePlayer();
//		
//		Visitable v1 = new Cricket();
//		v1.accept(visitor);
//		Visitable v2 = new Hockey();
//		v2.accept(visitor);
//		Visitable v3 = new Football();
//		v3.accept(visitor);

	}

}
