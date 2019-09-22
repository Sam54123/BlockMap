package de.piegames.blockmap.world;

import java.util.List;
import java.util.Optional;

public class ServerMetadata {
	/** This will be used in the future to keep track of old serialized files. */
	int							version	= 0;
	public Optional<String>		name;
	public Optional<String>		description;
	public Optional<String>		ipAddress;
	public Optional<String>		iconLocation;
	public List<ServerLevel>	levels;

	public static class ServerLevel {
		public String	name;
		public String	path;

		public ServerLevel() {

		}

		public ServerLevel(String name, String path) {
			this.name = name;
			this.path = path;
		}
	}
}