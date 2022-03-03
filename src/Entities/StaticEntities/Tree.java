package Entities.StaticEntities;

import java.awt.Color;
import java.awt.Graphics;

import Dialogs.Dialog;
import GFX.Asset;
import Main.Handler;
import Tiles.Tile;

public class Tree extends StaticEntity{
	
	// CONSTRUCTOR 
	public Tree(Handler handler,float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT*2);
		
		// COLLISION BOX
		bounds.x = 10;
		bounds.y = 0;
		bounds.width = width - 20;
		bounds.height = (int) (height - height / 1.5f);
	}

	// UPDATE TREE
	@Override
	public void update() {
		
	}

	// RENDER TREE
	@Override
	public void render() {
		handler.getGraphics().setColor(Color.red);
		handler.getGraphics().fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()) , (int) (y + bounds.y), width, height);
		handler.getGraphics().drawImage(Asset.p_friend3_idle, (int) (x - handler.getGameCamera().getxOffset()), (int) y, width, height, null);
	}

	// CHECK IS SOLID
	@Override
	public Boolean isSolid() {
		return false;
	}

	@Override
	public Boolean isChangeState() {
		return true;
	}

	@Override
	public Boolean isNpc() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDialogEvent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dialog getDialog() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
