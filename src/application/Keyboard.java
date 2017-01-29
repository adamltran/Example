package application;

import javafx.scene.input.KeyEvent;

public class Keyboard {

	private boolean A = false;
	private boolean D = false;
	private boolean S = false;
	private boolean W = false;
	private boolean SPACE = false;


	public Keyboard(){
	}

	public boolean isA() {
		return A;
	}

	public void setA(boolean a) {
		A = a;
	}

	public boolean isD() {
		return D;
	}

	public void setD(boolean d) {
		D = d;
	}

	public boolean isS() {
		return S;
	}

	public void setS(boolean s) {
		S = s;
	}

	public boolean isW() {
		return W;
	}

	public void setW(boolean w) {
		W = w;
	}

	public boolean isSPACE() {
		return SPACE;
	}

	public void setSPACE(boolean sPACE) {
		SPACE = sPACE;
	}

	public void handlePressed(KeyEvent e){
		switch(e.getCode()){
		case A:
			A = true;
			break;
		case D:
			D = true;
			break;
		case S:
			S = true;
			break;
		case W:
			W = true;
			break;
		default:
			break;
		}
	}
	public void handleReleased(KeyEvent e){
		switch(e.getCode()){
		case A:
			A = false;
			break;
		case D:
			D = false;
			break;
		case S:
			S = false;
			break;
		case W:
			W = false;
			break;
		default:
			break;
		}
	}
}


