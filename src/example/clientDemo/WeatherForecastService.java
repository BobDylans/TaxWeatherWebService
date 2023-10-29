package example.clientDemo;

import example.clientDemo.WeatherWebServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class WeatherForecastService {

    public static void main(String[] args) throws RemoteException, ServiceException {
        System.out.println("天气预报功能已经启动,请输入你想要查看的城市名称");
        String result[] = QueryWeatherForecastInfo("杭州");
        for (String r : result)
            System.out.println(r);
        System.out.println("天气预报功能已经结束");
    }

    public static String[] QueryWeatherForecastInfo(String cityName) throws RemoteException, ServiceException {
        WeatherWebServiceLocator locator = new WeatherWebServiceLocator();

        // 调用xxLocator对象的getXXPort()方法生成xxSoapBindingStub对象
        WeatherWebServiceSoap_BindingStub stud = (WeatherWebServiceSoap_BindingStub) locator.getWeatherWebServiceSoap();

        //输入想要查询的城市名称
        Scanner scan=new Scanner(System.in);
        String theCityName=scan.next();

        // 输出当天的天气状况
        String[] weather = stud.getWeatherbyCityName(theCityName);

        return weather;
    }

}