package drawingTool.graphicState;

import drawingTool.Scene;

public abstract class State {
	
	protected Scene context ;
	
	protected static HumanState human;
	protected static HeadState head ;
	protected static GhostState body ;
	
	public abstract State drawHuman();
	public abstract State drawHead(); 
	public abstract State drawghost();

}
