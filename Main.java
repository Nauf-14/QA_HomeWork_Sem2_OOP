// Реализовать класс Market и все методы, которые он обязан реализовывать. 
// Методы из интерфейса QueueBehaviour, имитируют работу очереди,
// MarketBehaviour – помещает и удаляет человека из очереди,
// метод update – обновляет состояние магазина (принимает и отдает заказы).


public class Main {
    public static void main(String[] args) {
        // Пример использования класса Market
        Market market = new Market();

        // Добавление людей в очередь
        market.enqueue(new Person("Клинт Бартон"));
        market.enqueue(new Person("Хоуп ван Дайн"));
        market.enqueue(new Person("Гамора"));

        // Принятие заказов
        market.acceptOrder("Заказ1");
        market.acceptOrder("Заказ2");

        // Обработка заказов и очереди
        market.fulfillOrder();
        market.dequeue();

        // Обновление состояния магазина
        market.update();
    }
}