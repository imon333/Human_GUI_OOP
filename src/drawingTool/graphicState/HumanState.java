package drawingTool.graphicState;

import drawingTool.Scene;

public class HumanState extends State {	
private static final HumanState INSTANCE = new HumanState();
	
	private HumanState() {
		context = Scene.getInstance();
	}
	
	public static HumanState getInstance() {
		return INSTANCE;
	}

	@Override
	public State drawghost() {
		return GhostState.getInstance();
	}

	@Override
	public State drawHead() {
		return HeadState.getInstance();
	}

	@Override
	public State drawHuman() {
		return INSTANCE;
	}

}
