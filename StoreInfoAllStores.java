import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StoreInfoAllStores {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws org.json.simple.parser.ParseException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        JSONParser parser = new JSONParser();
       
        JSONArray tmpArr = (JSONArray) parser.parse(new FileReader("C:/Users/bethc/Downloads/stores_detail.json"));

        for (int i = 0; i < tmpArr.size(); i++) {
            JSONObject tmpObj = (JSONObject) tmpArr.get(i);
            //Get Infomation of the store
            System.out.println("店名: " + tmpObj.get("name"));
            System.out.println("位置: ");
            JSONObject o = (JSONObject) tmpObj.get("position");
            System.out.println("地址: " + o.get("address"));
            System.out.println("緯度: " + o.get("latitude"));
            System.out.println("經度: " + o.get("longitude"));

            System.out.println("電話: " + tmpObj.get("phone"));
            //System.out.println("store_description: " + tmpObj.get("store_description"));
            //System.out.println("order_description: " + tmpObj.get("order_description"));

            //Get array elements
            //System.out.println("種類: ");
            JSONArray rayajson = (JSONArray) tmpObj.get("type");
            for (int c = 0; c < rayajson.size(); c++) {
                String type = (String) rayajson.get(c);
                //System.out.println(type);
            }
            //Get array elements. Split array element, and check the menu
            //System.out.println("菜單: ");
            rayajson = (JSONArray) tmpObj.get("menu");
            for (int c = 0; c < rayajson.size(); c++) {
                JSONObject menu = (JSONObject) rayajson.get(c);
                //System.out.println("品名: " + menu.get("name"));
                //System.out.println("價格: " + menu.get("price"));
            }

            //System.out.println("營業時間: ");
            JSONObject obj = (JSONObject) tmpObj.get("business_time");
            //System.out.println("一: ");
            JSONObject ob = (JSONObject) obj.get("mon");
            //System.out.println("start: " + ob.get("start"));
            //System.out.println("end: " + ob.get("end"));

            //System.out.println("二: ");
            ob = (JSONObject) obj.get("tue");
            //System.out.println("start: " + ob.get("start"));
            //System.out.println("end: " + ob.get("end"));

            //System.out.println("三: ");
            ob = (JSONObject) obj.get("wed");
            //System.out.println("start: " + ob.get("start"));
            //System.out.println("end: " + ob.get("end"));

            //System.out.println("四: ");
            ob = (JSONObject) obj.get("thu");
            //System.out.println("start: " + ob.get("start"));
            //System.out.println("end: " + ob.get("end"));

            //System.out.println("五: ");
            ob = (JSONObject) obj.get("fri");
            //System.out.println("start: " + ob.get("start"));
            //System.out.println("end: " + ob.get("end"));

            //System.out.println("六: ");
            ob = (JSONObject) obj.get("sat");
            //System.out.println("start: " + ob.get("start"));
            //System.out.println("end: " + ob.get("end"));

            //System.out.println("日: ");
            ob = (JSONObject) obj.get("sun");
            //System.out.println("start: " + ob.get("start"));
            //System.out.println("end: " + ob.get("end"));
        }

     
    }

}
