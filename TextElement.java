package model;

public class TextElement extends java.lang.Object implements Element {
	private String text;

	public TextElement(String text) {
		this.text = text;
	}

	public String genHTML(int indentation) {
		String returnText = "";
		for (int i = 0; i <= indentation - 1; i++) {
			returnText += " ";
		}
		returnText += text;
		return returnText;
	}
}
