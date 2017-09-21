import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
public class ReadXmlTest{
    public static  void main(String[] args){
        readXml();
    }
    public static void  readXml(){
        SAXReader reader = new SAXReader();
        try {
//            File file = new File("D:/PolistUserMapper.xml");
            Document document = reader.read(new File("D:/PolistUserMapper.xml"));
            //获取根节点
            Element rootElement = document.getRootElement();
            List elements = rootElement.elements();
            for (Iterator it = elements.iterator();it.hasNext();){
                Element element = (Element)it.next();
                List attributes = element.attributes();
                for (int i = 0; i < attributes.size(); i++) {
                    Attribute attribute = (Attribute) attributes.get(i);
                    System.out.println(attribute.getName()+"==="+attribute.getText());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
