package drawingTool;

import java.awt.Color;
import java.awt.PageAttributes.OriginType;
import java.util.ArrayList;

import drawingTool.graphicState.GhostState;
import drawingTool.graphicState.HeadState;
import drawingTool.graphicState.HumanState;
import drawingTool.graphicState.State;

public class Scene {
	private static final Scene INSTANCE = new Scene();
	private ArrayList<Human> humans; // aggregate
	private int scale;
	private int n;
	private static State graphicState = HumanState.getInstance();

	public void setN(int n) {
		this.n = n;
		humans = new ArrayList<Human>();
		init(n);

	}

	public Scene() {
		scale = 2;
		humans = new ArrayList<Human>();
		init(scale);
	}
	
	public static Scene getInstance() {
		return INSTANCE;
	}

	public void drawAt() {
		for (Human i : humans) {
			if(graphicState.getClass() == HumanState.class) {
				i.draw();
			}else if(graphicState.getClass() == HeadState.class) {
				i.getMyHead().draw();
			}else if(graphicState.getClass() == GhostState.class) {
				i.getMyBody().draw();
			}
			
		}
	}

	public static State getGraphicState() {
		return graphicState;
	}

	public static void setGraphicState(State graphicState) {
		Scene.graphicState = graphicState;
	}

	
	private void init(int scale) {
		for (int i = 1; i <= 10; i++) {
			boolean intersectFound = false;

			int x = RandomNumber.between(110, 510);
			int y = RandomNumber.between(100, 630);
			// int scale = RandomNumber.between(1,2);

			if (humans.isEmpty()) {
				humans.add(new Human(x, y, scale));
			} else {
				Human newOne = new Human(x, y, scale);

				for (Human check : humans) {
					intersectFound = intersectFound || check.intersects(newOne);
				}

				if (!intersectFound) {
					humans.add(newOne);
					
				}
			}
		}
	}

	public void changeColorAll(Color c) {

		for (Human i : humans) {
			i.getMyBody().setColor(c);
			i.getMyHead().setColor(c);

		}

	}
}
