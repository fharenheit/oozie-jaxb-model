package io.datadynamics.shared.model.oozie;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * XML을 포맷팅하는 유틸리티. 이 포맷팅 유틸리티는 DOM 파서를 기반으로 동작한다.
 */
public class XmlFormatter {

    /**
     * XML을 파싱한다.
     */
    private static Document parse(String xml) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xml));
            return db.parse(is);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 포맷팅되지 않은 XML을 포맷팅한다. 포맷팅시 width는 80, 들여ㅅ쓰기는 2를 적용한다.
     *
     * @param unformattedXml 포맷팅되지 않은 XML
     * @return 포맷팅된 XML
     */
    public static String format(String unformattedXml) {
        try {
            final Document document = parse(unformattedXml);

            OutputFormat format = new OutputFormat(document);
            format.setLineWidth(80);
            format.setIndenting(true);
            format.setIndent(2);
            Writer out = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(out, format);
            serializer.serialize(document);

            return out.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
