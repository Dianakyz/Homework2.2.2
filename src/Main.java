public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59f);
        Flower chrisantema = new Flower("Хризантема", null, null, 15f, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9f, 1);
        Flower gipsofila = new Flower("Гипсофила", null, "Турция", 19.5f, 10);

        flowerInfo(rose);
        flowerInfo(chrisantema);
        flowerInfo(pion);
        flowerInfo(gipsofila);

        System.out.println("Информация о составе букета: ");

        printCostofFlowers(
                rose,rose,rose, chrisantema, chrisantema, chrisantema, chrisantema, chrisantema, gipsofila
        );


    }

    public static void flowerInfo(Flower flower){
        System.out.println("Название цветка: " + flower.getName() + ". Цвет цветка: " + flower.getFlowerColor() + ". Страна происхождения: " + flower.getCountry() + ". Стоимость: " + flower.getCost() + " рублей. Срок стояния цветка: " + flower.lifeSpan + " дней.");
    }

    public static void printCostofFlowers(Flower... flowers){
        float totalCost = 0f;
        int minLifeSpin = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpin){
                minLifeSpin = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            flowerInfo(flower);
        }
        totalCost = (float) (totalCost * 1.1);
        System.out.println("Стоимость букета: " + totalCost + " рублей.");
        System.out.println("Срок стояния: " + minLifeSpin + " дней.");
        }
    }
