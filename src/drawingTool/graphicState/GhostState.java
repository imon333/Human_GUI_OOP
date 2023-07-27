package drawingTool.graphicState;

import drawingTool.Scene;

public class GhostState extends State{
private static final GhostState INSTANCE = new GhostState();
	
	private GhostState() {
		
	}
	
	public static GhostState getInstance() {
		return INSTANCE;
	}

	@Override
	public State drawghost() {
		return INSTANCE;
	}
	

	@Override
	public State drawHead() {
		return HeadState.getInstance();
	}

	@Override
	public State drawHuman() {
		return HumanState.getInstance();
	}
	
}
