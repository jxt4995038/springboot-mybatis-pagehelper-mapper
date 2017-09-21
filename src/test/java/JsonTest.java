import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.jxt.domain.PolistUser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/18 0018.
 */
public class JsonTest {

//    public static void main(String[] args){
//        List<PolistUser> usersList = new ArrayList<PolistUser>();
//        for (int i = 0; i < 5; i++) {
//            PolistUser user = new PolistUser();
//            user.setId(i+1);
//            user.setUserName("aa");
//            usersList.add(user);
//        }
//        //对象集合转string
//        String jsonString = objectToStr(usersList);
//        //string 转对象集合
//        List<PolistUser> polistUserList = strToObject(jsonString,PolistUser.class);
//
//        System.out.println(jsonString);
//        System.out.println(polistUserList.get(0).getUserName());
//
//    }
//    public static String objectToStr(List<PolistUser> userList){
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = "";
//        try {
//            jsonString = objectMapper.writeValueAsString(userList);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        return jsonString;
//    }
//
//    public static <T> List<T> strToObject(String jsonStr,Class<T> object){
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<T> objectList = new ArrayList<T>();
//        try {
//            JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, object);
//            objectList = (List<T>) objectMapper.readValue(jsonStr, javaType);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return objectList;
//    }

}
