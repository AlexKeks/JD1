package by.htp.bookStore.dao.impl.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.bookStore.domain.BookElement;

public class BookHendler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("SAX Parser found root element");
	}

	@Override
	public void endDocument() throws SAXException {

	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		BookElement currentElement = BookElement.valueOf(qName.toUpperCase());

		switch (currentElement) {
		case BOOK:
			System.out.println("Found : " + qName);
			break;
		case PAGES:
			System.out.println("Found : " + qName);
			break;
		case TITLE:
			System.out.println("Found : " + qName);
			break;

		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

	}

}
