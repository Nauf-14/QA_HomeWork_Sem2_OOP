import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Person> queue = new LinkedList<>();
    private Queue<String> orders = new LinkedList<>();

    @Override
    public void enqueue(Person person) {
        queue.add(person);
        System.out.println("Добавлен в очередь: " + person.getName());
    }

    @Override
    public Person dequeue() {
        Person person = queue.poll();
        if (person != null) {
            System.out.println("Убран из очереди: " + person.getName());
        } else {
            System.out.println("Очередь пуста");
        }
        return person;
    }

    @Override
    public int getQueueSize() {
        return queue.size();
    }

    @Override
    public void acceptOrder(String order) {
        orders.add(order);
        System.out.println("Принят заказ: " + order);
    }

    @Override
    public String fulfillOrder() {
        String order = orders.poll();
        if (order != null) {
            System.out.println("Заказ выполнен: " + order);
        } else {
            System.out.println("Нет заказов для выполнения");
        }
        return order;
    }

    @Override
    public void update() {
        // Логика обновления состояния магазина
    }
}
