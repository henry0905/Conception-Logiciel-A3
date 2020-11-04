package fr.ensma.a3.ia.jeupersonnages.elements.groupement;

public class ElemNotInTroupeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public ElemNotInTroupeException() {
		super();
	}
	
	public ElemNotInTroupeException(final String m) {
		msg = m;
	}
	
	public String getMsg() {
		return msg;
	}
	
	@Override
	public String toString() {
		return msg + " : " + super.toString();
	}
}	
