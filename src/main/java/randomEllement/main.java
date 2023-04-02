package randomEllement;

import java.util.*;

public class main {
    public static void main(String[] args) {

//        myRandomInteger();
//        randomWithRepeat();
//        randomWithoutRepeat();
        randomWithoutRandom();
//        getTargetObject();


    }

    private static void getTargetObject() {
        List<Cat> list = Arrays.asList(
                new Cat("Рома", 31),
                new Cat("Борис", 7),
                new Cat("Александр", 18),
                new Cat("Виктор", 52),
                new Cat("Инокентий", 85),
                new Cat("Алексей", 12),
                new Cat("Михаил", 15),
                new Cat("Иван", 21),
                new Cat("Василий", 22),
                new Cat("Игорь", 30),
                new Cat("Владимир", 27)
        );
        List<Cat> listNew = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int targetSource = list.get(i).getAge();
            if (  targetSource > 20 && targetSource < 32) {
                listNew.add(list.get(i));
            }
        }
        System.out.println(listNew);
    }
    private static void randomWithoutRandom() {
        List<Cat> list = Arrays.asList(
                new Cat("Рома", 31),
                new Cat("Борис", 7),
                new Cat("Александр", 18),
                new Cat("Виктор", 52),
                new Cat("Инокентий", 85),
                new Cat("Алексей", 12),
                new Cat("Михаил", 15),
                new Cat("Иван", 21),
                new Cat("Василий", 22),
                new Cat("Игорь", 30),
                new Cat("Владимир", 27)
        );
        Collections.shuffle(list);
        int random = 2;
        List randomSeries = list.subList(0, random);
        System.out.println(randomSeries);
    }
    private static void randomWithoutRepeat() {
        Random rnd = new Random();
        List<Cat> list = new ArrayList<>(Arrays.asList(  //<- Отсюда будем копировать
                new Cat("Barsik", 3),
                new Cat("Murzik", 7),
                new Cat("Manya", 8),
                new Cat("Boris", 4),
                new Cat("Snegok", 5),
                new Cat("Egor", 10)

        ));
        List<Cat> listNew = new ArrayList<>();  // <- сюда будем копировать
        int number = 2;
        Cat temp;
        do {
            for (int i = 0; i < number; i++) {
                int randomNumber = rnd.nextInt(list.size());
                Cat randomElement = list.get(randomNumber);
                listNew.add(randomElement);
                temp = randomElement;
//                System.out.println(list);
            }
                System.out.println(listNew);
        } while (listNew.get(0) == listNew.get(1) && listNew.size() <= number);
    }
    private static void randomWithRepeat() {
        Random rnd = new Random();
        List<Cat> list = new ArrayList<>(Arrays.asList(
                new Cat("Barsik", 3),
                new Cat("Murzik", 7),
                new Cat("Manya", 8),
                new Cat("Boris", 4),
                new Cat("Snegok", 5),
                new Cat("Egor", 10)

        ));
        List<Cat> listNew = new ArrayList<>();
        int number = 2;
        for (int i = 0; i < number; i++) {
            int randomNumber = rnd.nextInt(list.size());
            Cat randomElement = list.get(randomNumber);
            listNew.add(randomElement);

        }
        System.out.println(list);
        System.out.println(listNew);
    }
    private static void myRandomInteger() {
        List list = Arrays.asList(1,3,5,7,9);
        Random rnd = new Random();

        int one = 0;
        int three = 0;
        int five = 0;
        int seven = 0;
        int nine = 0;
        for (int i = 0; i < 1_000_000; i++) {
            int randomElement = (int) list.get(rnd.nextInt(list.size()));
            if(randomElement == 1) {
                one++;
            } else if (randomElement == 3) {
                three++;
            } else if (randomElement == 5) {
                five++;
            } else if (randomElement == 7) {
                seven++;
            } else nine++;
        }
        System.out.print("едениц: " + one + "\nтроек: " + three + "\nпятерок: " + five + "\nсемерок: " + seven+ "\nдевяток: " + nine);
    }

}
