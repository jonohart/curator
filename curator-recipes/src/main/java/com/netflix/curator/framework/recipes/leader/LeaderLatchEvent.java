package com.netflix.curator.framework.recipes.leader;

import com.netflix.curator.framework.CuratorFramework;

public class LeaderLatchEvent {
	private LeaderLatch latch;
	private CuratorFramework client;
	private boolean hasLeadership;
	
	public LeaderLatchEvent(LeaderLatch latch, CuratorFramework client, boolean hasLeadership) {
		this.latch = latch;
		this.client = client;
		this.hasLeadership = hasLeadership;
	}
	
	public LeaderLatch getLatch(){
		return latch;
	}
	
	public CuratorFramework getClient(){
		return client;
	}

	public boolean hasLeadership(){
		return hasLeadership;
	}
	
}
