
package com.solidprinciple.lsm;

import java.util.ArrayList;
import java.util.List;

public class BirdFlyingWatcher {
	
	public void trackFlyingActivity()
	{
	   List<Bird> birds = new ArrayList<>(); 
	      Bird pigeon = new Parrot(); 
	      Bird penguin = new Penguin();
	      birds.add(penguin);
	      birds.add(pigeon);
	      birds.forEach(bird->{
	         bird.fly();
	      });
	}

}

