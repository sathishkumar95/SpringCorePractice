import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Test {

    public static void main(String [] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        Items item = new Items("milk101",25.0);
        Items item2 = new Items("curd102",30);

        ArrayList<Items> list = new ArrayList<Items>();
        list.add(item);
        list.add(item2);

        Orders order = new Orders();
        order.setItems(list);

        OrderExecuteProcessor orderExecuteProcessor = (OrderExecuteProcessor)context.getBean("orderProcessExecutor");
        orderExecuteProcessor.setOrder(order);

        orderExecuteProcessor.startPaymentProcess();

    }
}
