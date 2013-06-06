package com.netflix.curator.framework.recipes.leader;

import com.netflix.curator.framework.CuratorFramework;

public interface LeaderLatchListener {
	public void leaderLatchEvent(CuratorFramework client, LeaderLatchEvent event);
}
