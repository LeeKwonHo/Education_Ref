package animal;

import animal.ext.*;

public class ZookeeperTest {

	public static void main(String[] args) {		
		Zookeeper zookeeper = new Zookeeper();
		//사육사가 메소드를 불러옴
		zookeeper.feed(new Animal());
		zookeeper.feed(new Tiger());
		zookeeper.feed(new Horse());
		zookeeper.feed(new Elephant());
		zookeeper.feed(new Rabbit());
		
	}

}
