package animal;

import animal.ext.*;

public class ZookeeperTest {

	public static void main(String[] args) {
		Zookeeper zookeeper = new Zookeeper();
		zookeeper.feed(new Tiger());
		zookeeper.feed(new Horse());
		zookeeper.feed(new Elephant());
		zookeeper.feed(new Rabbit());
		
		
	}

}
