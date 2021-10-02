package day0110;

public class InterfaceParser {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");//ParserManager클래스의 static 메소드인 getParser를 객체생성없이 바로 "XML"을 넣어서 호출
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
interface Parseable{
	public void parse(String fileName);
}
class ParserManager{
//리턴타입이 Parseable인 인터페이스이다
//리턴타입이 인터페이스라는 것은, 메서드가 해당 잍너페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미.	
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