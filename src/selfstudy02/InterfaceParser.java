package day0110;

public class InterfaceParser {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");//ParserManagerŬ������ static �޼ҵ��� getParser�� ��ü�������� �ٷ� "XML"�� �־ ȣ��
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
interface Parseable{
	public void parse(String fileName);
}
class ParserManager{
//����Ÿ���� Parseable�� �������̽��̴�
//����Ÿ���� �������̽���� ����, �޼��尡 �ش� ������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� ���� �ǹ�.	
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}
class XMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed");
	}
}
class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed");
	}
}